
public class Medico extends Pessoa {

  private String crm;
  private String especialidade;
  private String senha;

  public Medico () {super();}

  public Medico (String nome, String crm, String cpf, 
                 String telefone, String sexo, int idade,
                 String especialidade, String senha) {
    try {
      super.setNome(nome);
      super.setCpf(cpf);
      super.setTelefone(telefone);
      super.setSexo(sexo);
      super.setIdade(idade);
      this.crm = crm;
      this.especialidade = especialidade;
      this.senha = senha;
    } catch (Exception e) {
      super.setNome("");
      super.setCpf("");
      super.setTelefone("");
      super.setSexo("");
      super.setIdade(null);
      this.crm = "";
      this.especialidade = "";
      this.senha = "";
      system.out.println("Ocorreu uma exceção - Valores padrões definidos");
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
    System.out.println("Sistema acessado! Médico: " + getNome());
  }

  public void mostrar() {
    System.out.println("MEDICO");
    System.out.println("Nome: " + getNome());
    System.out.println("cpf: " + getCpf());
    System.out.println("CRM: " + crm);
    System.out.println("Telefone: " + getTelefone());
    System.out.println("Sexo: " + getSexo());
    System.out.println("Idade: " + getIdade());
    System.out.println("Especialidade: " + especialidade);
  }
  
}
