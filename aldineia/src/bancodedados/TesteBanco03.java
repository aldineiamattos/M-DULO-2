package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBanco03 {
    public static void main(String[] args) {
            //UPDATE NO BANCO DE DADOS (ATUALIZAR)

        var stringConnexao = "jdbc:mariadb://localhost/dbexerc1";
        var usuario = "root";
        var senha = "univille";
        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            //conexão do banco
            var sql = "update aluno set nome = ? where numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Maga Pata da Silva"); //1 ref ao 1º ?
            ps.setInt(2, 10);//2 ref ao 2º ?
            var numlinhasafetadas = ps.executeUpdate();
            System.out.println("Total de linhas afetadas: " + numlinhasafetadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

            
            
            
            
             
        
   
        
    
    

