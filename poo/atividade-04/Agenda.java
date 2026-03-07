package atividade-02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

  private LocalDate data;
  private LocalTime hora;
  private Medico medico;
  private Paciente paciente;

  public Agenda() {
  }

  public Agenda(LocalDate data, LocalTime hora, Medico medico, Paciente paciente) {
    try {
      this.data = data;
      this.hora = hora;
      this.medico = medico;
      this.paciente = paciente;
    } catch (Exception e) {
      this.data = null;
      this.hora = null;
      this.medico = null;
      this.paciente = null;
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

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    try {
      this.medico = medico;
    } catch (Exception e) {
      this.medico = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    try {
      this.paciente = paciente;
    } catch (Exception e) {
      this.paciente = null;
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void consultar() {
    System.out.println("Consulta realizada!");
  }

  public void mostrar() {
    System.out.println("Médico: " + medico);
    System.out.println("Paciente: " + paciente);
    System.out.println("Data: " + data);
    System.out.println("Hora: " + hora);
  }

}
