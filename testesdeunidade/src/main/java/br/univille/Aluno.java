package br.univille;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private float percFrequencia;
    private ArrayList<Avaliacao> listaNotas = new ArrayList<>();

    public ArrayList<Avaliacao> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Avaliacao> listaNotas) {
        this.listaNotas = listaNotas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPercFrequencia() {
        return percFrequencia;
    }
    public void setPercFrequencia(float percFrequencia) {
        this.percFrequencia = percFrequencia;
    }
    /*
    Para que um aluno seja considerado APROVADO, deve possuir 
    média de notas igual ou superior a sete e frequência 
    superior a 75%. Para que um aluno seja considerado em 
    EXAME, deve possuir média de notas superior a três e 
    frequência superior a 75%. Para que um aluno seja 
    considerado REPROVADO, deve possuir a média de notas
    inferior a 3 ou a frequência inferior a 75%.
     */
    private float calcMedia(){ // private porque ele está na mesma classe onde vai chamar
        float soma = 0;
        float media =0;

        for(var umaAvaliacao : listaNotas){
            soma += umaAvaliacao.getNota();
        }
        media = soma / listaNotas.size();

        return media;
        /* for (int i=0; i< listaNotas.getSise(); i++){
            var umaAvaliacao = listaNotas.get(i);
            soma = soma + umaAvaliacao.getNota();*/
        }
        public boolean estaEmExame(){
            var media = calcMedia();
            if(percFrequencia >= 75 && (media > 3 && media < 7)){
                return true;
            }
            return false;
        }
        public boolean estaAprovado(){
            var media = calcMedia();
            if(percFrequencia >= 75 && (media >= 7)){
                return true;
            }
            return false;
        }
        public boolean estaReprovado(){
            var media = calcMedia();
            if(percFrequencia < 75 || media <= 3){
                return true;
            }
            return false;
        }
    }
    
              
            
        
        
    