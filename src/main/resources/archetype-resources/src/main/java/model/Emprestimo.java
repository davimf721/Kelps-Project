package src.main.java.model;

import java.sql.Date;
/**
 * Representa um empréstimo de ferramenta realizado no sistema.
 */
public class Emprestimo {
    // Atributos do empréstimo
    private int idEmprestimo;// Identificador único do empréstimo
    private int idFerramenta;// Identificador da ferramenta emprestada
    private int idAmigo;// Identificador do amigo que realizou o empréstimo
    private Date dataEmprestimo;// Data em que o empréstimo foi realizado
    private Date dataDevolucao;// Data prevista para devolução da ferramenta
    private boolean devolvido;// Indica se a ferramenta foi devolvida
    /**
     * Construtor para criar um novo empréstimo.
     *
     * @param idEmprestimo Identificador único do empréstimo
     * @param idFerramenta Identificador da ferramenta emprestada
     * @param idAmigo Identificador do amigo que realizou o empréstimo
     * @param dataEmprestimo Data em que o empréstimo foi realizado
     * @param dataDevolucao Data prevista para devolução da ferramenta
     * @param devolvido Indica se a ferramenta foi devolvida
     */
    public Emprestimo(int idEmprestimo, int idFerramenta, int idAmigo, Date dataEmprestimo, Date dataDevolucao, boolean devolvido){
        this.idEmprestimo = idEmprestimo;// Define o ID do empréstimo
        this.idFerramenta = idFerramenta;// Define o ID da ferramenta emprestada
        this.idAmigo = idAmigo;// Define o ID do amigo que realizou o empréstimo
        this.dataEmprestimo = dataEmprestimo;// Define a data de empréstimo
        this.dataDevolucao  = dataDevolucao;// Define a data de devolução
        this.devolvido = devolvido;// Define se a ferramenta foi devolvida
    }
    // Métodos de acesso aos atributos do empréstimo

    /**
     * Retorna o ID do empréstimo.
     *
     * @return O ID do empréstimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }
    /**
     * Define o ID do empréstimo.
     *
     * @param idEmprestimo O ID do empréstimo
     */
    public void setIdEmprestimo(int idEmprestimo){
        this.idEmprestimo = idEmprestimo;
    }
    /**
     * Retorna o ID da ferramenta emprestada.
     *
     * @return O ID da ferramenta emprestada
     */
    public int getIdFerramenta() {
        return idFerramenta;
    }
    /**
     * Define o ID da ferramenta emprestada.
     *
     * @param idFerramenta O ID da ferramenta emprestada
     */
    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }
    /**
     * Retorna o ID do amigo que realizou o empréstimo.
     *
     * @return O ID do amigo que realizou o empréstimo
     */
    public int getIdAmigo() {
        return idAmigo;
    }
    /**
     * Define o ID do amigo que realizou o empréstimo.
     *
     * @param idAmigo O ID do amigo que realizou o empréstimo
     */
    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }
    /**
     * Retorna a data em que o empréstimo foi realizado.
     *
     * @return A data de empréstimo
     */
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    /**
     * Define a data em que o empréstimo foi realizado.
     *
     * @param dataEmprestimo A data de empréstimo
     */
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    /**
     * Retorna a data prevista para devolução da ferramenta.
     *
     * @return A data de devolução prevista
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    /**
     * Define a data prevista para devolução da ferramenta.
     *
     * @param dataDevolucao A data de devolução prevista
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    /**
     * Verifica se a ferramenta foi devolvida.
     *
     * @return true se a ferramenta foi devolvida, false caso contrário
     */
    public boolean isDevolvido() {
        return devolvido;
    }
    /**
     * Define se a ferramenta foi devolvida.
     *
     * @param devolvido true se a ferramenta foi devolvida, false caso contrário
     */
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
    /**
     * Sobrescreve o método toString para exibir informações do empréstimo.
     *
     * @return Uma representação em string do empréstimo
     */
    @Override
    public String toString() {
        return "ID Empréstimo: " + idEmprestimo + ", ID Ferramenta: " + idFerramenta + ", ID Amigo: " + idAmigo +
                ", Data Empréstimo: " + dataEmprestimo + ", Data Devolução: " + dataDevolucao + ", Devolvido: " + devolvido;
    }
}
