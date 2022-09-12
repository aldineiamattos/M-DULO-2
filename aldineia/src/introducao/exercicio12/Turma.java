package introducao.exercicio12;

import java.util.ArrayList;



public class Turma {
    private String serie;
    private ArrayList <Crianca> listaCriancas = new ArrayList<>();

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public ArrayList<Crianca> getListaCriancas() {
        return listaCriancas;
    }

    public void setListaCriancas(ArrayList<Crianca> listaCriancas) {
        this.listaCriancas = listaCriancas;
    }
    //Deverá contar e retornar o número de meninos e de meninas
    public int contaMeninos(){
        int contador=0;

        for(Crianca umaCrianca : listaCriancas){
            if(umaCrianca.getSexo().equalsIgnoreCase("Masculino")){
                contador = contador + 1;
                //contador++;
                //contador+=1;
                //equalsIgnore -> IGNORA se as palavras estão com maiuscula ou minuscula
            }
        }
        return contador;
    }
    public int contaMeninas(){
        int contador=0;
             
        for(Crianca umaCrianca : listaCriancas){
            //if(umaCrianca.getSexo().toLowerCase().equals("FEMININO")){
            if(umaCrianca.getSexo().toLowerCase().equals("feminino")){
                contador += 1;
            }
        }
        return contador;
    } 
    public static void main(String[] args) { //toda a máquina procura o main  para executar as ações
        Turma turma1 = new Turma();
        turma1.setSerie("5 série");   

        Crianca crianca1 = new Crianca();
        crianca1.setNome("Zezinho");
        crianca1.setSexo("Masculino");
        turma1.getListaCriancas().add(crianca1);

        Crianca crianca2 = new Crianca();
        crianca2.setNome("Mariazinha");
        crianca2.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca2);

        Crianca crianca3 = new Crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca3);

        Crianca crianca4 = new Crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca4);

        var numMeninos = turma1.contaMeninos(); 
        System.out.println("Meninos: " + numMeninos);

        var numMeninas = turma1.contaMeninas(); 
        System.out.println("Meninas: " + numMeninas);
    }
}  
/*
 No método main da classe , instanciar as classes acima, em seguida 
 chamar os métodos contaMeninos() e contaMeninas(), 
 guadar os resultados em variáveis e mostrar o resultado em tela.
 */  
/*
O QUE EU HAVIA FEITO:
public int contaMeninos(){
       int meninos=0;
    for(int i=0; i < listaCriancas.size(); i++){
            var umaCrianca = listaCriancas.get(i);
            if(umaCrianca.getSexo().equals("Masculino")){
                meninos ++;
            }
        }
        return meninos;        
}  
public int contaMeninas(){
       int meninas=0;
    for(int i=0; i < listaCriancas.size(); i++){
            var umaCrianca = listaCriancas.get(i);
            if(umaCrianca.getSexo().equals("Feminino")){
                meninas++;
            }
        }         
        return meninas;    
}   */      
    //java EE não têm main
    //Junit não tem main (que é o ponto de inicio)         
                   
        
           
 
   

            
     
    
 
    
    