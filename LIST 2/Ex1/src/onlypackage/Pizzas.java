package onlypackage;

import java.util.*;

public final class Pizzas extends Produtos {
  private final List<Ingredientes> ingredientes = new ArrayList<>();
  
  public Pizzas(String nome, int id){
    this.setNome(nome);
    this.id = id;
  }
  
  public Pizzas(String nome, int id, List<Ingredientes> ingredientes){
    this.setNome(nome);
    this.id = id;
    
    ingredientes.stream().forEach((ingrediente) -> {
      this.addIngrediente(ingrediente);
    });
  }
  
  public boolean addIngrediente(Ingredientes ingrediente){
    this.ingredientes.add(ingrediente);
    return true;
  }
  
  @Override
  public double getPreco(){
    double totalAPagar = 0;
    
    totalAPagar = this.ingredientes.stream()
            .map((ingrediente) -> ingrediente.getValor())
            .reduce(totalAPagar, (accumulator, _item) -> accumulator + _item);
    
    return totalAPagar;
  }
  
   /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
