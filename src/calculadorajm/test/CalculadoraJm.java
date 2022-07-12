package calculadorajm.test;



import calculadorajm.dominio.*;
import calculadorajm.servico.Calculadora;
import java.util.Scanner;

public class CalculadoraJm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char switchChar ='n';
        int switchInt ;

        System.out.println("Calculador JM ééé");

        while (switchChar == 'n'){
            System.out.println("Digite (n) para nova operação ou (s) para sair");
            switchChar = scanner.next().charAt(0);
            double num1;
            double num2;
            if(switchChar == 'n'){
                System.out.println("Escolha:");
                System.out.println("1- Soma");
                System.out.println("2- Subtração");
                System.out.println("3- Multiplicação");
                System.out.println("4- Divisão");
                switchInt=scanner.nextInt();
                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo  número: ");
                num2 = scanner.nextDouble();

                switch (switchInt){
                    case 1:
                        Operacao oSomar = new Somar();
                        Calculadora.calcular(oSomar,num1,num2);
                        break;
                    case 2:
                        Operacao oSubtrair = new Subtrair();
                        Calculadora.calcular(oSubtrair,num1,num2);
                        break;
                    case 3:
                        Operacao oMultiplicar = new Multiplicar();
                        Calculadora.calcular(oMultiplicar,num1,num2);
                        break;
                    case 4:
                        Operacao oDividir = new Dividir();
                        Calculadora.calcular(oDividir,num1,num2);
                        break;
                    default:
                        System.out.println("Opcão inválida");
                        break;
                }
            }
        }


    }
}
