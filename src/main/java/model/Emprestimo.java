package model;

import java.sql.Date;
import dao.EmprestimoDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Representa um empréstimo de ferramenta realizado no sistema.
 */
public class Emprestimo {

    // Atributos do empréstimo
    private int idEmprestimo;// Identificador único do empréstimo
    private int idFerramenta;// Identificador da ferramenta emprestada
    private int idAmigo;// Identificador do amigo que realizou o empréstimo
    private String dataEmprestimo;// Data em que o empréstimo foi realizado
    private String dataDevolucao;// Data prevista para devolução da ferramenta
    EmprestimoDAO dao;


    public Emprestimo() {
        this(0, 0, 0, "", "");
    }

    /**
     * Construtor para criar um novo empréstimo.
     *
     * @param idEmprestimo Identificador único do empréstimo
     * @param idFerramenta Identificador da ferramenta emprestada
     * @param idAmigo Identificador do amigo que realizou o empréstimo
     * @param dataEmprestimo Data em que o empréstimo foi realizado
     * @param dataDevolucao Data prevista para devolução da ferramenta
     */
    public Emprestimo(int idEmprestimo, int idFerramenta, int idAmigo, String dataEmprestimo, String dataDevolucao){
        this.idEmprestimo = idEmprestimo;// Define o ID do empréstimo
        this.idFerramenta = idFerramenta;// Define o ID da ferramenta emprestada
        this.idAmigo = idAmigo;// Define o ID do amigo que realizou o empréstimo
        this.dataEmprestimo = dataEmprestimo;// Define a data de empréstimo
        this.dataDevolucao  = dataDevolucao;// Define a data de devolução
        this.dao = new EmprestimoDAO();
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
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * Define a data em que o empréstimo foi realizado.
     *
     * @param dataEmprestimo A data de empréstimo
     */
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * Retorna a data prevista para devolução da ferramenta.
     *
     * @return A data de devolução prevista
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    /**
     * Define a data prevista para devolução da ferramenta.
     *
     * @param dataDevolucao A data de devolução prevista
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public ArrayList<Emprestimo> listaEmprestimo() {
        return dao.listar();
    }

    public boolean inserirEmprestimoDB(int idFerramenta, int idAmigo, String dataEmprestimo, String dataDevolucao) throws SQLException {
        int maiorID = dao.maiorIDEmprestimo() + 1;
        Emprestimo emprestimo = new Emprestimo(maiorID, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao);
        dao.inserir(emprestimo);
        return true;
    }
    
    public int maiorIDEmprestimo() {
        return dao.maiorIDEmprestimo();
    }

    public boolean deletarEmprestimoDB(int idEmprestimo) throws SQLException {
        dao.deletar(idEmprestimo);
        return true;
    }
    private int procuraIndice(int idEmprestimo) {
        int indice = -1;
        for (int i = 0; i < EmprestimoDAO.listaEmprestimo.size(); i++) {
            if (EmprestimoDAO.listaEmprestimo.get(i).getIdEmprestimo() == idEmprestimo) {
                indice = i;
            }
        }
        return indice;
    }

    public boolean atualizarEmprestimoDB(int idEmprestimo, int idAmigo, int idFerramenta, String dataEmprestimo, String dataDevolucao) throws SQLException {
        Emprestimo emprestimo = new Emprestimo(idEmprestimo, idAmigo, idFerramenta, dataEmprestimo, dataDevolucao);
        int indice = this.procuraIndice(idEmprestimo);
        dao.atualizar(emprestimo);
        return true;
    }

    public Emprestimo buscarEmprestimoDB(int idEmprestimo) {
        return dao.buscar(idEmprestimo);
    }
    public ArrayList<Emprestimo> getListaEmprestimoAtivo() {
        ArrayList<Emprestimo> listaEmprestimoAtivo = new ArrayList<>();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ArrayList<Emprestimo> listaEmprestimo = this.listaEmprestimo();

            for (Emprestimo emprestimo : listaEmprestimo) {

                if (emprestimo.getDataDevolucao() == null) {
                    listaEmprestimoAtivo.add(emprestimo);

                }
                if (emprestimo.getDataDevolucao() != null) {
                    Date dataDevolucao = (Date) sdf.parse(emprestimo.getDataDevolucao());
                    Date dataAtual = (Date) sdf.parse(LocalDate.now() + "");

                    if (dataAtual.compareTo(dataDevolucao) < 0) {
                        listaEmprestimoAtivo.add(emprestimo);

                    }
                }

            }
        } catch (ParseException ignored) {
        }

        return listaEmprestimoAtivo;
    }
    public String emprestimoAtivo(int idEmprestimo){
        String ativo = "Não";
        Emprestimo emp = new Emprestimo();
        ArrayList<Emprestimo> listaEmprestimoAtivo = emp.getListaEmprestimoAtivo();
        for (Emprestimo emprestimo : listaEmprestimoAtivo) {
            if (emprestimo.getIdEmprestimo() == idEmprestimo) {
                ativo = "Sim";
                break;
            }
        }
        return ativo;
    }
}
