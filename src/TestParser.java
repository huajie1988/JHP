import jhp.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class TestParser {
    public static void main(String[] args) throws Exception {
        String phpCode = "<?php echo 'Hello';";
        CharStream input = CharStreams.fromString(phpCode);
        JhpLexer lexer = new JhpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JhpParser parser = new JhpParser(tokens);
        ParseTree tree = parser.phpFile();
        System.out.println(tree.toStringTree(parser));
    }
}