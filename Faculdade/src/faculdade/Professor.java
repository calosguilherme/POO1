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
public class Professor {
    private String nome;
    private String matricula;
    private String cargaHoraria;

    public Professor(String nome, String matricula, String cargaHoraria) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
}
