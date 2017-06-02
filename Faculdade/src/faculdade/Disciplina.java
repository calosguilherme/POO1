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
        this.listA = new ListaAluno();
        this.listP = new ListaProfessor();
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

    public void getListP() {
        listP.imprimeProfessor(); //imprime o professor referenete a esta disciplina
    }

    public void setListP(Professor p) {
        this.listP.add(p); //adiciona profesores a disciplina
    }

    public void getListA() {
        listA.imprimeAluno(); //imprime alunos desta disciplina
    }

    public void addAlunoDisc(Aluno a) {
        this.listA.addAluno(a);//adiciona alunos a disciplina
    }
    
    
}
