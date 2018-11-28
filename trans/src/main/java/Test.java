import antlr.PrefixGrammarParser;
import antlr.PrefixGrammarLexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {
    public static void main(String[] args) {
        PrefixGrammarLexer lexer = new PrefixGrammarLexer(CharStreams.fromString("def $ a 2 def a 4 def a + b 6 if > 2 3 (print 3) (if > 4 - 7 2 (print + 3 4))"));
//        System.out.println(lexer.getAllTokens());

        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PrefixGrammarParser parser = new PrefixGrammarParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);


        System.out.println(parser.start().sb.toString());
    }
}
