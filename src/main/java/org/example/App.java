package org.example;


public class App {
    public static void main(String[] args) {
        //creamos los 5 clientes
        Cliente cliente1 = new Cliente(1L, "Carmen", 0L, "Activo");
        Cliente cliente2 = new Cliente(2L, "Francisco", 6L, "Inactivo");
        Cliente cliente3 = new Cliente(3L, "Maria", 5L, "Activo");
        Cliente cliente4 = new Cliente(4L, "Carlos", 3L, "Activo");
        Cliente cliente5 = new Cliente(6L, "Laura", 0L, "Inactivo");

        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.insertarCliente(cliente1);
            clienteDAO.insertarCliente(cliente2);
            clienteDAO.insertarCliente(cliente3);
            clienteDAO.insertarCliente(cliente4);
            clienteDAO.insertarCliente(cliente5);

            System.out.println(clienteDAO.estadisticas());
            System.out.println(clienteDAO.getCliente(4L));
            System.out.println(clienteDAO.listarMejoresClientes(4L));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
