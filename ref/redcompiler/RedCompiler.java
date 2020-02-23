/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package redcompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import lexer.Lexer;
import parser.Parser;
import java.io.File;   
import java.io.InputStream;  

/**
 *
 * @author amanuel
 */
public class RedCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f=new File("C:/Users/ASUS/Documents/2019-2020 (2nd Sem)/CMSC 129/FLOPOL/RedCompiler/RedCompiler/dist/MyTest.tst");
        InputStream i = new FileInputStream(f);
        System.setIn(i);
        Lexer lexer = new Lexer();
        Parser parser = new Parser(lexer);
        parser.start();
    }
    
}
