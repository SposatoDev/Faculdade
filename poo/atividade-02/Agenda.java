package atividade-02;

import java.time.LocalDate; 
import java.time.LocalTime;

public class Agenda {

  public LocalDate data;
  public LocalTime hora;
  public Medico medico;
  public Paciente paciente;

  public void consultar () {
    System.out.println("Consulta realizada!");
  }

  public void mostrar() {
    System.out.println("Médico: " + medico);
    System.out.println("Paciente: " + paciente);
    System.out.println("Data: " + data);
    System.out.println("Hora: " + hora);
  }
  
}
