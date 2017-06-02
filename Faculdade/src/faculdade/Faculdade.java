/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Faculdade {

    public static void main(String[] args) {
        
        Curso c;
        Professor p;
        Aluno a;
        Disciplina d = null;
        ListaCurso lc = new ListaCurso();
        ListaProfessor lp = new ListaProfessor();
        ListaAluno la = new ListaAluno();
        ListaDisciplina ld = new ListaDisciplina();
        int i = 1;
        String x,nome,mat,cargaHor,cod;
        x = "";
        while (!x.equals("0")){
            x = JOptionPane.showInputDialog("digite 1 - criar aluno \n"
                    + "digite 2 - criar professor \n"
                    + "digite 3 - criar disciplina \n"
                    + "digite 4 - criar curso \n"
                    + "digite 5 - gerenciar faculdade \n"
                    + "digite 0 - sair \n");
            switch (x) {
                case "1":
                    nome = JOptionPane.showInputDialog("nome do aluno");
                    mat = JOptionPane.showInputDialog("matricula");
                    a = new Aluno(nome,mat);
                    la.addAluno(a);
                    la.imprimeAluno();
                    break;
                case "2":
                    nome = JOptionPane.showInputDialog("nome do professor");
                    mat = JOptionPane.showInputDialog("matricula do professor");
                    cargaHor = JOptionPane.showInputDialog("carga horaria do professor");
                    p = new Professor(nome,mat,cargaHor);
                    lp.addProfessor(p);
                    lp.imprimeProfessor();
                    break;
                case "3":
                    nome = JOptionPane.showInputDialog("nome da disciplina");
                    cod = JOptionPane.showInputDialog("codigo da disciplina");
                    d = new Disciplina(nome,cod);
                    ld.addDisciplina(d);
                    ld.imprimeDisciplina();
                    break;
                case "4":
                    nome = JOptionPane.showInputDialog("nome do curso");
                    cod = JOptionPane.showInputDialog("codigo curso");
                    c = new Curso(nome,cod);
                    lc.addCurso(c);
                    lc.imprimeCurso();
                    break;
                case "5":
                    while(!x.equals("0")){
                        x = JOptionPane.showInputDialog("digite 1 - alocar aluno a disciplina \n"
                    + "digite 2 - alocar professora disciplina \n"
                    + "digite 3 - alocar disciplina a curso \n"
                    + "digite 0 - sair \n");
                    
                        switch(x){
                            case "1":
                                mat = JOptionPane.showInputDialog("matricula do aluno");
                                cod = JOptionPane.showInputDialog("codigo da disciplina");
                                {
                                    try {
                                        validacao.existeAluno(mat, la);
                                        validacao.existeDisciplina(cod, ld);
                                        
                                        d.addAlunoDisc(la.get(mat));
                                        d.getListA();
                                        
                                    } catch (ExAlunoInexistente ex) {
                                        JOptionPane.showMessageDialog(null, "aluno invalido");
                                    } catch (ExDisciplinaInexistente ex) {
                                        JOptionPane.showMessageDialog(null, "disciplina invalida");
                                    }
                                        
                                }
                                
                            break;
                            case "2":
                                mat = JOptionPane.showInputDialog("matricula do professor");
                                cod = JOptionPane.showInputDialog("codigo da disciplina");
                            break;
                            case"3":
                                
                            break;
                            default :
                                System.out.println("ok");
                        }
                    }
                    break;
                default :
                    System.out.println("ok");
            }
        }
        
    }
    
}
