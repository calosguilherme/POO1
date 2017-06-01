/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

/**
 *
 * @author lucas
 */
public class Disciplina {
    private String nome;
    private String codigo;
    private ListaProfessor listP;
    private ListaAluno listA;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ListaProfessor getListP() {
        return listP;
    }

    public void setListP(ListaProfessor listP) {
        this.listP = listP;
    }

    public ListaAluno getListA() {
        return listA;
    }

    public void setListA(ListaAluno listA) {
        this.listA = listA;
    }
    
    
}
