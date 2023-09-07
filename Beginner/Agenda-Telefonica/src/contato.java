import java.sql.Date;

public class contato {
  private String nome;
  private int telefone;
  private String email;
  private String endereco;
  private Date dataNascimento;

  public contato(String nome, int telefone, String email, String endereco, Date dataNascimento) {
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.endereco = endereco;
    this.dataNascimento = dataNascimento;
  }
  
  public String getNome() {
    return nome;
  }

  public int getTelefone() {
    return telefone;
  }

  public String getEmail() {
    return email;
  }

  public String getEndereco() {
    return endereco;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

}
