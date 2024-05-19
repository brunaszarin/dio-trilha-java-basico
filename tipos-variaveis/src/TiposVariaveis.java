public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        /*A estrutura padrão para se declarar uma variável sempre é:
         *
         *  <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
         * 
         * Exemplos abaixo:
         * 
         * int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
         * int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com * * valor 2021.
         * double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", * valor 2.500.
         */
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, e precisa terminar com L.
		float pi = 3.14F; // precisa sempre terminar com F o tipo float.
		double salario = 1275.33;

        int numero = 1;

        numero = 2; //o valor de uma variável pode alterar no fluxo de um código!

    }
}
