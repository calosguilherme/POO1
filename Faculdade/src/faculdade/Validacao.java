/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class Validacao {
    public static void existeAluno(String mat, ListaAluno listA) throws ExAlunoInexistente{
        Iterator iterator = listA.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String mat2 = entry.getKey().toString();
            if(mat2.equals(mat)){ // procurando pela matricula do aluno na lista de alunos
                return;
            }
        }
        throw new ExAlunoInexistente("Aluno Inexistente");
    }
    public static void existeDisciplina(String cod, ListaDisciplina listD) throws ExDisciplinaInexistente{
        for(Disciplina d: listD){
            if(d.getCodigo().equals(cod)){ //procurando o codigo da disciplina na lista disciplina
                return;
            }
        }
        throw new ExDisciplinaInexistente("disciplina inexistente");
        
    }
    
    public static void existeProfessor(String mat, ListaProfessor listP) throws ExProfessorInexistente{
        for(Professor p: listP){
            if(p.getMatricula().equals(mat)){ // procurando a matricula do professor na lista professor
                return;
            }
        }
        throw new ExProfessorInexistente("Professor inexistente");
        
    }
    public static void existeCurso(String cod, ListaCurso listC) throws ExCursoInexistente{
        for(Curso c: listC){
            if(c.getCodigo().equals(cod)){ // procurando o codigo do curso na lista curso
                return;
            }
        }
        throw new ExCursoInexistente("Curso inexistente");
        
    }
}
