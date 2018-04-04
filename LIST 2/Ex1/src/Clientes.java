public final class Clientes {
  private String nome;
  private String cpf;
  private String telefone;
  private String endereco;
  
  
  public Clientes(String telefone){
    this.setTelefone(telefone);
  }
  
  public Clientes(String nome, String cpf, String telefone, String endereco){
    this.setNome(nome);
    this.setCpf(cpf);
    this.setTelefone(telefone);
    this.setEndereco(endereco);
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
   * @return the cpf
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * @param cpf the cpf to set
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  /**
   * @return the telefone
   */
  public String getTelefone() {
    return telefone;
  }

  /**
   * @param telefone the telefone to set
   */
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  /**
   * @return the endereco
   */
  public String getEndereco() {
    return endereco;
  }

  /**
   * @param endereco the endereco to set
   */
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}
