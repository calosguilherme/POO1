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

public class Curso{
    private String nome;
    private String codigo;
    private ListaDisciplina list;
    
    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void getList() {
        list.imprimeDisciplina();
    }

    public void setList(Disciplina d) {
        this.list.addDisciplina(d);
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
    
}
