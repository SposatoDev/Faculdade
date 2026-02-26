package atividade-02;

import java.time.LocalDate;

public class Receita {

  public Date data;
  public String consulta;
  public String descritivo;

  public void preescrever () {
    System.out.println("Receita preescrevida!");
  }

  public void consultar () {
    System.out.println("Receita consultada!");
  }

  public void mostrar () {
    System.out.println("Receita");
    System.out.println("Data: " + data);
    System.out.println("Consulta: " + consulta);
    System.out.println("Descrição: " + descritivo);
  }
  
}
