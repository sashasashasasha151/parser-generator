package main

data class Tree(
        val nodeName: String,
        val children: List<Tree> = emptyList()
)