
import java.util.Scanner;

public class lutador {
    Scanner ler = new Scanner(System.in);
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public int getVitoria() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome() {

    }

    public void setNacionalidade() {

    }

    public void setIdade(int id) {
        idade = id;
    }

    public void setAltura() {

    }

    public void setPeso(float pe) {
        peso = pe;
        setCategoria();
    }

    public void setVitorias(int vi) {
        vitorias = vi;
    }

    public void setDerrotas(int de) {
        derrotas = de;
    }

    public void setEmpates(int em) {
        empates = em;
    }

    public void ganharluta() {
        setVitorias(this.getVitoria() + 1);
    }

    public void perderluta() {
        setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarluta() {
        setEmpates(this.getEmpates() + 1);
    }

    private void setCategoria() {
        if (peso < 52.3) {
            this.categoria = "invalido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "medio";
        } else if (peso <= 120.2) {
            this.categoria = "pesado";
        } else {
            this.categoria = "invalido";
        }
    }

    public void apresentar() {
        System.out.println("--------------------------------");
        System.out.println("CHEGOU A HORA!, Apresentamos o lutador " + this.nome);
        System.out.println("diretamente de " + this.nacionalidade);
        System.out.println(
                "Aos seus " + this.getIdade() + " de idade com " + this.altura + " de altura e pesando "
                        + this.getPeso()
                        + ".");
        System.out
                .println("Com até o momento com " + this.getVitoria() + " Vitorias " + this.getDerrotas() + " Derrotas "
                        + this.getEmpates() + " Empates.");
    }

    public void status() {
        System.out.println("NOME: " + this.nome);
        System.out.println("Categoria:" + this.categoria);
        System.out.println(this.getIdade() + " de idade " + this.altura + " de altura " + this.getPeso() + " kg");
        System.out.println(this.getVitoria() + " Vitorias " + this.getDerrotas() + " Derrotas "
                + this.getEmpates() + " Empates ");
    }

}
