package main

import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.attribute.Rank
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.mutNode
import guru.nidi.graphviz.model.MutableNode
import java.io.File


class TreeVisualizer {
    private var id: Int = 0

    private fun makeNodes(tree: Tree): MutableNode {
        val node = mutNode(id.toString()).add(Label.of(tree.nodeName))

        for (child in tree.children) {
            id++
            node.addLink(makeNodes(child))
        }

        if (tree.children.isEmpty()) {
            node.add(if (tree.nodeName == "eps") Color.GRAY else Color.RED)
        }
        return node
    }

    private fun makeGraph(tree: Tree) =
            mutGraph("New graph")
                    .setDirected(true)
                    .add(makeNodes(tree))

    fun showTree(tree: Tree, path: String) =
            Graphviz
                    .fromGraph(makeGraph(tree))
                    .width(2000)
                    .render(Format.PNG)
                    .toFile(File(path))
}