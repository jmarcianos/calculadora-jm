package calculadorajm.dominio;

public class Dividir extends Operacao{


    public double calcular(double num1, double num2){
        return num1 / num2;
    }

    @Override
    public double getNum1() {
        return this.num1;
    }

    @Override
    public double getNum2() {
        return this.num2;
    }
}
