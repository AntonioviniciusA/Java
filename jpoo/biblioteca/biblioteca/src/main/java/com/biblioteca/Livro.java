package com.biblioteca;

import java.util.Date;

public class Livro {
 private String nomeL;
 private char idL;
 private Date  dataDeLançamentoL;
 private String nomeAutorL;
 private boolean emprestado;
 private boolean disponivel;
public Livro(String nomeL, char idL, Date dataDeLançamentoL, String nomeAutorL, boolean emprestado) {
    this.nomeL = nomeL;
    this.idL = idL;
    this.dataDeLançamentoL = dataDeLançamentoL;
    this.nomeAutorL = nomeAutorL;
    this.emprestado = emprestado;
}
public String getNomeL() {
    return nomeL;
}
public void setNomeL(String nomeL) {
    this.nomeL = nomeL;
}
public char getIdL() {
    return idL;
}
public void setIdL(char idL) {
    this.idL = idL;
}
public Date getDataDeLançamentoL() {
    return dataDeLançamentoL;
}
public void setDataDeLançamentoL(Date dataDeLançamentoL) {
    this.dataDeLançamentoL = dataDeLançamentoL;
}
public String getNomeAutorL() {
    return nomeAutorL;
}
public void setNomeAutorL(String nomeAutorL) {
    this.nomeAutorL = nomeAutorL;
}
public boolean isEmprestado() {
    return emprestado;
}
public void setEmprestado(boolean emprestado) {
    this.emprestado = emprestado;
}
public boolean isDisponivel() {
    return disponivel;
}
public void setDisponivel(boolean disponivel) {
    if (isEmprestado()) {
        this.disponivel = false;
    } else{
        this.disponivel = true;
    }
}

}
