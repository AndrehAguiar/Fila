/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaatendimento;

/**
 *
 * @author ANDRE AGUIAR | RA: 116115927
 * @author BRUNO LISBOA | RA:
 * @author FLÁVIO | RA:
 */
public class Disciplina {

    private String disciplina;
    private float nota;

    public Disciplina(String disciplina, float nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return disciplina;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.disciplina = nome;
    }

    /**
     * @return the nota
     */
    public float getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(float nota) {
        this.nota = nota;
    }

}
