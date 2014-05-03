package main;

import parser.*;
import lexer.*;
import node.*;

import java.io.*;

import org.sablecc.sablecc.lexer.Lexer;

public class Compiler {
    
     public static void main(String[] arguments) {
         try {
               System.out.println("Type an arithmetic expression:");
            
               // Create a Parser instance.
               Lexer l = new Lexer( new PushbackReader( new InputStreamReader(System.in), 1024));
            
         }
         catch(Exception e) {
               System.out.println(e.getMessage());
         }
     }
}