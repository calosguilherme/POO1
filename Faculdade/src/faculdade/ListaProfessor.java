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
public class ListaProfessor extends ArrayList<Professor>{
    
    public void addProfessor(Professor c){
        this.add(c); //Adicionando Novos cursos
    }
    
    public void imprimeProfessor(){
        int i,tam;
        tam = this.size(); //pegando o tamanho do curso
        for(i = 0; i < tam; i++)
            System.out.println(this.get(i).getNome()); //imprimindo a posicao do curso
    }
    
    public Professor getPorMat(String mat){
        for(Professor px: this){
            if(px.getMatricula().equals(mat)){
                return px;
            }
        }
        return null;
    }
        
}
