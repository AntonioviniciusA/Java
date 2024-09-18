package dias;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double n1 = ler.nextDouble();
        System.out.println("Digite um operador (+,-,*,/):");
        String sinal = sc.next();
        System.out.println("Digite um numero:");
        double n2 = ler.nextDouble();
        double Resultado;
        switch (sinal) {
            case "+":
                Resultado = n1 + n2;
                System.out.printf("O resultado da soma é:%.2f", Resultado);
                break;
            case "-":
                Resultado = n1 - n2;
                System.out.printf("O resultado da subtração é:%.2f", Resultado);
                break;
            case "*":
                Resultado = n1 * n2;
                System.out.printf("O resultado da multiplicação é:%.2f", Resultado);
                break;
            case "/":
                Resultado = n1 / n2;
                System.out.printf("O resultado da divisão é:%.2f", Resultado);
                break;
            default:
                throw new AssertionError();

        }

    }
}
