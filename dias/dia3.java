import java.util.Scanner;

public class dia3 {
  public static void main(String[] args) {
    int idade;
    Scanner ler = new Scanner(System.in);

    System.out.println("Qual sua idade?");
    idade = ler.nextInt();

    if (idade >= 18) {
      System.out.printf("Você deve votar");
    } else {
      System.out.printf("Você não pode votar");
    }
  }
}