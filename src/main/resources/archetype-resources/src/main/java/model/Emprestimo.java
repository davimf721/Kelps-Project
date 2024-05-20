package main.java.com.cadastroferramentas.model;

import java.sql.Date;
public class Emprestimo {
    private int idEmprestimo;
    private int idFerramenta;
    private int idAmigo;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean devolvido;

    public Emprestimo(int idEmprestimo, int idFerramenta, int idAmigo, Date dataEmprestimo, Date dataDevolucao, boolean devolvido){
        this.idEmprestimo = idEmprestimo;
        this.idFerramenta = idFerramenta;
        this.idAmigo = idAmigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao  = dataDevolucao;
        this.devolvido = devolvido;
    }
    public int getIdEmprestimo() {
        return idEmprestimo;
    }
    public void setIdEmprestimo(int idEmprestimo){
        this.idEmprestimo = idEmprestimo;
    }
    public int getIdFerramenta() {
        return idFerramenta;
    }
    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }
    public int getIdAmigo() {
        return idAmigo;
    }
    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public boolean isDevolvido() {
        return devolvido;
    }
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
    @Override
    public String toString() {
        return "ID Empréstimo: " + idEmprestimo + ", ID Ferramenta: " + idFerramenta + ", ID Amigo: " + idAmigo +
                ", Data Empréstimo: " + dataEmprestimo + ", Data Devolução: " + dataDevolucao + ", Devolvido: " + devolvido;
    }
}
