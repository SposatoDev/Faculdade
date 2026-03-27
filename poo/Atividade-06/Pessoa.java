
public class Pessoa {

  private String nome;
  private String cpf;
  private String telefone;
  private String sexo;
  private Int idade;
  

  public Pessoa () {}

  public Pessoa (String nome, String cpf, String telefone, Int idade) {
    try {
      this.nome = nome;
      this.cpf = cpf;
      this.telefone = telefone;
      this.idade = idade;
    } catch (Exception e) {
      this.nome = "";
      this.cpf = "";
      this.telefone = "";
      this.idade = null;
      system.out.println("Ocorreu uma exceção - Valores padrões definidos");
    }
  }

  public String getNome () {
    return nome;
  }

  public void setNome (string nome) {
    try {
      this.nome = nome;
    } catch (Exception e) {
      this.nome = ""
      system.out.println("Ocorreu uma exceção - Valores padrões definidos");
    }
  }

  public String getCpf () {
    return cpf;
  }

  public void setCpf (string cpf) {
    try {
      this.cpf = cpf;
    } catch (Exception e) {
      this.cpf = "";
      system.out.println("Ocorreu uma exceção - Valores padrões definidos");
    }
  }

  public String getTelefone () {
    return telefone;
  }

  public void setTelefone (String telefone) {
    try {
      this.telefone = telefone;
    } catch (Exception e) {
      this.telefone = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public String getSexo () {
    return sexo;
  }

  public void setSexo (String sexo) {
    try {
      this.sexo = sexo;
    } catch (Exception e) {
      this.sexo = "";
      System.out.println("Ocorreu uma exceção – Valores padrões definidos");
    }
  }

  public int getIdade () {
    return idade;
  }

  public void setIdade (int idade) {
    try {
      this.idade = idade;
    } catch (exception e) {
      this.idade = null;
      system.out.println("Ocorreu uma exceção - Valores padrões ");
    }
  }

  public void mostrarPessoa () {
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + getCpf());
    System.out.println("Telefone: " + getTelefone());
    System.out.println("Sexo: " + GetSexo());
    System.out.println("Idade: " + GetIdade());
  }
  
}
