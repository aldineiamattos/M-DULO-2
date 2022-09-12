package introducao.exercicio14;

import java.util.ArrayList;

public class ListaTarefas {
    
    private ArrayList <Tarefa> listaTarefas = new ArrayList<>();

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    } 
    /*Deverá totalizar o tempo  para realizar todas as tarefas e 
    retornar o valor */
    public float calculaTempoTotal(){
        float total=0;
        
        /*for(int i=0; i <listaTarefas.size(); i++){
            var umaTarefa = listaTarefas.get(i);
            soma = soma + umaTarefa.getTipo().getTempo();
            ou */

        for(var umaTarefa : listaTarefas){
            total = total + umaTarefa.getTipo().getTempo();
        }
           
        return total ;
    }
    public static void main(String[] args) {
        ListaTarefas lista1 = new ListaTarefas();
        
        Tarefa tar1 = new Tarefa();
        tar1.setNome("Passear");
        Tarefa tar2 = new Tarefa();
        tar2.setNome("Pescar");
        Tarefa tar3 = new Tarefa();
        tar3.setNome("Fazer compras");
        Tarefa tar4 = new Tarefa();
        tar4.setNome("Estudar");
        Tarefa tar5 = new Tarefa();
        tar5.setNome("Trabalhar");
        Tarefa tar6 = new Tarefa();
        tar6.setNome("Aprender Orientação a Objetos");

        lista1.getListaTarefas().add(tar1);
        lista1.getListaTarefas().add(tar2);
        lista1.getListaTarefas().add(tar3);
        lista1.getListaTarefas().add(tar4);
        lista1.getListaTarefas().add(tar5);
        lista1.getListaTarefas().add(tar6);

        TipoTarefa tipo1 = new TipoTarefa();
        tipo1.setNome("Facil");
        tipo1.setTempo(10f);
        TipoTarefa tipo2 = new TipoTarefa();
        tipo2.setNome("Médio");
        tipo2.setTempo(15f);
        TipoTarefa tipo3 = new TipoTarefa();
        tipo3.setNome("Difícil");
        tipo3.setTempo(20f);

        tar1.setTipo(tipo1);
        tar2.setTipo(tipo1);
               
        tar3.setTipo(tipo2);
        tar4.setTipo(tipo2);
       
        tar5.setTipo(tipo3);
        tar6.setTipo(tipo3);

        /*No método main da classe , instanciar as classes acima, em seguida 
        chamar o método calculaTempoTotal() 
        guardar seu resultado em uma variável e apresentar em tela */
        var guardar = lista1.calculaTempoTotal();
        System.out.println("O tempo total e " + guardar);

    } 
}
//se não é void -> tem retorno.