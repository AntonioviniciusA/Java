import java.awt.Desktop;
import java.net.URI;

public class Combat {
    public static void main(String[] args) {
        new DICEFIGHT().setVisible(true);
        try {
            // Verifica se o Desktop é suportado
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                // Abre o link do YouTube no navegador padrão
                Desktop.getDesktop()
                        .browse(new URI("https://music.youtube.com/watch?v=r_393ODauyU&si=y6cLV7jk81unh7hE"));
            } else {
                System.out.println("Abrir o navegador não é suportado neste sistema.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
