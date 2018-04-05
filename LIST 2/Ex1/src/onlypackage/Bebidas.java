package onlypackage;

public final class Bebidas extends Produtos {
  private boolean isAlcaholic;
  private int qtdEstoque;
  private double preco;
  
  public Bebidas(String nome, int qtdEstoque, double preco){
    this.setNome(nome);
    this.isAlcaholic = false;
    this.qtdEstoque = qtdEstoque;
    this.preco = preco;
  }
  
  /**
   *
   * @param nome
   * @param isAlcaholic
   * @param qtdEstoque
   * @param preco
   */
  public Bebidas(String nome, boolean isAlcaholic, int qtdEstoque, double preco){
    this.setNome(nome);
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

  /**
   * @return the qtdEstoque
   */
  public int getQtdEstoque() {
    return qtdEstoque;
  }

  /**
   * @param qtdEstoque the qtdEstoque to set
   * @return 
   */
  public boolean setQtdEstoque(int qtdEstoque) {
    if (qtdEstoque < 0)
      return false;
    
    this.qtdEstoque = qtdEstoque;
    return true;
  }
}
