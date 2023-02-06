/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Luciano Martinez
 */
public class Aluno extends Pessoa {
    private String login;
    private int totAssistido;
    
    public Aluno (String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
        
    }   
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public float getExperiencia() {
        return experiencia;
    }

    @Override
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }    

    @Override
    public String toString() {
        return "Aluno { " + super.toString() + " login = " + login + ", totAssistido = " + totAssistido + '}';
    }
    
   
    
    public void viuMaisUm(){
        
    }
    
}
