package postfix;
import postfix.parser.*;
import postfix.lexer.*;
import postfix.node.*;

import java.io.*;

import org.sablecc.sablecc.lexer.Lexer;

public class Compiler {
    
     public static void main(String[] arguments) {
         try {
               System.out.println("Type an arithmetic expression:");
            
               // Create a Parser instance.
               Lexer l = new Lexer( new PushbackReader( new InputStreamReader(System.in), 1024)));
            
               // Parse the input.
               Start tree = l;
            
               // Apply the translation.
               tree.apply(new Translation());
         }
         catch(Exception e) {
               System.out.println(e.getMessage());
         }
     }
}