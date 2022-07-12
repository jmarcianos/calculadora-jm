package calculadorajm.servico;

import calculadorajm.dominio.Dividir;
import calculadorajm.dominio.Operacao;

import java.util.Scanner;

public class Calculadora {
    public static void calcular(Operacao operacao, double num1, double num2){
        Scanner scanner = new Scanner(System.in);
        double result;
        double temp;
        char i = '+';
        if(operacao instanceof Dividir && operacao.getNum2() == 0){
            System.out.println("Divisão inválida");
            return;
        }

        result = operacao.calcular(num1,num2);
        temp = result;
        System.out.println("Resultado: "+result);
        System.out.println("Digite (+) para continuar ou (s) para sair: ");
        i = scanner.next().charAt(0);

        while (i == '+'){
            System.out.println("Digite o próximo número: ");
            num2 = scanner.nextDouble();
            result = operacao.calcular(temp, num2);
            System.out.println("Resultado: "+result);
            System.out.println("Digite (+) para continuar ou (s) para sair: ");
            i = scanner.next().charAt(0);
            temp = result;

        }

    }
}
