package sistema.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import sistema.dao.ClienteDao;
import sistema.entity.Cliente;

public class ClienteService {
    //private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ClienteDao clienteDao = new ClienteDao();

    public ClienteService(){
        /*var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCPF("555.555.555-55");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 05, 12);
        cliente1.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Huguinho");
        cliente2.setCPF("666.666.666-66");
        calendario.set(2022, 06, 13);
        cliente2.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Paulinha");
        cliente3.setCPF("777.777.777-77");
        calendario.set(2022, 07, 14);
        cliente3.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente3);*/

    }
    public ArrayList<Cliente> getAllClientes(){
        return clienteDao.getAll();
    }
    public Cliente save(Cliente cliente){
        //listaClientes.add(cliente);
        clienteDao.save(cliente);
        return cliente;
    }
    public void remove(Cliente cliente) {
        clienteDao.delete(cliente.getId());
    }

}
    
// Casos de Uso (Regra de Negócio) = public class ClienteService;
