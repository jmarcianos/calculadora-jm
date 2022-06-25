package calculadorajm.test;

import calculadorajm.dominio.Calculadora;
import calculadorajm.servico.CalculadoraLoop;

import java.util.Scanner;

public class CalculadoraJm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        CalculadoraLoop calculadoraLoop = new CalculadoraLoop();
        double resultadoSoma;
        double resultadoSubtracao;
        double resultadoMultiplicacao;
        double resultadoDivisao;
        char switchChar ='n';
        int switchInt ;

        System.out.println("Calculador JM ééé");

        while (switchChar == 'n'){
            System.out.println("Digite (n) para nova operação ou (s) para sair");
            switchChar = scanner.next().charAt(0);
            if(switchChar == 'n'){
                System.out.println("Escolha:");
                System.out.println("1- Soma");
                System.out.println("2- Subtração");
                System.out.println("3- Multiplicação");
                System.out.println("4- Divisão");
                switchInt=scanner.nextInt();

                switch (switchInt){
                    case 1:
                        System.out.println("1");
                        calculadoraLoop.somaLoop();
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4:
                        System.out.println("4");
                        break;
                    default:
                        System.out.println("Opcão inválida");
                        break;
                }
            }
        }


//        resultadoSoma = calculadora.soma(2,3);
//        resultadoSubtracao = calculadora.subtracao(3,1);
//        resultadoMultiplicacao = calculadora.multiplicacao(2,3);
//        resultadoDivisao = calculadora.divisao(10,0.0003);

//        System.out.println(resultadoSoma);
//        System.out.println(resultadoSubtracao);
//        System.out.println(resultadoMultiplicacao);
//        if(resultadoDivisao == 0.0){
//            System.out.println("Divisão inválida");
//        }else{
//            System.out.println(resultadoDivisao);
//        }

    }
}
