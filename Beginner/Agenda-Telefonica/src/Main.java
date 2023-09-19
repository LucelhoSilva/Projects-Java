import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        String emojiFeliz = ":)";
        String emojiTriste = ":(";
        String emojiRaiva = ">:(";

        int escolha;
        do {
            printGrey("\n               menu:               ");
            printGrey("___________________________________");
            printGrey("\n1. Adicionar contato");
            printGrey("2. Remover contato");
            printGrey("3. Buscar contato por nome");
            printGrey("4. Buscar contato por email");
            printGrey("5. Buscar contato por telefone");
            printGrey("6. Consultar tamanho da Agenda");
            printGrey("7. Finalizar");
            printGrey("___________________________________");
            printGrey("       Escolha uma opção:          ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    printGrey("\nNome: ");
                    String nome = scanner.nextLine();
                    printGrey("Email: ");
                    String email = scanner.nextLine();
                    printGrey("Telefone: ");
                    int telefone = Integer.parseInt(scanner.nextLine());
                    printGrey("Aniversário (AAAA-MM-DD): ");
                    LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

                    Contato novoContato = new Contato(nome, email, telefone, dataNascimento);
                    agenda.adicionarContato(novoContato);
                    printGreen("\n Contato adicionado com sucesso! " + emojiFeliz);
                }
                case 2 -> {
                    System.out.print("\nNome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = agenda.removerContato(nomeRemover);
                    if (removido) {
                        printGreen("Contato removido com sucesso!");
                    } else {
                        printRed("Contato não encontrado. " + emojiTriste);
                    }
                }
                case 3 -> {
                    System.out.print("\nNome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoPorNome = agenda.buscarContatoPorNome(nomeBuscar);
                    if (contatoPorNome != null) {
                        printGreen("Contato encontrado:\nNome: " + contatoPorNome.getNome() +
                                "\nEmail: " + contatoPorNome.getEmail() +
                                "\nTelefone: " + contatoPorNome.getTelefone() +
                                "\nData de Nascimento: " + contatoPorNome.getDataNascimento());
                    } else {
                        printRed("Contato não encontrado. " + emojiTriste);
                    }
                }
                case 4 -> {
                    System.out.print("\nEmail do contato a ser buscado: ");
                    String emailBuscar = scanner.nextLine();
                    Contato contatoPorEmail = agenda.buscarContatoPorEmail(emailBuscar);
                    if (contatoPorEmail != null) {
                        printGreen("Contato encontrado:\nNome: " + contatoPorEmail.getNome() +
                                "\nEmail: " + contatoPorEmail.getEmail() +
                                "\nTelefone: " + contatoPorEmail.getTelefone() +
                                "\nData de Nascimento: " + contatoPorEmail.getDataNascimento());
                    } else {
                        printRed("Contato não encontrado. " + emojiTriste);
                    }
                }
                case 5 -> {
                    System.out.print("\nTelefone do contato a ser buscado: ");
                    int telefoneBuscar = scanner.nextInt();
                    Contato contatoPorTelefone = agenda.buscarContatoPorTelefone(telefoneBuscar);
                    if (contatoPorTelefone != null) {
                        printGreen("Contato encontrado:\nNome: " + contatoPorTelefone.getNome() +
                                "\nEmail: " + contatoPorTelefone.getEmail() +
                                "\nTelefone: " + contatoPorTelefone.getTelefone() +
                                "\nData de Nascimento: " + contatoPorTelefone.getDataNascimento().toString());
                    } else {
                        printRed("Contato não encontrado. " + emojiTriste);
                    }
                }
                case 6 -> {
                    int tamanhoAgenda = agenda.consultarTamanho();
                    System.out.println("\nTamanho da Agenda: " + tamanhoAgenda + " contatos.");
                }
                case 7 -> System.out.println("Programa encerrado.");
                default -> printRed("Opção inválida. Tente novamente. " + emojiRaiva);
            }
        } while (escolha != 7);

        scanner.close();
    }

    public static void printRed(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m");
    }

    public static void printGreen(String message) {
        System.out.println("\u001B[32m" + message + "\u001B[0m");
    }

    public static void printWhite(String message) {
        System.out.println("\u001B[37m" + message + "\u001B[0m");
    }

    public static void printGrey(String message) {
        System.out.println("\u001B[90m" + message + "\u001B[0m");
    }

}