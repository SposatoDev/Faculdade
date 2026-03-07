package atividade-02;

public class Paciente {

  private String nome;
  private String cpf;
  private String telefone;
  private String genero;
  private int idade;

  public Paciente() {
  }

  public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
    try {
      this.nome = nome;
      this.cpf = cpf;
      this.telefone = telefone;
      this.genero = genero;
      this.idade = idade;
    } catch (Exception e) {
      this.nome = "";
      this.cpf = "";
      this.telefone = "";
      this.genero = "";
      this.idade = 0;
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

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    try {
      this.genero = genero;
    } catch (Exception e) {
      this.genero = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    try {
      this.idade = idade;
    } catch (Exception e) {
      this.idade = 0;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void cadastrar() {
    System.out.println("Paciente cadastrado!");
  }

  public void consultar() {
    System.out.println("Consultando paciente!");
  }

  public void mostrar() {
    System.out.println("PACIENTE");
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Telefone: " + telefone);
    System.out.println("Gênero: " + genero);
    System.out.println("Idade: " + idade);
  }

}
