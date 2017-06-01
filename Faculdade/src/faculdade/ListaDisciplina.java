/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author lucas
 */
public class ListaDisciplina extends HashSet<Disciplina>{
    public void addDisciplina(Disciplina d){
        this.add(d);
    }
    public void imprimeDisciplina(){
//        Iterator<Disciplina> iterator = this.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next().getNome() + " ");
//        }
//        System.out.println();
        for(Disciplina D: this){
            System.out.println(D.getNome());
        }
    }
}
