package atividade-02;

public class Recepcionista {

  public String nome;
  public String cpf;
  public String telefone;
  public String senha;

  public void acessar () {
    System.out.println("Sistema acessado! Recepcionista: " + nome);
  }

  public void mostrar () {
    System.out.println("Recepcionista");
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Telefone: " + telefone);
  }
  
}
