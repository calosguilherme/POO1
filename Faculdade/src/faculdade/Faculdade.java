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
        ld.addDisciplina(d);
        ld.imprimeDisciplina();
        int i = 1;
        String x;
        x = "";
        while (!x.equals("0")){
            x = JOptionPane.showInputDialog("digite 1 - criar aluno \n"
                    + "digite 2 - criar professor \n"
                    + "digite 3 - criar disciplina \n"
                    + "digite 4 - criar curso \n"
                    + "digite 0 - sair \n");
            switch (x) {
                case "1":
                    String nome = JOptionPane.showInputDialog("nome do aluno");
                    String mat = JOptionPane.showInputDialog("matricula");
                    a = new Aluno(nome,mat);
                    la.addAluno(a);
                    la.imprimeAluno();
                    break;
                default :
                    System.out.println("ok");
            }
        }
        
    }
    
}
