package imobil;

public class Imovel {
    private String nomeImo;
    public String getNomeImo() {
        return nomeImo;
    }
    public void setNomeImo(String nomeImo) {
        this.nomeImo = nomeImo;
    }
    private String endereco;
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    private Float valor;
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    private boolean alugado;
    public boolean isAlugado() {
        return alugado;
    }
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    private Boolean vendido;

    public Boolean getVendido() {
        return vendido;
    }
    public void setVendido(Boolean vendido) {
        this.vendido = vendido;
    }

    private boolean disponivel;

    public boolean isDisponivel() {
        return disponivel;
    }
    private void setDisponivel(){
        if (alugado == true || vendido == true) {
            disponivel = false;
        }else{
            disponivel = true;
        }
    }
}
