package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import sistema.entity.Cliente;
import sistema.service.ClienteService;
import sistema.view.FormularioCliente;
import sistema.view.ListagemCliente;

public class ListagemClienteController implements ActionListener {
    private  ClienteService service = new ClienteService();
    private ListagemCliente view;

    public ListagemClienteController(ListagemCliente view) {
        this.view = view;
    }
    
    /*  ASSOCIAÇÃO DE USO E NÃO DE DADOS. 
    O cliente faz uso do serviço e o serviço usa o cliente.
    A tela usa o controlador, e para ela chamar vai ter que pedir a lista de cliente*/
    
    public ArrayList<Cliente> getAllClientes(){ //devolve todos os clientes
        return service.getAllClientes();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
    JComponent botaoClicado = (JComponent)e.getSource(); //CLIC DE BOTAO, SE DR CLIC EM OUTRA COISA DÁ ERRO. PORISSO É NECESSÁRIO CRIAR UM CÓDIGO GENÉRICO.

        switch (botaoClicado.getName()){
            case "btnNovo":
            btnNovoClique();
            break;
            case "btnAlterar":
            //JOptionPane.showMessageDialog(null, "BOTAO ALTERAR");
            btnAlterarClique();
            break;
            case "btnExcluir":
            //JOptionPane.showMessageDialog(null, "BOTAO EXCLUIR");
            btnExcluirClique();
            break;
        }
    }
    private void btnNovoClique(){
        //JOptionPane.showMessageDialog(null, "BOTAO NOVO");
        Cliente novoCliente = new Cliente();
        FormularioCliente formulario = new FormularioCliente(novoCliente);
        service.save(novoCliente);
        view.atualizaTabela();

    }
    private void btnAlterarClique(){
        //JOptionPane.showMessageDialog(null, "BOTAO ALTERAR");   
        var clienteClicado = view.getCliente();
        if(clienteClicado != null){
            FormularioCliente formulario = new FormularioCliente(clienteClicado);
            service.save(clienteClicado);
            view.atualizaTabela();
        } 
    }
    private void btnExcluirClique(){
        //JOptionPane.showMessageDialog(null, "BOTAO EXCLUIR");
        var clienteClicado = view.getCliente();
        if(clienteClicado != null){
            var numBotao = JOptionPane.showConfirmDialog(null, "Tem certeza que você quer excluir o registro?");
            if(numBotao == 0){
                service.remove(clienteClicado);
            }
            view.atualizaTabela();
        } 
    }
}
/*.getSource => botão
ActionEvent => manda no formato objeto
JButton botaoClicado = (JButton)e.getSource(); CLIC DE BOTAO, SE DER CLIC 
EM OUTRA COISA DÁ ERRO. 
PORISSO É NECESSÁRIO CRIAR UM CÓDIGO GENÉRICO 
botão JButon => Publisher
Controlador => Concrete Subscribers
interface Subscriber + update(context) é o ACORDO
A INTERFACE (ActionListener) é esse acordo (ActionPerformed (event: ActionEvent)void
SOLID => but closed for modification -> principio aberto e fechado. 
(As empresas pedem os cinco principios do Solid) */




