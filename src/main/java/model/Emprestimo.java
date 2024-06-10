package model;

import java.sql.Date;
import dao.EmprestimoDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;


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
    EmprestimoDAO dao;


    public Emprestimo() {
        this(0, 0, 0, null, null);
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
    public Emprestimo(int idEmprestimo, int idFerramenta, int idAmigo, Date dataEmprestimo, Date dataDevolucao){
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
     * @param dataDevolucao A data de devolução previstate
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public ArrayList<Emprestimo> listaEmprestimo() {
        return dao.listar();
    }

    public boolean inserirEmprestimoDB(int idFerramenta, int idAmigo, Date dataEmprestimo, Date dataDevolucao) throws SQLException {
        int maiorID = dao.maiorIDEmprestimo() + 1;
        Emprestimo emprestimo = new Emprestimo(maiorID, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao);
        dao.inserir(emprestimo);
        return true;
    }
    
    public int maiorIDEmprestimo() {
        return dao.maiorIDEmprestimo();
    }

    public boolean deletarEmprestimoDB(int id_emprestimo) throws SQLException {
        dao.deletar(id_emprestimo);
        return true;
    }
    private int procuraIndice(int id_emprestimo) {
        int indice = -1;
        for (int i = 0; i < EmprestimoDAO.listaEmprestimo.size(); i++) {
            if (EmprestimoDAO.listaEmprestimo.get(i).getIdEmprestimo() == id_emprestimo) {
                indice = i;
            }
        }
        return indice;
    }

    public boolean atualizarEmprestimoDB(int id_emprestimo, int id_amigo, int id_ferramenta, Date data_emprestimo, Date data_devolucao) throws SQLException {

            Emprestimo emprestimo = new Emprestimo(idEmprestimo, idAmigo, idFerramenta, dataEmprestimo, dataDevolucao);
            int indice = this.procuraIndice(idEmprestimo);
            return dao.atualizar(emprestimo);

    }
    private Date convertStringToDate(String dateString) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return (Date) formatter.parse(dateString);
    }

    public Emprestimo buscarEmprestimoDB(int id_emprestimo) {
        return dao.buscar(id_emprestimo);
    }
    public ArrayList<Emprestimo> getListaEmprestimoAtivo() {
        ArrayList<Emprestimo> listaEmprestimoAtivo = new ArrayList<>();
        try {
            ArrayList<Emprestimo> listaEmprestimo = dao.listar(); // Chama a função listar para obter a lista de empréstimos

            LocalDate dataAtual = LocalDate.now();

            for (Emprestimo emprestimo : listaEmprestimo) {

                if (emprestimo.getDataDevolucao() == null) {
                    listaEmprestimoAtivo.add(emprestimo);
                } else {
                    LocalDate dataDevolucao = emprestimo.getDataDevolucao().toLocalDate();

                    if (dataAtual.isBefore(dataDevolucao)) {
                        listaEmprestimoAtivo.add(emprestimo);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
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
