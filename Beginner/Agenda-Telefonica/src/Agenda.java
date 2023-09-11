import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
  private final List<Contato> contatos = new ArrayList<>();

  // Adicionar um contato à lista
  public void adicionarContato(Contato contato) {
    contatos.add(contato);
  }

  // Remover um contato da lista
  public boolean removerContato(String nome) {
    for (Contato contato : contatos) {
      if (contato.getNome().equals(nome)) {
        contatos.remove(contato);
        return true; // Contato removido com sucesso
      }
    }
    return false; // Contato não encontrado
  }

  // Buscar contato pelo nome e retornar uma instância de Contato
  public Contato buscarContatoPorNome(String nome) {
    for (Contato contato : contatos) {
      if (contato.getNome().equals(nome)) {
        return contato;
      }
    }
    return null; // Contato não encontrado
  }

  // Buscar contato pelo email e retornar uma instância de Contato
  public Contato buscarContatoPorEmail(String email) {
    for (Contato contato : contatos) {
      if (contato.getEmail().equals(email)) {
        return contato;
      }
    }
    return null; // Contato não encontrado
  }

  // Buscar contato pelo telefone e retornar uma instância de Contato
  public Contato buscarContatoPorTelefone(long telefone) {
    for (Contato contato : contatos) {
      if (contato.getTelefone() == telefone) {
        return contato;
      }
    }
    return null; // Contato não encontrado
  }

  public Contato buscarPorDataNascimento(LocalDate dataNascimento) {
    for (Contato contato : contatos) {
      if (contato.getDataNascimento().equals(dataNascimento)) {
        return contato;
      }
    }
    return null; // Contato não encontrado
  }

  // Consultar o tamanho da Agenda
  public int consultarTamanho() {
    return contatos.size();
  }
}
