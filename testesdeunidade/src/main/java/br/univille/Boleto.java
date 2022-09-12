package br.univille;

public class Boleto {
    private float valor;
    private int diaDoVencimento;
    private float percDesconto;
    private float percMulta;


    public Boleto(float valor, int diaDoVencimento, //construtor, constrói o boleto
                 float percDesconto, float percMulta){
        if(valor >=0){
            this.valor = valor;
        }
        this.diaDoVencimento = diaDoVencimento;
        this.percDesconto = percDesconto;
        this.percMulta = percMulta;
    }

    public float getValor() {
        return valor;
    }
    public int getDiaDoVencimento() {
        return diaDoVencimento;
    }
    public float getPercDesconto() {
        return percDesconto;
    }
    public float getPercMulta() {
        return percMulta;
    }

    public float pagar(int diaDoPagamento){
        float valorApagar = 0;
        if(diaDoPagamento > diaDoVencimento){
            valorApagar = this.valor + (this.valor * this.percMulta / 100f);
        }else{
            valorApagar = this.valor - (this.valor * this.percDesconto / 100f);
        }
        return valorApagar;
    }

}
     /*O método pagar deve receber o dia do mês onde o pagamento foi 
     feito, e retornar o valor em reais calculado do boleto. 
     Se o pagamento foi feito ANTES do dia do vencimento, 
     deve ser aplicado o percentual de desconto, 
     se o boleto for pago DEPOIS do vencimento 
     deve ser aplicado o percentual de multa. */    

    
    

         
     
     
    

    
    
