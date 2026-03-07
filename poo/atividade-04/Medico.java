package atividade-02;

public class Medico {

  private String nome;
  private String crm;
  private String telefone;
  private String especialidade;
  private String senha;

  public Medico() {
  }

  public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
    try {
      this.nome = nome;
      this.crm = crm;
      this.telefone = telefone;
      this.especialidade = especialidade;
      this.senha = senha;
    } catch (Exception e) {
      this.nome = "";
      this.crm = "";
      this.telefone = "";
      this.especialidade = "";
      this.senha = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    try {
      this.nome = nome;
    } catch (Exception e) {
      this.nome = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getCrm() {
    return crm;
  }

  public void setCrm(String crm) {
    try {
      this.crm = crm;
    } catch (Exception e) {
      this.crm = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    try {
      this.telefone = telefone;
    } catch (Exception e) {
      this.telefone = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    try {
      this.especialidade = especialidade;
    } catch (Exception e) {
      this.especialidade = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    try {
      this.senha = senha;
    } catch (Exception e) {
      this.senha = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public void acessar() {
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
