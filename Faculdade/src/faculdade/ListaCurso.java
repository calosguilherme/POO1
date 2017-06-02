/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class ListaCurso extends ArrayList<Curso>{

    public void addCurso(Curso c){
        this.add(c); //Adicionando Novos cursos
    }
    
    public void imprimeCurso(){
        int i,tam;
        tam = this.size(); //pegando o tamanho do curso
        for(i = 0; i < tam; i++)
            System.out.println(this.get(i).getCodigo()
                    + " " + this.get(i).getNome()); //imprimindo a posicao do curso
    }
    public Curso getCurCod(String cod){ // pegando o curso pelo codigo
        for(Curso c: this){
            if(c.getCodigo().equals(c)){
                return c;
            }
        }
        return null;
    }
    
}
