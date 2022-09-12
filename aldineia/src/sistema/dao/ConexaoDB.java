package sistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private Connection conn;
    private String stringConnexao = "jdbc:mariadb://localhost/dbsistema";
    private String usuario = "root";
    private String senha = "univille";
    private static ConexaoDB instance;

    private ConexaoDB() throws SQLException { //altera de public para private 
        this.conn = DriverManager.getConnection(stringConnexao, usuario, senha);
        //qdo der erro, 1º precisa estar importado, 2º clicar na lâmpada 1ª opção declaretion, onde irá aparecer throws SQLException, que joga para fora o erro
        //não usar try/cath porque não dá condição de se resolver o problema.
    }  
      
    public static ConexaoDB getInstance() throws SQLException{ //throws SQLException joga para fora o erro
        if(instance == null){
            instance = new ConexaoDB();
        }
        return instance;
    }
    public Connection getConn(){
        return this.conn;
    }
    
}
//Singleton -> padrão de projeto
