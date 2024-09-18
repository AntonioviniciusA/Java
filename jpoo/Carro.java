public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public double ano;
    private int id;

    public Carro(String marca, String modelo, String cor, double ano, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.id = id;
    }

    public void exibirMarca() {
        System.out.println("Marca: " + this.marca);
    }

    public void exibirModelo() {
        System.out.println("Modelo: " + this.modelo);
    }

    public void exibirCor() {
        System.out.println("Cor: " + this.cor);
    }

    public void exibirAno() {
        System.out.println("Ano: " + this.ano);
    }

    public void exibirId() {
        System.out.println("Id: " + this.id);
    }

    public void ExibirInformações() {
        exibirMarca();
        exibirModelo();
        exibirCor();
        exibirAno();
        exibirId();
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("HONDA", "Civic", "Preto", 2010, 545431);

        meuCarro.ExibirInformações();
    }

}