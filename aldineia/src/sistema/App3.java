package sistema;

import java.sql.SQLException;

import sistema.dao.ConexaoDB;
import sistema.view.ListagemCliente;

public class App3 {
    public static void main(String[] args) {
       ListagemCliente listagem = new ListagemCliente();
        
        /*var connDB = new ConexaoDB(); => não dá para dar new porque
        ele é privado na classe ConexaoDB.java e
        quando precisar chamar usa getInstance()
        try{
            var connDB = ConexaoDB.getInstance();
            System.out.println(connDB);
            **milhares de linhas de codigo java 
            var connDB2 = ConexaoDB.getInstance();
            System.out.println(connDB2);
            **Design patterns
        }catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
    
