/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs;

/**
 *
 * @author thiago
 */
public class Curso {
    
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String obterInfo(){
        
        String info = "Nome do curso = " + nome + "\n";
        
        if(professor != null){
            info += professor.obterInfo();
        }
        
        if(alunos != null){
            System.out.println("-----Alunos-----");
            for(Aluno aluno : alunos){
                if(aluno != null){
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMedia da turam = " + obterMediaTurma();
        }
        
        return info;
    }
    
    public double obterMediaTurma(){
        double soma = 0;
        for(Aluno aluno : alunos){
            if(aluno != null){
                soma += aluno.obterMedia();
            }
        }
        return soma/alunos.length;
    }
    
}
