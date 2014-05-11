package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import lexer.Lexer;
import lexer.LexerException;
import node.Token;


public class Main {
     protected static Token tk = null;
     
     public static void main(String[] arguments) {
          try {  
                 File srcPath = new File("src\\doc\\teste.txt");
                 FileInputStream entrada = new FileInputStream(srcPath);
                 Lexer lex =  new Lexer( new PushbackReader(new InputStreamReader(entrada), 1024));
                 analiseLexica(lex);   
          }
          catch(Exception e) {
                  System.out.println(e.getMessage());
          }
     }
    
     
     public static void analiseLexica(Lexer lexer) throws LexerException, IOException{
         tk = lexer.next();
         while(!tk.getText().equals("")) {
             if(!tk.getText().equals(" ")){
                 System.out.println("["+tk.getLine()+","+tk.getPos()+"] "+tk.getText()); 
             }
             analiseLexica(lexer);
         }
         
     }
     
}