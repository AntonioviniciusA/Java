package dias;

import java.util.Scanner;

public class dia2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double c, f;

        System.out.println("Coloque quantos graus celcius quer converter para Fahrenheit \n");
        c = ler.nextInt();
        f = c * 1.8 + 32;

        System.out.printf("AQUI ESTÁ %.2f CONVERTIDO PARA FAHRENHEIT: %.2f \n", c, f);
    }
}
