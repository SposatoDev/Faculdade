package atividade-02;

import java.time.LocalDate;

public class Receita {

  private LocalDate data;
  private String consulta;
  private String descritivo;

  public Receita() {
  }

  public Receita(LocalDate data, String consulta, String descritivo) {
    this.data = data;
    this.consulta = consulta;
    this.descritivo = descritivo;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public String getConsulta() {
    return consulta;
  }

  public void setConsulta(String consulta) {
    this.consulta = consulta;
  }

  public String getDescritivo() {
    return descritivo;
  }

  public void setDescritivo(String descritivo) {
    this.descritivo = descritivo;
  }

  public void preescrever() {
    System.out.println("Receita preescrevida!");
  }

  public void consultar() {
    System.out.println("Receita consultada!");
  }

  public void mostrar() {
    System.out.println("Receita");
    System.out.println("Data: " + data);
    System.out.println("Consulta: " + consulta);
    System.out.println("Descrição: " + descritivo);
  }

}
