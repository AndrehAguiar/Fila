/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaatendimento;

import static filaatendimento.Criador.fila;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANDRE
 */
public class FilaAtendimento {

    /**
     * @param args the command line arguments
     */
    static int matricula;
    static int ordem, idade, posicao;
    static int u = 0;
    static String nome;
    static Disciplina[] listaDisciplina;
    static ArrayList Notas = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        float minNota = 0, maxNota = 0, medNota, somaNotas = 0, maiorNota = 0, menorNota = 0, mediaNota = 0;
        Scanner atendimento = new Scanner(System.in);
        System.out.printf("Cadastrar novo aluno na fila (1) | Atender próximo da fila (2)");
        int opcao = atendimento.nextInt();
        switch (opcao) {
            case 1:
                ordem++;
                matricula++;
                Scanner nomeAluno = new Scanner(System.in);
                System.out.printf("Informe o nome do aluno: ");
                nome = nomeAluno.next();
                Scanner idadeAluno = new Scanner(System.in);
                System.out.printf("Informe a idade do aluno: ");
                idade = idadeAluno.nextInt();
                for (u = 1; u < 3; u++) {
                    listaDisciplina = new Disciplina[u];
                    Scanner nomeDisciplina = new Scanner(System.in);
                    System.out.printf("Informe a disciplina " + u + " do aluno: ");
                    String disciplina = nomeDisciplina.next();
                    Scanner notaDisciplina = new Scanner(System.in);
                    System.out.printf("Informe a nota do aluno na disciplina (" + disciplina + "): ");
                    float nota = notaDisciplina.nextFloat();
                    somaNotas += nota;
                    medNota = somaNotas / u;
                    if (nota > maxNota) {
                        maxNota = nota;
                    } else if (nota < minNota) {
                        minNota = nota;
                    }
                    Notas.add(maxNota);
                    Notas.add(minNota);
                    Notas.add(medNota);
                    Criador.criaDisciplina();
                }
                Criador.listaAluno();
                FilaAtendimento.main(args);
            case 2:
                for (int p = 1; p <= fila.size(); p++) {
                    if (fila.size() - p == fila.size()) {
                        posicao = (int) fila.get(p);
                    } else if (fila.size() - p == fila.size() - 1) {
                        matricula = (int) fila.get(p);
                    } else if (fila.size() - p == 2) {
                        nome = fila.get(p).toString();
                    }
                }
                for (int n = 0; n < Notas.indexOf(n); n++) {
                    switch (Notas.indexOf(n) - n) {
                        case 1:
                            maiorNota = (float) Notas.get(n);
                        case 2:
                            menorNota = (float) Notas.get(n);
                        case 3:
                            mediaNota = (float) Notas.get(n);
                    }
                    System.out.printf("O próximo na fila " + posicao + " é o " + nome + ", matrícula " + matricula + "\n");
                }
                
                fila.remove(ordem);
                fila.remove(matricula);
                fila.remove(nome);
                fila.remove(listaDisciplina);
                System.out.printf("Atendimento finalizado. \n A maior nota do aluno é :" + maiorNota + "\n A menor nota do aluno é :" + menorNota + "\n A média das notas do aluno é: " + mediaNota + "\n");
                FilaAtendimento.main(args);
        }
    }
}
