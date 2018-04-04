public class Bebidas extends Produtos {
  private boolean isAlcaholic;
  private int qtdEstoque;
  private double preco;
  
  public Bebidas(int qtdEstoque, double preco){
    this.isAlcaholic = false;
    this.qtdEstoque = qtdEstoque;
    this.preco = preco;
  }
  
  public Bebidas(boolean isAlcaholic, int qtdEstoque, double preco){
    this.isAlcaholic = isAlcaholic;
    this.qtdEstoque = qtdEstoque;
    this.preco = preco;
  }
  
  public boolean alterarPreco(double preco){
    if (preco < 0)
      return false;
    
    this.preco = preco;
    return true;
  }
  
  public boolean adicionarEstoque(int qtdAdicionar){
    if (qtdAdicionar < 0)
      return false;
    
    this.setQtdEstoque(this.getQtdEstoque() + qtdAdicionar);
    return true;
  }
  
  @Override
  public double getPreco(){
    return isAlcaholic? this.preco*1.1 : this.preco;
  }

  /**
   * @return the qtdEstoque
   */
  public int getQtdEstoque() {
    return qtdEstoque;
  }

  /**
   * @param qtdEstoque the qtdEstoque to set
   */
  public boolean setQtdEstoque(int qtdEstoque) {
    if (qtdEstoque < 0)
      return false;
    
    this.qtdEstoque = qtdEstoque;
    return true;
  }
}
