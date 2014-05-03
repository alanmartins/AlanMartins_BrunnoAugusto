package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import org.sablecc.sablecc.lexer.Lexer;
import org.sablecc.sablecc.lexer.LexerException;
import org.sablecc.sablecc.node.Token;

public class Compiler {
    
     public static void main(String[] arguments) {
          try {
        
             FileInputStream file = new FileInputStream(new File("C:\\Users\\Alan Martins\\Documents\\GitHub\\AlanMartins_BrunnoAugusto\\src\\doc\\teste.txt"));
             Lexer lex =  new Lexer( new PushbackReader(new InputStreamReader(file)));

             analiseLexica(lex);
             
          }
          catch(Exception e) {
           System.out.println(e.getMessage());
          }
     }
     
     
     public static void analiseLexica(Lexer lexer) throws LexerException, IOException{
       
         System.out.println(lexer.next());
         
     }
     
}