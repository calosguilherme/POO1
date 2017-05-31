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

    public ListaDisciplina getList() {
        return list;
    }

    public void setList(ListaDisciplina list) {
        this.list = list;
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
