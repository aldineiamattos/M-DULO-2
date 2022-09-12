package introducao.exercicio18;

import java.util.ArrayList;

public class Loja {
    private ArrayList <Setor> listaSetores = new ArrayList<>();
    
    public ArrayList<Setor> getListaSetores() {
        return listaSetores;
    }
    public void setListaSetores(ArrayList<Setor> listaSetores) {
        this.listaSetores = listaSetores;
    }
    /*Deverá gerar uma String contendo o nome do setor, o nome do produto, 
     o preço e o nome do fornecedor, essa Sstring deverá ser retornada.*/
    public String gerarCatalogo(){
        StringBuilder montador = new StringBuilder();
        for(var umSetor : listaSetores){
            montador.append("\n Nome Setor: " + umSetor.getNome());

            for(var umProduto : umSetor.getListaProdutos()){
                montador.append("\n Nome Prod: " + umProduto.getNome());
                montador.append("\n Nome Preco: " + umProduto.getPreco());

                var umFornecedor = umProduto.getFornecedor();
                montador.append("\n Nome Forn: " + umFornecedor.getNome());
            }
        }

        return montador.toString();
    }
    /*for(var umVendedor : this.getListaVendedores()){
	    for(var umtelefone: umVendedor.getListaTelefones){
		System.out.println(umtelefone.getNumero());
	    } */
    public static void main(String[] args) {
        Loja loja1 = new Loja();

        Setor setor1 = new Setor();
        setor1.setNome("Cama");
        Setor setor2 = new Setor();
        setor2.setNome("Mesa");
        Setor setor3 = new Setor();
        setor3.setNome("Banho");

        Fornecedor forn1 = new Fornecedor();
        forn1.setNome("Karsten");
        Fornecedor forn2 = new Fornecedor();
        forn2.setNome("Dohler");
      
        Produto prod1 = new Produto();
        prod1.setNome("Travesseiro");
        prod1.setPreco(70f);
        prod1.setFornecedor(forn1);
        setor1.getListaProdutos().add(prod1);

        Produto prod2 = new Produto();
        prod2.setNome("Cobertor");
        prod2.setPreco(250f);
        prod2.setFornecedor(forn1);
        setor1.getListaProdutos().add(prod2);

        Produto prod3 = new Produto();
        prod3.setNome("Toalha");
        prod3.setPreco(100f);
        prod3.setFornecedor(forn1);
        setor2.getListaProdutos().add(prod3);

        Produto prod4 = new Produto();
        prod4.setNome("Toalha de banho");
        prod4.setPreco(60f);
        prod4.setFornecedor(forn2);
        setor3.getListaProdutos().add(prod4);

        Produto prod5 = new Produto();
        prod5.setNome("Toalha de Rosto");
        prod5.setPreco(30f);
        prod5.setFornecedor(forn2);
        setor3.getListaProdutos().add(prod5);

        loja1.getListaSetores().add(setor1);
        loja1.getListaSetores().add(setor2);
        loja1.getListaSetores().add(setor3);

         /*No método main da classe , instanciar as classes acima, 
        em seguida chamar o método gerarCatalogo() o resultado deve 
        ser guardado em uma variável para ser mostrado em tela.*/
         
        String retorno = loja1.gerarCatalogo();
        System.out.println(retorno);
        }
    }  


        
        

        
        
        

        
        
        

        
        

       

                      
    
    
     
    
        

        
        
        
    
    

    

