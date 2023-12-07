package calculadoragrafica;

import java.io.*;

/**
 * @author Bianca Mayra & Lucelho Cristiano - 2023 | Calculadora e Lógica de Programação
 */

/* 
Aqui estamos criando uma classe.
Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real,
daí o nome "programação orientada à objetos".
Um professor pode ser uma classe, por exemplo. Ele possuí características, que definiremos como "ATRIBUTOS"
e ações, que definiremos como "MÉTODOS".
Atributos de um professor seriam registro acadêmico, disciplina lecionada, etc.
Métodos de um professor seriam dar aula, corrigir prova, etc.
*/
public class ClasseMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    /* 
    Esse é o método Main, ou, traduzindo, o método que define a classe Principal.
    Por padrão, asim que criamos um programa, ele é gerad em uma classe, no entando, é possível desativar essa opção.
    O método Main é por onde o compilador começa a ler o código, afinal, entre tantas classes ou até mesmo pacotes criados,
    é preciso ter um ponto de partida/início definido.
    */
    public static void main(String[] args) throws IOException {
        /*O "IOException" acima é um tipo de exceção, ou seja, erro. Esse comando irá processá-lo para que o programa 
        informe qualquer erro que possa decorrer na compilação do código ao invés de parar subtamente. 
        */
        
        /* 
        Instanciando um obejeto abaixo.
        Estamos chamando outra classe da qual queremos usar as propriedades.
        Para isso criamos um novo objeto manipulável chamado "telaCalculadora" do tipo "TelaCalculadora".
        */
        TelaCalculadora telaCalculadora = new TelaCalculadora();
        /*
        O comando "setVisible" irá tornar a telaCalculadora visível, aplicando o valor booleano "true" ou "verdadeiro"
        */
        telaCalculadora.setVisible(true);

    }

    /*
    Mais para frente no código, iremos querer um botão que apague apenas um caractere da conta em caso de
    digitação errônea. Vamo então encapsular o código, ou seja, realizar pequenas funções separadamente em métodos
    diferentes, assim, quando um erro ocorrer, será muito mais fácil de identificá-lo e tratá-lo. Ademias, isso torna muito mais
    facil a adição futura de novas funcionalidades e torna o código mais fácil de ler.
    */
    
    /*
    O método começa com um modificador de acesso. 
    Modificadores de acesso definem com que nível de restrição cada método pode ser acessado.
    São eles:
    - Public (públco): podem ser acessados de qualquer parte da aplicação.(geralmente métodos são públicos pois precisamos
    acessar e retornar valores de diversos lugares).
    - Default (padrão): Identificado pela ausência de modificadores. Teram acesso ao atributo/métodos, todas as classes que 
    estiverem no mesmo pacote que a classe que possuir os mesmos.
    - Protected (protegido): Parecido com o Default, porém classes herdeiras também possuem acesso ao método/atributo.
    - Private (privado):  A única classe que tem acesso ao atributo/método é a própria classe que o define, ou seja, se uma classe 
    Pessoa possui um atributo privado chamado nome, somente a classe Pessoa terá acesso a ele.
    */
    public static String removerCaractere(String texto) {
        /*
        nesse método estamos passando também um parâmetro, que são valores externos necessários para efetuar uma operação
        interna do método, por ezemlo, valores numéricos para uma conta matemática.
        */
        
        /*
        Abaixo estamos utilizando o "if", uma estrtura condicional que permite alteraro fluxo do algortmo.
        Acondição é: se o texto informado for nulo, retornaremos um valor nulo.
        No final, o método executa outro método já pronto chamado "replaceFirst".
        O cifrão indica qual casa que será "reposta"(replaced), no caso a última, e logo após é dito que será colocado um valor vazio
        definido pelas aspas.
        */
        if (texto == null) {
            return null;
        }
        return texto.replaceFirst(".$", "");
    }

}
