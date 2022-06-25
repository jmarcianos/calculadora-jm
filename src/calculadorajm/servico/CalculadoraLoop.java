package calculadorajm.servico;

import calculadorajm.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraLoop {
    Calculadora calculadora = new Calculadora();
    Scanner scanner = new Scanner(System.in);

    public void somaLoop(){
        char switchChar;
        double num1, num2, numTemp;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        numTemp = num1 + num2;
        System.out.println("Resultado: "+numTemp);
        System.out.println("Digite (+) para continuar ou (s) para sair");
        switchChar = scanner.next().charAt(0);

        while (switchChar == '+'){
            System.out.println("Digite o proximo número:");
            num1 = scanner.nextDouble();
            numTemp += num1;
            System.out.println("Resultado: "+numTemp);
            System.out.println("Digite (+) para continuar ou (s) para sair");
            switchChar = scanner.next().charAt(0);
        }

    }
}
