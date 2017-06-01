/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class ListaAluno extends TreeMap<String,String>{
    
    public void addAluno(Aluno a){
        this.put(a.getMatricula(), a.getNome());
    }
    
    public void imprimeAluno(){
        Iterator iterator = this.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.print( "(" + entry.getKey() + ": " + 
                              entry.getValue() + "), " );
        }
        System.out.println();
        
    }

  
}
