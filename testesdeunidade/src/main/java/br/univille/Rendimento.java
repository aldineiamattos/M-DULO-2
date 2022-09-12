package br.univille;

public class Rendimento {
    private String descricao;
    private float valor;

    public String getDescricao() {
        return descricao;
    }
    public float getValor() {
        return valor;
    }
    public Rendimento(String descricao, 
                float valor){
        this.descricao = descricao;
        this.valor = valor;
       
    }
    
    
    
}
