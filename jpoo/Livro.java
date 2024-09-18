public class Livro {

    private int id;
    private String nome;
    private String autorNome;
    private String categoria;
    private int anoDePublicação;
    public boolean emprestadoLivro;

    //

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

    public Livro() {
        this.nome = "Nome do livro";
        this.id = 0;
        this.categoria = "";
        this.emprestadoLivro = false;
    }

    public void status() {
        System.out.println("Nome:" + this.getNome());
    }

}
