package introducao.exercicio11;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList <Nota> listaNotas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }
    //Deverá calcular a média aritmética das notas
    public float calcMediaNotas(){
        float media =0;
        float soma = 0;
        //size() retorna o numero de itens no ArrayList
        for(int i=0; i < listaNotas.size(); i++){
            var umaNota = listaNotas.get(i);
            soma = soma + umaNota.getValor();
        } 
        //sair do FOR para fazer a media
        media = soma / listaNotas.size();
        return media;
        /*
        media = (nota1 + nota2 + nota3 + nota4) / 4.0f;
        pode ser:
        for(int i=0; i < getListaNotas().size(); i++){
            soma = soma + getListaNotas().get(i).getValor() ;
         */

    }
    public static void main(String[] args) {
        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho da Silva");

        Nota nota1 = new Nota();
        nota1.setValor(5);

        Nota nota2 = new Nota();
        nota2.setValor(7);

        Nota nota3 = new Nota();
        nota3.setValor(6);
        
        zezinho.getListaNotas().add(nota1);
        zezinho.getListaNotas().add(nota2);
        zezinho.getListaNotas().add(nota3);

        var resultado = zezinho.calcMediaNotas(); 
        System.out.println("Media: " + resultado);

        /*
         No método main da classe , instanciar as classes acima, 
         em seguida chamar o método calcMediaNotas(), 
         guardar seu resultado em uma variável e mostrar em tela.
         */

        //GET E SET -> CONTROLE REMOTO






        
    }
    
}
