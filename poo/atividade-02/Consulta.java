package atividade-02;

import java.time.LocalDate; 
import java.time.LocalTime;

public class Consulta {

  public LocalDate data;
  public LocalTime hora;
  public String medico;
  public String paciente;
  public String motivo;
  public String historico;

  public void marcar () {
    System.out.println("Consulta marcada!");
  }

  public void cancelar () {
    System.out.println("Consulta cancelada!");
  }

  public void consultar () {
    System.out.println("Sistema acessado!");
  }

  public void realizar () {
    System.out.println("Consulta realizada!");
  }

  public void atualizar () {
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
