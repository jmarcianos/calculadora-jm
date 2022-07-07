package calculadorajm.dominio;

public abstract class Operacao {
   protected double num1;
   protected double num2;

    public Operacao(double num1, double num2) {
    }

    public abstract double calcular(double num1, double num2);

    public abstract double getNum1();

    public abstract double getNum2();
}
