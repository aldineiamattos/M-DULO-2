package sistema.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import sistema.controller.ListagemClienteController;
import sistema.entity.Cliente;
import sistema.model.TabelaClienteModel;
import java.awt.FlowLayout;


public class ListagemCliente extends JFrame {
    //ListagemCliente ->FILHO Subclasse JFrame ->PAI Super Classe
    
    private JScrollPane jpnCentro; // depois de criar a tabela
    private JPanel jpnSul = new JPanel();
    //Desenhando a tele - criando 3 botões:
    private JButton btnNovo = new JButton("Novo");
    private JButton btnAlterar = new JButton("Alterar");
    private JButton btnExcluir = new JButton("Excluir");

    private ListagemClienteController controller =  new ListagemClienteController(this);
    
    //O controlador pede para serviços e o serviço acessa a identidade(conforme gráfico);
    
    private TabelaClienteModel tabelaModel = new TabelaClienteModel(controller); //-> inclui o controller no ();
    private JTable tabela = new JTable(tabelaModel);

    public Cliente getCliente(){ //Alteração do método void para Cliente
        if(tabela.getSelectedRow() > 0) //as chaves não são obrigatórias porque só têm uma linha para ser executada.
            return controller.getAllClientes().get(tabela.getSelectedRow());
               
        return null;
    }
    
    public ListagemCliente() { //CONSTRUTOR
        setSize(500,400); 
        setTitle("Listagem de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //colocar essa linha somente na tela principal
        criaPaineis(); //chama o metodo!!!!!
        setVisible(true);
    }

        public void atualizaTabela(){
            tabelaModel.fireTableDataChanged();
        }

    private void criaPaineis(){ //import java.awt.FlowLayout;
        jpnSul.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(jpnSul,"South");// =>passar o nome da região 
        jpnSul.add(btnNovo);
        jpnSul.add(btnAlterar);
        jpnSul.add(btnExcluir);

        btnNovo.addActionListener(controller);
        btnNovo.setName(("btnNovo"));
        btnAlterar.addActionListener(controller);
        btnAlterar.setName("btnAlterar");
        btnExcluir.addActionListener(controller);
        btnExcluir.setName("btnExcluir");
       
        jpnCentro = new JScrollPane(tabela);
        jpnCentro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jpnCentro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        add(jpnCentro,"Center"); 
        // para criar a tabela eu preciso do controlador;
      
    }       
    
}
