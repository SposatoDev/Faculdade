package atividade-02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {

  private LocalDate data;
  private LocalTime hora;
  private String medico;
  private String paciente;
  private String motivo;
  private String historico;

  public Consulta() {
  }

  public Consulta(LocalDate data, LocalTime hora, String medico, String paciente, String motivo, String historico) {
    try {
      this.data = data;
      this.hora = hora;
      this.medico = medico;
      this.paciente = paciente;
      this.motivo = motivo;
      this.historico = historico;
    } catch (Exception e) {
      this.data = null;
      this.hora = null;
      this.medico = "";
      this.paciente = "";
      this.motivo = "";
      this.historico = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    try {
      this.data = data;
    } catch (Exception e) {
      this.data = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    try {
      this.hora = hora;
    } catch (Exception e) {
      this.hora = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getMedico() {
    return medico;
  }

  public void setMedico(String medico) {
    try {
      this.medico = medico;
    } catch (Exception e) {
      this.medico = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getPaciente() {
    return paciente;
  }

  public void setPaciente(String paciente) {
    try {
      this.paciente = paciente;
    } catch (Exception e) {
      this.paciente = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(String motivo) {
    try {
      this.motivo = motivo;
    } catch (Exception e) {
      this.motivo = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getHistorico() {
    return historico;
  }

  public void setHistorico(String historico) {
    try {
      this.historico = historico;
    } catch (Exception e) {
      this.historico = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void marcar() {
    System.out.println("Consulta marcada!");
  }

  public void cancelar() {
    System.out.println("Consulta cancelada!");
  }

  public void consultar() {
    System.out.println("Sistema acessado!");
  }

  public void realizar() {
    System.out.println("Consulta realizada!");
  }

  public void atualizar() {
    System.out.println("Consulta atualizada!");
  }

  public void mostrar() {
    System.out.println("Médico: " + medico);
    System.out.println("Paciente: " + paciente);
    System.out.println("Motivo da consulta: " + motivo);
    System.out.println("Histórico do paciente: " + historico);
    System.out.println("Data: " + data);
    System.out.println("Hora: " + hora);
  }

}
