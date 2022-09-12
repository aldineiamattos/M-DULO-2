package introducao.exercicio7;

import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.standard.Media;

public class Planilha {

    private ArrayList<ContaDeLuz> listaContasDeLuz = new ArrayList<>();
    //consegue chegar nas contas de luz apartir daqui
    public ArrayList<ContaDeLuz> getListaContasDeLuz() {
        return listaContasDeLuz;
    }

    public void setListaContasDeLuz(ArrayList<ContaDeLuz> listaContasDeLuz) {
        this.listaContasDeLuz = listaContasDeLuz;
    }

    public float calcularUltimoValorMedio(){
        float soma = 0;
        float media = 0;
        for(int i=0;i<listaContasDeLuz.size();i++){
            //não importa quantas contas de luz eu tenho 
            ContaDeLuz umaConta= listaContasDeLuz.get(i);//aproveito o contador do for 
            soma = soma = umaConta.getValorDaConta();
        }
        media = soma / listaContasDeLuz.size();
        return media;
    }
    public float calcularUltimoValorMedio2(){
        float soma = 0;
        float media = 0;
        for(ContaDeLuz umaConta : listaContasDeLuz){
            soma = soma + umaConta.getValorDaConta();
        }
        media = soma / listaContasDeLuz.size();
        return media;
    }
    //public double qqnome(ContaDeLuz conta){ // é a mesma coisa que ->
        //return conta.getValorDaConta();
    public float calcularUltimoValorMedio3(){
        return (float)listaContasDeLuz.stream().mapToDouble(a -> a.getValorDaConta()).sum()
         / listaContasDeLuz.size();
    }
            
    public float calcularMaiorValor(){
        float omaior = 0;
        for(ContaDeLuz umaConta: listaContasDeLuz){
            if(omaior < umaConta.getValorDaConta()){
                omaior= umaConta.getValorDaConta();
            }
        }
        return omaior;
    }
    public float calcularMenorValor(){
        float omenor = 0;
        if(listaContasDeLuz.size() >= 1){//verificar se existe pelo menos uma conta
            omenor = listaContasDeLuz.get(0).getValorDaConta();
        }
        for(ContaDeLuz umaConta : listaContasDeLuz){
            if(omenor > umaConta.getValorDaConta()){
                omenor = umaConta.getValorDaConta();
            }
        }
        return omenor;
    }  
}

//int i=0 -> vai lá na lista e me dá esse cara
//stream -> permite trabalhar com funções
//soma -> pegue vários elementos e me dê um nº
//mapToDouble ->pega uma lista de objetos e transforma numa lista primitiva
//sum -> pega qualquer lista e tenta somar
//eu transformo e reduzo       
 
    





