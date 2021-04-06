package io.github.jiangdequan;

public class Valor {

    public void testar(int num1, int num2) {
        System.out.println("Soma:" + (num1 + num2));
        mutiplicar(num1, num2);
        dividir(num1, num2);
    }

    // Mudando o valor da variavel quando entra no metado
    public void mutiplicar(int num1, int num2) {
        num1 = 5;
        num2 = 6;
        System.out.println("Multiplicacao = " + num1 * num2);

    }

    // Mudando o valor da variavel quando entra no metado
    public void dividir(double num1, double num2) {
        num1 = 10;
        num2 = 2;
        System.out.println("Divisao = " + num1 / num2);
    }

}