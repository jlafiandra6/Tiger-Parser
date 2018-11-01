import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class TigerMain {

    public static void main(String[] args) throws Exception {

        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        CharStream reader = CharStreams.fromStream(is);
        TigerLLKLexer lexer = new TigerLLKLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TigerLLKParser parser = new TigerLLKParser(tokens);
        ParseTree tree = parser.tigerprogram(); // start parse walk at non-terminal tigerprogram
	// tigerprogram() calls the production rule specified in the grammar
	TigerLLKBaseVisitor<Value> tiger = new TigerLLKBaseVisitor<Value>();
	tiger.visit(tree);
	System.out.println(tree.toStringTree(parser));
    }
}
