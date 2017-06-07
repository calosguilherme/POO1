/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercarquivo;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class ExercArquivo {
    public static void main(String[] args) {
        // TODO code application logic here
        	int i;
    ArrayList<String> lines = new ArrayList<String>();

    lines = TextReader.readFile("teste.txt"); 
    for(i=0; i< lines.size(); i++){
            System.out.println(lines.get(i));

        }

    }
}
