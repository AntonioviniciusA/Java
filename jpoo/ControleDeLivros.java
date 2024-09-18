
public class ControleDeLivros implements Controlador {
    private static int contadorDeId = 1;
    private int id;
    private String nome;
    private String autorNome;
    private String categoria;
    private int anoDePublicação;
    public boolean emprestadoLivro;

    public ControleDeLivros() {
        this.id = contadorDeId++;
        this.nome = null;
        this.autorNome = null;
        this.categoria = null;
        this.anoDePublicação = 0;
    }

    @Override
    public void novoLivro() {
        setId(id);
        setNome(nome);
        setAutorNome(autorNome);
        setCategoria(categoria);
        setAnoDePublicação(anoDePublicação);

    }

    @Override
    public void apagarLivro() {
        // apagar
    }

    @Override
    public void emprestarLivro() {
        if (this.emprestadoLivro == true) {
            System.out.println("Item ja emprestado, n pode ser emprestado");
        } else {
            this.emprestadoLivro = true;
            System.out.println("Item emprestado");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutorNome() {
        return autorNome;
    }

    public void setAutorNome(String autorNome) {
        this.autorNome = autorNome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnoDePublicação() {
        return anoDePublicação;
    }

    public void setAnoDePublicação(int anoDePublicação) {
        this.anoDePublicação = anoDePublicação;
    }

    public boolean isemprestadoLivro() {
        return emprestadoLivro;
    }

    public void setEmprestadoLivro(boolean emprestadoLivro) {
        this.emprestadoLivro = emprestadoLivro;
    }
}
