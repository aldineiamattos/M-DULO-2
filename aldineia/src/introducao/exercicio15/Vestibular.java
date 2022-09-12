package introducao.exercicio15;

import java.util.ArrayList;

public class Vestibular {
    private ArrayList <Vestibulando> listaVestibulandos = 
        new ArrayList<>();

    public ArrayList<Vestibulando> getListaVestibulandos() {
        return listaVestibulandos;
    }
    public void setListaVestibulandos(ArrayList<Vestibulando> listaVestibulandos) {
        this.listaVestibulandos = listaVestibulandos;
    }
    /*Deverá gerar uma String contendo o nome e a nota de todos os 
    vestibulandos aprovado (nota igual o superior a sete) */
    public String gerarListaAprovados(){
        
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Aprovado\n");
        for(var umVestibulando : listaVestibulandos){
            if(umVestibulando.getNota() >= 7){
                montadorString.append("Nome: " + umVestibulando.getNome() + "\n");
            }
        }
        return montadorString.toString();
        /*for(int i=0; i< listaVestibulandos.size(); i++){
            Vestibulando umVestibulando = listaVestibulandos.get(i);
            if(umVestibulando.getNota()>=7){
                montadorString.append("\nNome : " + umVestibulando.getNome());
                montadorString.append("\nNota : " + umVestibulando.getNota());*/
    }
    public static void main(String[] args) {
        Vestibular acafe = new Vestibular(); //ou => var acafe = new Vestibular();
        
        Vestibulando vest1 = new Vestibulando();
        vest1.setNome("Zezinho");
        vest1.setNota(7);
        acafe.getListaVestibulandos().add(vest1);

        Vestibulando vest2 = new Vestibulando();
        vest2.setNome("Pedrinho");
        vest2.setNota(5);
        acafe.getListaVestibulandos().add(vest2);

        Vestibulando vest3 = new Vestibulando();
        vest3.setNome("Huguinho");
        vest3.setNota(10);
        acafe.getListaVestibulandos().add(vest3);

        Vestibulando vest4 = new Vestibulando();
        vest4.setNome("Luizinho");
        vest4.setNota(8);
        acafe.getListaVestibulandos().add(vest4);

        /*No método main da classe , instanciar as classes acima, em seguida 
        chamar o método gerarListaAprovados() 
        guardar o resultado em uma variável e mostrar em tela. */
        String relatorio = acafe.gerarListaAprovados();
        System.out.println(relatorio);

    }
}
             
                
        

        
        
        
        
      
    
      

    
    
    

    





               
    
               
            
               

            
        
        
