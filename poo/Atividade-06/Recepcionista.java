
public class Recepcionista extends Pessoa {
  
  private String senha;

  public Recepcionista () {super();}

  public Recepcionista (String nome, String cpf, String telefone, String sexo, Int idade, String senha) {
    try {
      super.setNome(nome);
      super.setCpf(cpf);
      super.setTelefone(telefone);
      super.setSexo(sexo);
      super.setIdade(idade);
      this.senha = senha;
    } catch (Exception e) {
      super.setNome("");
      super.setCpf("");
      super.setTelefone("");
      super.setSexo("");
      super.setIdade(null);
      this.senha = "";
      system.out.println("Ocorreu uma exceção - Valores padrões definidos");
    }
    
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha() {
    try {
      this.senha = senha;
    } catch (Exception e) {
      this.senha = "";
      system.out.println("Ocorreu uma exceção - Valores padrões definidos");
    } 
  }

  public void Acessar () {
    system.out.println("Sistema acessado! Recepcionista: " + getNome());
  }

  public void mostrar() {
    System.out.println("Recepcionista");
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + cpf);
    System.out.println("Telefone: " + getTelefone());
    System.out.println("Idade: " + getIdade());
    System.out.println("Sexo: " + getSexo());
  }
  
}
