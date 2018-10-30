package main

import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.mutNode
import guru.nidi.graphviz.model.MutableNode
import java.io.File


class TreeVisualizer {
    var ii:Int = 0

    private fun makeNodes(tree: Tree):MutableNode {
        val a = mutNode(ii.toString()).add(Label.of(tree.node))
        for (child in tree.children) {
            ii++
            a.addLink(makeNodes(child))
        }
        if(tree.children.isEmpty()) {
            if(tree.node == "e") {
                a.add(Color.GRAY)
            } else {
                a.add(Color.RED)
            }
        }
        return a
    }

    private fun makeGraph(tree: Tree) = mutGraph("New graph").setDirected(true).add(makeNodes(tree))

    fun showTree(tree: Tree, path: String) = Graphviz.fromGraph(makeGraph(tree)).width(2000).render(Format.PNG).toFile(File(path))
}