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
    this.data = data;
    this.hora = hora;
    this.medico = medico;
    this.paciente = paciente;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
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