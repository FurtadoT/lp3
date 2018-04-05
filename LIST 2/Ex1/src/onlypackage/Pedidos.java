package onlypackage;

import java.util.*;

public class Pedidos {
  private Clientes cliente;
  
  List<Pizzas> pizzas = new ArrayList<>();
  List<Bebidas> bebidas = new ArrayList<>();
  
  private int numPedido;
  
  public Pedidos(Clientes cliente, int numPedido){
    this.cliente = cliente;
    this.numPedido = numPedido;
  }
  
  public boolean addPizza(Pizzas pizza){
    this.pizzas.add(pizza);
    return true;
  }
  
  public boolean addBebida(Bebidas bebida){
    this.bebidas.add(bebida);
    return true;
  }
  
  public double getTotalPedido(){
    double totalAPagar = 0;
    
    totalAPagar = this.pizzas.stream()
            .map((pizza) -> pizza.getPreco())
            .reduce(totalAPagar, (accumulator, _item) -> accumulator + _item);
    
    totalAPagar = this.bebidas.stream()
            .map((bebida) -> bebida.getPreco())
            .reduce(totalAPagar, (accumulator, _item) -> accumulator + _item);
    
    return totalAPagar;
  }

  /**
   * @return the numPedido
   */
  public int getNumPedido() {
    return numPedido;
  }

  /**
   * @return the cliente
   */
  public Clientes getCliente() {
    return cliente;
  }
}
