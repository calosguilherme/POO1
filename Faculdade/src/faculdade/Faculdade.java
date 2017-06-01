/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Faculdade {

    public static void main(String[] args) {
        
        Curso c = new Curso("lucas","123");
        Professor p = new Professor("lucas","123", 40);
        Aluno a = new Aluno("lucas","123");
        Disciplina d = new Disciplina("mat", "123");
        ListaCurso lc = new ListaCurso();
        ListaProfessor lp = new ListaProfessor();
        ListaAluno la = new ListaAluno();
        ListaDisciplina ld = new ListaDisciplina();
        lc.addCurso(c);
        lc.imprimeCurso();
        lp.addProfessor(p);
        lp.imprimeProfessor();
        la.addAluno(a);
        la.imprimeAluno();
        ld.addDisciplina(d);
        ld.imprimeDisciplina();
//        String a1;
//        a1 = JOptionPane.showInputDialog("Digite um Valor");

        
    }
    
}
