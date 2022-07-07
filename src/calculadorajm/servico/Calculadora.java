package calculadorajm.servico;

import calculadorajm.dominio.Dividir;
import calculadorajm.dominio.Operacao;

public class Calculadora {
    public static void calcular(Operacao operacao){
        if(operacao instanceof Dividir && operacao.getNum2() == 0){
            System.out.println("Divisão inválida");
            return;
        }

    }
}
