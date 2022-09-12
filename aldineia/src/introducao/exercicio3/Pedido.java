package introducao.exercicio3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private long id;
    private Date data;
    private Comprador cliente;
    private ArrayList<ItemPedido> listaItens = new ArrayList<>();

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Comprador getCliente() {
        return cliente;
    }
    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }
    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

    /* Este método deverá calcular o valor total do pedido considerando o valor de venda e a quantidade.  */
    public float calcValorTotal(){  
        float valorTotal = 0;
        for(ItemPedido umItem : listaItens){
            var valorItem = umItem.getQuantidade() * umItem.getValorVenda();
            valorTotal += valorItem;
            //valorTotal = valorTotal + valorItem;
        }
        return valorTotal;
    }
}
        
        

    

    