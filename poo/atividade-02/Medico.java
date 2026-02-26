package atividade-02;

public class Medico {

  public String nome;
  public String crm;
  public String telefone;
  public String especialidade;
  public String senha;

  public void acessar () {
    System.out.println("Sistema acessado! Médico: " + nome);
  }

  public void mostrar() {
    System.out.println("MEDICO");
    System.out.println("Nome: " + nome);
    System.out.println("CRM: " + crm);
    System.out.println("Telefone: " + telefone);
    System.out.println("Especialidade: " + especialidade);
  }
   
}
