package calculadorajm.dominio;

public class CalculadoraD {
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2 ) {
        if (num2 == 0.0) {
            //System.out.println("Divisão inválida, não se pode dividir por 0");
            return 0;
        }
        System.out.println();
        return num1 / num2;
    }

}
