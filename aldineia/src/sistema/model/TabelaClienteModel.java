package sistema.model;

import javax.swing.table.AbstractTableModel;

import sistema.controller.ListagemClienteController;

public class TabelaClienteModel extends AbstractTableModel{

    private ListagemClienteController controller;

    public TabelaClienteModel(ListagemClienteController controller) {
        this.controller = controller;
    }


    @Override
    public int getRowCount() { //linhas
        return controller.getAllClientes().size(); //size=tamanho
    }

    @Override
    public int getColumnCount() { //colunas
        return 4;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var umCliente = controller.getAllClientes().get(rowIndex);
        switch (columnIndex) {
            case 0:
            return umCliente.getId();
            case 1:
            return umCliente.getNome();
            case 2:
            return umCliente.getCPF();
            case 3:
            return umCliente.getDataNascimento();

            default:
            return "";
        }
              
    }
    @Override // Source Action Override/Implement Methods...
    public String getColumnName(int column) {
        return new String[]{"Código", "Nome", "CPF", "Data Nascimento"}[column];  }

    }

/*  a coluna é o campo do cliente / linha é o cliente


Mistura de classe com interface Abstract (Têm que ser herança)
getRowCount -> pega o contador de linhas
getColumnCount -> colunas
getValueAt -> me dá um valor num lugar (desenha cada celula da coluna)
Tudo o que se coloca na variável vai para a memória RAM, a 
qualquer momento ela pode ser apagada. Precisa de uma memória 
secundária (HD).
Arquivo CSV, separado por ponto e vírgula.
ex:100;zezinho, 555555555-55;01/01/2000,porém qualquer pessoa com 
acesso ao HD pode apagar.
Alguns Bancos de dados: IBM Db2, mariaDB, linguagem sql
Cookie uma informação que me identifica, sem aceitar os cookies, os 
sites não funcionam e para roubar tem que ter acesso fisico ao 
computador.
Usar aplicativos oficiais para segurança 
O controlador adapta os dados para a tela*/