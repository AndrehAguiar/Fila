/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaatendimento;

import static filaatendimento.FilaAtendimento.ordem;
import static filaatendimento.FilaAtendimento.u;
import java.util.ArrayList;

/**
 *
 * @author TOP Artes
 */
public class Criador {

    static Aluno aluno;
    static Disciplina materia;
    static String disciplina;
    static String nome;
    static int matricula = 0;
    static int idade;
    static float nota;
    static ArrayList fila = new ArrayList();
    static Disciplina [] listaDisciplina;
    public static void listaAluno() {
        aluno = new Aluno(matricula, idade, nome, listaDisciplina);
        fila.add(ordem);
        fila.add(matricula);
        fila.add(nome);
        fila.add(idade);
        fila.add(listaDisciplina);
    }

    static void criaDisciplina() {
        materia = new Disciplina(disciplina, nota);
    }
}
