package ind.gopinnath;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        CharStream charStream = CharStreams.fromFileName("./src/main/cobol/welcome.cobol");
        Cobol85Lexer lexer = new Cobol85Lexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        Cobol85Parser parser = new Cobol85Parser(tokenStream);
        ParseTree parseTree = parser.compilationUnit();

        System.out.println(parseTree);
    }
}
