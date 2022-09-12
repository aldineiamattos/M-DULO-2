package sistema.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.mariadb.jdbc.client.Client;

import sistema.entity.Cliente;

public class ClienteDao {
    //Essa classe faz o mapeamento objeto java com o banco de dados
    //banco de dados tem varios registros que são as linhas
    //getAll pega tudo (uma lista de clientes)
    //Cada registro do banco vira uma instancia de objeto
    public ArrayList<Cliente> getAll(){
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try{
            var conn = ConexaoDB.getInstance().getConn();
            var sql = "SELECT * FROM cliente";
            PreparedStatement ps = conn.prepareStatement(sql);
            //PreparedStatement substitui os pontos de ??
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //ORM - Object Relational Mapping (Mapeamento Objeto Relacional)
                Cliente novoCliente = new Cliente();
                novoCliente.setId(rs.getLong("id"));
                novoCliente.setNome(rs.getString("nome"));
                novoCliente.setCPF(rs.getString("cpf"));
                novoCliente.setDataNascimento (rs.getDate("dataNascimento"));
                lista.add(novoCliente);//essa chamada acontece no serviço
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    public void save(Cliente cliente) {
        //olhar o ID cliente - Se o ID for 0 é novo
        //SE ID == 0 -> Executar insert no banco - INSERT INTO TABELA
        //SE ID != 0 -> Executar update - UPDATE TABELA SET CAMPO=...   
        
        try{        
            var conn = ConexaoDB.getInstance().getConn();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if(cliente.getId() == 0){
                //INSERT - inserindo
                var sql = "INSERT INTO cliente(nome, cpf, datanascimento) " +
                    " values(?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCPF());
                ps.setString(3, sdf.format (cliente.getDataNascimento()));
                ps.executeUpdate();
            }else{
                //UPDATE - atualizando
                var sql = "UPDATE cliente set nome = ?, cpf = ?, datanascimento = ? " +
                        " where id = ?"; //espaço em branco antes "
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCPF());
                ps.setString(3, sdf.format (cliente.getDataNascimento()));
                ps.setLong(4, cliente.getId());
                ps.executeUpdate();
                //throws SQLException =>  não usa try/catch
            }   
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Cliente getClienteById(long id){
        Cliente umCliente = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            var conn = ConexaoDB.getInstance().getConn();
            // fazer uma logica para buscar um cliente
            var sql = "SELECT * FROM cliente where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){ //cursor
                umCliente = new Cliente();
                //hdratação do objeto
                umCliente.setId(rs.getLong("id"));
                umCliente.setNome(rs.getString("nome"));
                umCliente.setCPF(rs.getString("cpf"));
                umCliente.setDataNascimento(sdf.parse(rs.getString("datanascimento")));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) { // apareceu ao clicar no erro datanascimento (2ª opção)
            e.printStackTrace();
        }  

        return umCliente;
    }

    public void delete(long id){ 
        try{
            var conn = ConexaoDB.getInstance().getConn();
            var sql = "DELETE FROM cliente where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
        
        
    
        
    
    

        
            
           
            
       
    
        
            
            
    
        

        

        
    

    
         
    
    
       
   

      
    
         

        

        
                   
        
