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
public class ListaCurso extends ArrayList{
    private ArrayList <Curso> cursos = new ArrayList();

    public void addCurso(Curso c){
        this.cursos.add(c); //Adicionando Novos cursos
    }
    
    public void imprimeCurso(){
        int i,tam;
        tam = this.cursos.size(); //pegando o tamanho do curso
        for(i = 0; i < tam; i++)
            System.out.println(this.cursos.get(i).getNome()); //imprimindo a posicao do curso
    }
    
}
