package introducao.exercicio10;

import java.util.ArrayList;

public class Pedido {
    private ArrayList <Produto> listaProdutos = new ArrayList<>();
    /*Deverá calcular a soma do valor dos produtos */
    public float calcSomaProdutos(){
        float total = 0; //criar uma variável que vai acumulando os valores
        //FORA DO PEDIDO
        for(int i=0; i < getListaProdutos().size(); i++){
            total = total + getListaProdutos().get(i).getValor();
        }
        //POSSO FAZER ASSIM TAMBÉM PORQUE ESTOU DENTRO DO PEDIDO
        /*for(int i=0; i < ListaProdutos().size(); i++){
            total = total + ListaProdutos().get(i).getValor(); 
        } */
        // OU
        /* for(var umProduto : getListaProdutos()){
            total = total + umProduto.getValor();
        }*/
              
        return total;
    }
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    public static void main(String[] args) {
        Pedido pedido1= new Pedido();

        Produto prod1= new Produto();
        prod1.setNome("Banana");
        prod1.setValor(3.5f);
        pedido1.getListaProdutos().add(prod1);

        Produto prod2 = new Produto();
        prod2.setNome("Laranja");
        prod2.setValor(2.2f);
        pedido1.getListaProdutos().add(prod2);

        Produto prod3 = new Produto();
        prod3.setNome("Maça");
        prod3.setValor(7.2f);
        pedido1.getListaProdutos().add(prod3);

        Produto prod4 = new Produto();
        prod4.setNome("Pêra");
        prod4.setValor(25f);
        pedido1.getListaProdutos().add(prod4);

        /*No método main da classe , instanciar as classes acima, em 
        seguida chamar o método calcSomaProdutos(), 
        guardar seu resultado em uma variável e mostrar em tela. */
        float guardar = pedido1.calcSomaProdutos(); // metodo que tem retorno
        System.out.println(guardar); // ou System.out.println(pedido1.calcSomaProdutos());
        }
    }
    //como estou na mesma classe da lista - pode usar listaProdutos
    //qdo tenho que pegar a lista de fora uso getlistaProdutos
    //getListaProdutos().get(0).getValor();
    
    
   
    