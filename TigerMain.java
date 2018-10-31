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
        ANTLRInputStream input = new ANTLRInputStream(is); 
        TigerLLKLexer lexer = new TigerLLKLexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        TigerLLKParser parser = new TigerLLKParser(tokens); 
        ParseTree tree = parser.tigerprogram(); // start parse walk at non-terminal tigerprogram
	// tigerprogram() calls the production rule specified in the grammar
	TigerVisitor tiger = new TigerVisitor();
	tiger.visit(tree);

    }
}

