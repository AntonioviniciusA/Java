
public class Dia5 {
    public static void main(String[] args) {
        int[] Notas = { 8, 9, 6, 7, 4, };
        int total = 0;
        float Media = 0;
        int MaiorNota = 0;
        int MenorNota = Notas[0];
        for (int Notau : Notas)
            System.out.printf("Nota: %d\n", Notau);
        for (int NotaMedia : Notas)
            total += NotaMedia;
        Media = total / Notas.length;

        for (int Nota : Notas)
            if (MenorNota > Nota) {
                MenorNota = Nota;
            }
        for (int Notah : Notas)
            if (MaiorNota < Notah) {
                MaiorNota = Notah;
            }
        System.out.printf("Media: %.2f\n", Media);
        System.out.printf("MenorNota: %d\n", MenorNota);
        System.out.printf("MaiorNota: %d\n", MaiorNota);
    }
}
