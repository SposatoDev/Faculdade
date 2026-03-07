package atividade-02;

public class Recepcionista {

  private String nome;
  private String cpf;
  private String telefone;
  private String senha;

  public Recepcionista() {
  }

  public Recepcionista(String nome, String cpf, String telefone, String senha) {
    try {
      this.nome = nome;
      this.cpf = cpf;
      this.telefone = telefone;
      this.senha = senha;
    } catch (Exception e) {
      this.nome = "";
      this.cpf = "";
      this.telefone = "";
      this.senha = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    try {
      this.nome = nome;
    } catch (Exception e) {
      this.nome = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    try {
      this.cpf = cpf;
    } catch (Exception e) {
      this.cpf = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    try {
      this.telefone = telefone;
    } catch (Exception e) {
      this.telefone = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    try {
      this.senha = senha;
    } catch (Exception e) {
      this.senha = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void acessar() {
    System.out.println("Sistema acessado! Recepcionista: " + nome);
  }

  public void mostrar() {
    System.out.println("Recepcionista");
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Telefone: " + telefone);
  }

}
