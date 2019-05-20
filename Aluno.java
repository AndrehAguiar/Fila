/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaatendimento;

/**
 *
 * @author ANDRE
 */
public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private Disciplina[] listaDisciplina;

    Aluno(int matricula, int idade, String nome, Disciplina[] listaDisciplina) {
        this.idade = idade;
        this.nome = nome;
        this.matricula = matricula;
        this.listaDisciplina = listaDisciplina;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the listaDisciplina
     */
    public Disciplina[] getListaDisciplina() {
        return listaDisciplina;
    }

    /**
     * @param listaDisciplina the listaDisciplina to set
     */
    public void setListaDisciplina(Disciplina[] listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }
    
}
