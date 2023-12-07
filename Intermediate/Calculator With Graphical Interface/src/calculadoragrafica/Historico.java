package calculadoragrafica;

import java.util.ArrayList;

/**
 * @author @author Bianca Mayra & Lucelho Cristiano - 2023 | Calculadora e Lógica de Programação
 */

/*
Crindo uma classe "Histórico", pois um histórico possui suas características e precisa ser salvo em algum lugar.
Logo, a classe se torna necessária, além de permitir, mais à frente, transmitirmos valores de uma tela para a outra.
*/
public class Historico {
    /*
    Criando uma lista.
    Uma lista é parecida com uma variável, mas possui, ao inves de 1, vários lugares de memória.
    Existem vetores, que também possui mais de um lugar, no entanto, a lista seria a mais adequada para esse caso pois
    é expansível, enquanto o vetor tem lugares limitados e pré-definidos. Não sabemos quantas contas o usuário realizará.
    Definiremos o tipo "String" para podermos imprimir os valores mais facilmente em uma tabela gráfica e para evitar mais conversões
    futuras.
    */
    private ArrayList<String> expressoes = new ArrayList<String>();
    private ArrayList<String> resultados = new ArrayList<String>();

    /*
    Como criamos atributos privados, devemos criar métodos públicos que nos permitam acessar os valores salvos fora dessa classe.
    Esses são os famosos métodos "get" (pegar), que podem ser adicionados automaticamente com o botão direto e "insert code".
    */
    public ArrayList<String> getExpressoes() {
        return expressoes;
    }

    public ArrayList<String> getResultados() {
        return resultados;
    }
    
    /*
    Também necesitaremos de um método público para salvar informações nesse atributos privados de fora da classe.
    Como são listas, nesse caso se torna fácil apenas utlizar o comando "add', que acrescenta o falar informado ao final da lista.
    */
    public void salvar(String expresao, String resultado) {
        expressoes.add(expresao);
        resultados.add(resultado);
    }
    
}
