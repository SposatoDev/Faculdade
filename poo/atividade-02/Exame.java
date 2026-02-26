package atividade-02;

import java.time.LocalDate;

public class Exame {

  public Date data;
  public String consulta;
  public String descritivo;

  public void solicitar () {
    System.out.println("Exame solicitado!");
  }

  public void consultar () {
    System.out.println("Exame consultado!");
  }

  public void mostrar () {
    System.out.println("Exame");
    System.out.println("Data: " + data);
    System.out.println("Consulta: " + consulta);
    System.out.println("Descrição: " + descritivo);
  }
  
}
