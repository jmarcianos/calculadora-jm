package calculadorajm.dominio;

import java.util.Scanner;

public class CalculadoraJm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        double resultadoSoma;
        double resultadoSubtracao;
        double resultadoMultiplicacao;
        double resultadoDivisao;
        resultadoSoma = calculadora.soma(2,3);
        resultadoSubtracao = calculadora.subtracao(3,1);
        resultadoMultiplicacao = calculadora.multiplicacao(2,3);
        resultadoDivisao = calculadora.divisao(10,0.0003);

        System.out.println("Calculador JM ééé");
        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoMultiplicacao);
        if(resultadoDivisao == 0.0){
            System.out.println("Divisão inválida");
        }else{
            System.out.println(resultadoDivisao);
        }

    }
}
