package introducao.exercicio13;

import java.util.ArrayList;

public class Cidade {
    private String nome;
    /*Coleção deve ser instanciada (criada) antes de conter qq coisa */
    //O ArrayList é um carrinho onde vou colocanco as coisas lá dentro, porisso preciso do new.
    private ArrayList <Municipe> listaMunicipes = new ArrayList<>(); //sem o new dá erro...exception

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }
    public void setListaMunicipes(ArrayList<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }
    /*Deverá contar e retornar o número pessoas que moram em casas e o número de pessoas que moram em 
    apartamentos */
    public int contaApartamento(){ //o apto e a casa estão dentro do TipoResidencia no nome
        int contador=0; //criar o contador para contar
        //1 criar um bloco de repetição para acessar um municipe de cada vez
        //for(var_controle = val_ini; condição; incre/decre){corpo}  
        // o "i" controla o numero de voltas que estou dando          
        for(int i=0; i < listaMunicipes.size(); i++){
            //A cada volta eu tenho um minicipe na variavel abaixo
            var umMunicipe = listaMunicipes.get(i);
            //TESTAR - o tipo da residencia 
            if(umMunicipe.getTipo().getNome().equals("Apartamento")){
                contador = contador + 1;
            }
        }  
        return contador;  
    } 
    public int contaCasa(){
        int contador=0;
        //FOR EACH - PARA CADA ELEMENTO
        for(var umMunicipe : listaMunicipes){
            if(umMunicipe.getTipo().getNome().equals("Casa")){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Cidade cid1 = new Cidade();
        cid1.setNome("Joinville");

        Municipe mun1 = new Municipe();
        mun1.setNome("Zezinho");
        Municipe mun2 = new Municipe();
        mun2.setNome("Mariazinha");
        Municipe mun3 = new Municipe();
        mun3.setNome("Huguinho");
        Municipe mun4 = new Municipe();
        mun4.setNome("Astrogildo");
        Municipe mun5 = new Municipe();
        mun5.setNome("Luizinho");
       
        cid1.getListaMunicipes().add(mun1);
        cid1.getListaMunicipes().add(mun2);
        cid1.getListaMunicipes().add(mun3);
        cid1.getListaMunicipes().add(mun4);
        cid1.getListaMunicipes().add(mun5);

        TipoResidencia tipo1 = new TipoResidencia();
        tipo1.setNome("Apartamento");
        TipoResidencia tipo2 = new TipoResidencia();
        tipo2.setNome("Casa");

        mun1.setTipo(tipo1);
        mun2.setTipo(tipo1);
        mun3.setTipo(tipo1);

        mun4.setTipo(tipo2);
        mun5.setTipo(tipo2);
        /*No método main da classe , instanciar as classes acima, em seguida 
        chamar os métodos contaApartamentos() e contaCasas(), 
        guardar o resultado em variáveis e mostrar em tela. */
        var numApart = cid1.contaApartamento(); 
        System.out.println("Num Apartamentos: " + numApart);
        var numCasas = cid1.contaCasa(); 
        System.out.println("Num Casas: " + numCasas);

       
    }
}
           
                

        
            
            
        
                 
                        
        
       
   
    
    
      
    
        

        

        

        
            
               
           

          
        
                              
    
    
        
    
    
