package model;


import dao.FerramentaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Representa uma ferramenta utilizada no sistema.
 */
public class Ferramenta {

    // Atributos da ferramenta
    private  int id;// Identificador único da ferramenta
    private String nome;// Nome da ferramenta
    private String marca;// Marca da ferramenta
    private double custoAquisicao;// Custo de aquisição da ferramenta
    FerramentaDAO dao;

    public Ferramenta() {
        this(0, "", "", 0);
    }
    public Ferramenta(int id, String nome, String marca,  double custoAquisicao) {
        this.id = id;
        this.nome = nome;
        this.marca = marca; // Inicializa a marca como uma string vazia
        this.custoAquisicao = custoAquisicao;
        this.dao = new FerramentaDAO();
    }

    // Métodos de acesso aos atributos da ferramenta

    /**
     * Retorna o ID da ferramenta.
     *
     * @return O ID da ferramenta
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID da ferramenta.
     *
     * @param id O ID da ferramenta
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o nome da ferramenta.
     *
     * @return O nome da ferramenta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da ferramenta.
     *
     * @param nome O nome da ferramenta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a marca da ferramenta.
     *
     * @return A marca da ferramenta
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca da ferramenta.
     *
     * @param marca A marca da ferramenta
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Retorna o custo de aquisição da ferramenta.
     *
     * @return O custo de aquisição da ferramenta
     */
    public double getCustoAquisicao() {
        return custoAquisicao;
    }

    /**
     * Define o custo de aquisição da ferramenta.
     *
     * @param custoAquisicao O custo de aquisição da ferramenta
     */
    public void setCustoAquisicao(double custoAquisicao) {
        this.custoAquisicao = custoAquisicao;
    }

    public String getDisponivel(int id) {
        String disponivel = "Sim";
        Emprestimo emp = new Emprestimo();
        ArrayList<Emprestimo> listaEmprestimoAtivo = emp.getListaEmprestimoAtivo();
        for (Emprestimo emprestimo : listaEmprestimoAtivo) {
            if (emprestimo.getIdFerramenta() == id) {
                disponivel = "Não";
                break;
            }
        }
        return disponivel;
    }
    public ArrayList<Ferramenta> listarFerramenta() throws SQLException {
        return dao.listar();
    }

    public boolean inserirFerramentaDB(String nome, String marca, double custoAquisicao) throws SQLException {
        int maiorID = dao.maiorIDFerramenta() + 1;
        Ferramenta ferramenta = new Ferramenta(maiorID, nome, marca, custoAquisicao);
        dao.inserir(ferramenta);
        return true;

    }

    public boolean deletarFerramentaDB(int id) {
        dao.deletar(id);
        return true;
    }

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < FerramentaDAO.listaFerramenta.size(); i++) {
            if (FerramentaDAO.listaFerramenta.get(i).getId() == id) {
                indice = i;
            }

        }
        return indice;
    }

    public boolean atualizarFerramentaDB(int id, String nome, String marca, double custo) {
        Ferramenta ferramenta = new Ferramenta(id, nome, marca, custoAquisicao);
        dao.atualizar(ferramenta);
        return true;
    }
    public Ferramenta buscarFerramentaDB(int id) {
        return dao.buscar(id);
    }
}
