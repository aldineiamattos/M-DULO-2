package br.univille;

public class PlanejadorDeChurrasco {
    private int adulto;
    private int crianca;

    public void setAdulto(int adulto){
        this.adulto = adulto;
    }
    public void setCrianca(int crianca){
        this.crianca = crianca;
    }

    public float calculaQtdCarne(){
        //escrever a logica do quadradinho verde
        float total = 0;
        total = total + (adulto * 250f);
        total = total + (crianca * 100f);
        return total;
    }

}
    /*
     O método calculaQtdCarne deve retornar a quantidade 
     de carne necessária em gramas. 
     Considere que cada Adulto consome 250g de carne e uma 
     criança 100g.
     */
    
    

