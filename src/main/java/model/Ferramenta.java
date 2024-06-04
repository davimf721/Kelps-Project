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
    
    private FerramentaDAO dao;

    /**
     * Construtor para criar uma nova ferramenta sem ID atribuído.
     *
     * @param nome Nome da ferramenta
     * @param marca Marca da ferramenta
     * @param custoAquisicao Custo de aquisição da ferramenta
     */
    public Ferramenta(String nome, String marca, double custoAquisicao) {
        this.nome = nome;// Define o nome da ferramenta
        this.marca = marca;// Define a marca da ferramenta
        this.custoAquisicao = custoAquisicao;// Define o custo de aquisição da ferramenta
        this.dao = new FerramentaDAO();
       
    }

    /**
     * Construtor para criar uma nova ferramenta com ID atribuído.
     *
     * @param id Identificador único da ferramenta
     * @param nome Nome da ferramenta
     * @param marca Marca da ferramenta
     * @param custoAquisicao Custo de aquisição da ferramenta
     */
    public Ferramenta(int id, String nome, String marca, double custoAquisicao) {
        this.id = id;// Define o ID da ferramenta
        this.nome = nome;// Define o nome da ferramenta
        this.marca = marca;// Define a marca da ferramenta
        this.custoAquisicao = custoAquisicao;// Define o custo de aquisição da ferramenta
    }

    public Ferramenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    /**
     * Sobrescreve o método toString para exibir informações da ferramenta.
     *
     * @return Uma representação em string da ferramenta
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Marca: " + marca + ", Custo de Aquisição: R$ " + custoAquisicao;
    }
    public ArrayList<Ferramenta> listar() throws SQLException {
        return (ArrayList<Ferramenta>) dao.listar();
    }

    //Cadastrar novo amigo
    public boolean inserir(int id, String nome, String marca, Double custoAquisicao) throws SQLException {
        id = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id, nome, marca, custoAquisicao);
        dao.inserir(objeto);
        return true;
    }

    //Deletar um amigo
    public boolean deletar(int id) throws SQLException {
        dao.deletar(id);
        return true;
    }

    public boolean atualizar(int id, String nome, String marca, Double custoAquisicao) throws SQLException {
        Ferramenta objeto = new Ferramenta(id, nome, marca, custoAquisicao);
        dao.atualizar(objeto);
        return true;
    }
    public Ferramenta carregaFerramenta(int id) {
        return dao.carregarFerramenta(id);
    }

    //Retorna o maior ID da base de dados
    public int maiorID() {
        return dao.maiorID();

    }
}
