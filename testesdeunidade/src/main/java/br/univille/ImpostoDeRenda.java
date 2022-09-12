package br.univille;

import java.util.ArrayList;

public class ImpostoDeRenda {
    private float valorImptoRetidonaFonte;
    private ArrayList<Rendimento> listaRendimentos = new ArrayList<>();

    public void setValorImptoRetidonaFonte(float valorImptoRetidonaFonte) {
        this.valorImptoRetidonaFonte = valorImptoRetidonaFonte;
    }
    public ArrayList<Rendimento> getListaRendimentos() {
        return listaRendimentos;
    }
    public void setListaRendimentos(ArrayList<Rendimento> listaRendimentos) {
        this.listaRendimentos = listaRendimentos;
    }

    public float calculaValorIRPF(){
        float soma = 0;
        float valorRend = 0;

        for(var umRendimento : listaRendimentos){
            soma += umRendimento.getValor();
        }
        // valorRend = soma / listaRendimentos

        return 0;
    }
    /*float soma = 0;
        float media =0;

        for(var umaAvaliacao : listaNotas){
            soma += umaAvaliacao.getNota();
        }
        media = soma / listaNotas.size();
 */
}
/*
Calcule o valor do imposto de renda pessoa física:
1) Some os valores dos rendimentos, e divida por 12 para encontrar quanto a 
pessoa teve de rendimentos por mês;
2) Utilize a tabela ao lado para comparar o rendimento por mês, e descobrir 
o percentual de IRPF que deve ser aplicado;
3) Calcule  o valor do imposto aplicando o percentual do IRPF ao total de 
rendimentos;
4) Diminua do valor do imposto, o valor do imposto retido na fonte
5) Retorne o valor calculado do IRPF

Rendimento por Mês              Percentual
De R$ 1903,99 até R$ 2826,65    7,50%
De R$ 2826,66 até R$ 3751,05    15%
De R$ 3751,06 até R$ 4664,68    22,50%
Acima de R$ 4664,68             27,50%
*/

 






    



    