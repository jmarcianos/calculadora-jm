package calculadorajm.dominio;

public class Dividir extends Operacao{
    public Dividir(double num1, double num2) {
        super(num1, num2);
    }

    public double calcular(double num1, double num2){
        return num1 / num2;
    }

    @Override
    public double getNum1() {
        return 0;
    }

    @Override
    public double getNum2() {
        return 0;
    }
}
