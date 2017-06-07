/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercarquivo;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class TextReader {
    public static  ArrayList<Cliente> readFile(String fileName) {

        ArrayList<Cliente> linhas = new ArrayList<Cliente>();
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader in = new BufferedReader(reader);
            Cliente e = new Cliente();
            String string;
            
            while ((string = in.readLine()) != null) {
                e.setNome(string);                
                linhas.add(e);

            }
            
            in.close();
        } catch (IOException e) { 
            e.printStackTrace(); 
        }
           return linhas;
    }
}

