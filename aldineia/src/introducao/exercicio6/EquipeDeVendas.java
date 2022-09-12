package introducao.exercicio6;

import java.util.ArrayList;

public class EquipeDeVendas {
    private Gerente gestor;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();

    
    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public Gerente getGestor() {
        return gestor;
    }

    public void setGestor(Gerente gestor) {
        this.gestor = gestor;

    }
    //Este método deveria criar uma String contendo 
    //todos os dados do gerente, setor e todos os 
    //dados do vendedor.
    public String listarEquipe(){
        StringBuilder montadorDeStrings = new StringBuilder();

        //completar GERENTE + SETOR + VENDEDOR  
        montadorDeStrings.append("GERENTE\n");
        montadorDeStrings.append("Nome:" + this.getGestor().getNome() + "\n");
        //String.format("Nome: %s \n", this.getGestor().getNome())
        montadorDeStrings.append(String.format("Nome: %s \n", this.getGestor().getNome()));
        montadorDeStrings.append(String.format("Setor: %s \n", this.getGestor().getSetor()));
        montadorDeStrings.append(String.format("Telefone: %s \n", this.getGestor().getTelefone()));
        montadorDeStrings.append(String.format("ID: %s \n", this.getGestor().getId()));

        for(var umVendedor : this.getListaVendedores()){
            montadorDeStrings.append("VENDEDORES\n");
            montadorDeStrings.append(String.format("ID: %s \n", umVendedor.getId()));
            montadorDeStrings.append(String.format("Nome: %s \n", umVendedor.getNome()));
            montadorDeStrings.append(String.format("Telefone: %s \n", umVendedor.getTelefone()));
            montadorDeStrings.append(String.format("Meta Venda: %f \n", umVendedor.getMetaVenda()));
            montadorDeStrings.append(String.format("Comissão: %f \n", umVendedor.getPercComissao()));
            /* valMETA         100%
               valcomissao     perccomissao
             */
            var valcomissao = (umVendedor.getMetaVenda() * umVendedor.getPercComissao()) / 100f;
            montadorDeStrings.append(String.format("Val comissao: %f \n", valcomissao));   
        }
        return montadorDeStrings.toString();
    }

    
}
//thread é uma tarefa que vc manda seu programa fazer
//uma thread cuida do main e a outra da janela
// threads concorrência por recursos
//StringBuffer é thread-safe
//StringBuider é mais novo, o programador resolve o problema, usar uma implementação
//do semáforo(programming) só deixa um entrar quando concorrido
//flexa aberta vira variável   
//flexa listaVendedores é diamante pintado de preto que é a Composição
//diamante é o todo as partes os vendedores e o todo é a Equipe deVendas
//EquipeDeVendas apontando para o Vendedor
//diamante aberto é agregação (vários)
//diamante fechado é composição (um)
//diamante não é uma flexa -> saída especial
//Livro: Análise e Design 
//quem aponta é o outro lado do diamente
//Qdo for o * têm que usar uma coleção (lista)    
//Vendedor apontado para EquipeDeVendas-> ganha variável Equipe
//public String listarEquipe(){
//return null;
 
        
        
            
        
    

    



    
    
    
        
      
   
