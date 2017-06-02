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
        for(Disciplina d: this){
            System.out.println(d.getCodigo()+ " " + d.getNome());
        }
    }
    public Disciplina getDiscCod(String cod){
        for(Disciplina d: this){
            if(d.getCodigo().equals(cod)){
                return d;
            }
        }
        return null;
    }
}
