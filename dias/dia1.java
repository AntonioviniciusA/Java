package dias;

import java.util.Scanner;

public class dia1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        int nota = 10;

        System.out.print("Meu nome é I, Qual seu nome? \n");
        nome = ler.nextLine();

        System.out.print("Qual sua idade?");
        idade = ler.nextInt();

        System.out.printf("Olá, %s, você tem %d anos.\n", nome, idade);
        System.out.println("sua nota é " + nota);
    }
}
