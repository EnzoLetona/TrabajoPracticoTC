package trabajopractico;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio del programa");
        TablaSimbolos.getInstance().addContexto();
        
        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("trabajopractico/src/programa.txt");
        
        // create a lexer that feeds off of input CharStream
        programaLexer lexer = new programaLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        programaParser parser = new programaParser(tokens);
                
        // create Listener
       programaBaseListener escucha = new MiListener();
//
       // // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        // parser.s();
        ParseTree tree =  parser.programa();
        System.out.println(tree);
        System.out.println("fin del programa");

        
       // TablaSimbolos tabla = TablaSimbolos.getInstance();
       // tabla.addContexto();
       // MiId midi = new MiId();
       // tabla.addId(midi);
//
       // MiId midi2 = new MiId();
       // midi2.setToken("salsa");
       // tabla.addId(midi2);
       //
       // MiId midi3 = new MiId();
       // midi3.setToken("shapato");
       // tabla.addId(midi3);
//
       // tabla.getTabla();
    }
}
