import antlr4.LogicLexer;
import antlr4.LogicParser;
import org.antlr.v4.runtime.*;

public class App
{
    public static void main( String[] args )
    {
        ANTLRInputStream inputStream = new ANTLRInputStream("!a&a&a");
        LogicLexer logicLexer = new LogicLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(logicLexer);
        LogicParser logicParser = new LogicParser(commonTokenStream);

        LogicParser.ExpressionContext fileContext = logicParser.expression();
        LogicVisitor visitor = new LogicVisitor();
        visitor.visit(fileContext);

        char c = 's';
    }
}