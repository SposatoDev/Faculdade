package atividade-02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Paciente {
  public String nome;
  public String cpf;
  public String telefone;
  public String genero;
  public Int idade;

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
