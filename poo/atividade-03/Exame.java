package atividade-02;

import java.time.LocalDate;

public class Exame {

  private LocalDate data;
  private String consulta;
  private String descritivo;

  public Exame() {
  }

  public Exame(LocalDate data, String consulta, String descritivo) {
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

  public void solicitar() {
    System.out.println("Exame solicitado!");
  }

  public void consultar() {
    System.out.println("Exame consultado!");
  }

  public void mostrar() {
    System.out.println("Exame");
    System.out.println("Data: " + data);
    System.out.println("Consulta: " + consulta);
    System.out.println("Descrição: " + descritivo);
  }

}