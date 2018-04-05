package onlypackage;

import java.util.*;
import java.util.stream.Collectors;

public class DiskPizza { 
  
  public static void main(String[] args) {
    List<Pedidos> pedidos = new ArrayList<>();
    
    List<Clientes> clientes = new ArrayList<>();
    clientes.add(new Clientes("Teste1", "111.111.111-11", "3900-0001", "Rua Teste 1"));
    clientes.add(new Clientes("Teste2", "222.222.222-22", "3900-0002", "Rua Teste 2"));
    clientes.add(new Clientes("Teste3", "333.333.333-33", "3900-0003", "Rua Teste 3"));
    clientes.add(new Clientes("Teste4", "444.444.444-44", "3900-0004", "Rua Teste 4"));
    clientes.add(new Clientes("Teste5", "555.555.555-55", "3900-0005", "Rua Teste 5"));
    
    List<Ingredientes> ingredientes = new ArrayList<>();
    ingredientes.add(new Ingredientes("Peperoni", 5.75));
    ingredientes.add(new Ingredientes("Calabresa", 2.25));
    ingredientes.add(new Ingredientes("Camarão", 7));
    ingredientes.add(new Ingredientes("Queijo", 2));
    ingredientes.add(new Ingredientes("Frango", 3.5));
    
    List<Pizzas> pizzas = new ArrayList<>();
    pizzas.add(new Pizzas("Pizza1", 1));
    pizzas.get(0).addIngrediente(ingredientes.get(0));
    pizzas.add(new Pizzas("Pizza2", 2));
    pizzas.get(1).addIngrediente(ingredientes.get(1));
    pizzas.add(new Pizzas("Pizza3", 3));
    pizzas.get(2).addIngrediente(ingredientes.get(2));
    pizzas.add(new Pizzas("Pizza4", 4));
    pizzas.get(3).addIngrediente(ingredientes.get(3));
    pizzas.add(new Pizzas("A la carte", 99));
    
    List<Bebidas> bebidas = new ArrayList<>();
    bebidas.add(new Bebidas("Bebida1", true, 5, 10));
    bebidas.add(new Bebidas("Bebida2", false, 1, 3));
    bebidas.add(new Bebidas("Bebida3", false, 15, 8));
    bebidas.add(new Bebidas("Bebida4", true, 3, 35));
    bebidas.add(new Bebidas("Bebida5", false, 0, 1));
    
    String telTeste = "3900-0003";
    
    List<Clientes> clientePedido = clientes.stream()
     .filter(cliente -> cliente.getTelefone().equals(telTeste))
     .collect(Collectors.toList());
    
    Pedidos primeiroPedido = new Pedidos(clientePedido.get(0), 0);
    
    primeiroPedido.addBebida(bebidas.get(1));
    primeiroPedido.addPizza(pizzas.get(2));
    
    Pizzas novaPizza = pizzas.get(4);
    novaPizza.addIngrediente(ingredientes.get(4));
    primeiroPedido.addPizza(novaPizza);
    
    System.out.println(primeiroPedido.getCliente().getNome());
    System.out.println(primeiroPedido.getTotalPedido());
  }
}
