
public class Operadores {

    public static void main(String[] args) {

        // A atribuição de valor se dá pelo símbolo de igualdade "="
        // classe Operadores.java
        String nome = "BRUNA";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // O operador de adição (+), quando utilizado em variáveis do tipo texto,
        // realizará a “concatenação de textos”.
        // classe Operadores Aritmético.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // classe Operadores Concatenação.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        // qual o resultado das expressoes abaixo?
        concatenacao = 1 + 1 + 1 + "1";
        concatenacao = 1 + "1" + 1 + 1;
        concatenacao = 1 + "1" + 1 + "1";
        concatenacao = "1" + 1 + 1 + 1;
        concatenacao = "1" + (1 + 1 + 1);

        // Operadores Unários, são aplicados juntamente com outros operadores
        // aritméticos. Eles realizam alguns trabalhos como incrementar, decrementar, inverter valores numéricos e booleanos.
       
        
        // (+) Operador unário de valor positivo – números são positivos sem esse
        // operador explicitamente;
        // (-) Operador unário de valor negativo – nega um número ou expressão
        // aritmética;
        // (++) Operador unário de incremento de valor – incrementa o valor em 1
        // unidade;
        // (--) Operador unário de decremento de valor – decrementa o valor em 1
        // unidade;
        // (!) Operador unário lógico de negação – nega o valor de uma expressão
        // booleana.


        // classe Operadores.java
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);


        //O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

        //O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:

        //<Expressão Condicional>``?``<Caso condição seja true> ``:``<Caso condição seja false>
        
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        
        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO

        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(valor);
    }
}
