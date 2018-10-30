import main.*
import java.io.FileInputStream

fun main(args: Array<String>) {
    val input = FileInputStream("src/tst.txt")
    val p = Parser()
    var t: Tree = p.parse(input)
    var viz = TreeVisualizer()
    viz.showTree(t,"src/Ex.png")
    print("END")
}