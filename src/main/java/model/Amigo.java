package model;
import dao.AmigoDAO;
import model.Emprestimo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Representa um amigo cadastrado no sistema.
 */
public class Amigo {

    private int id;
    private String nome;
    private int telefone;

    private AmigoDAO dao;

    /**
     * Construtor padrão para a classe Amigo. Inicializa o amigo com id, nome e
     * telefone vazios.
     */
    public Amigo(){
        this(0,"",0);
    }

    /**
     * Construtor para a classe Amigo. Inicializa o amigo com o id, nome e
     * telefone fornecidos.
     *
     * @param id O id do amigo
     * @param nome O nome do amigo.
     * @param telefone O telefone do amigo.
     */

    public Amigo( int id,String nome, int telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dao = new AmigoDAO();
    }

    /**
     * Retorna o ID do amigo.
     *
     * @return O ID do amigo
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do amigo.
     *
     * @param id O ID do amigo
     */
    public void  setId(int id){
        this.id  = id;
    }

    /**
     * Retorna o nome do amigo.
     *
     * @return O nome do amigo
     */
    public String  getNome() {
        return nome;
    }

    /**
     * Define o nome do amigo.
     *
     * @param nome O nome do amigo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o número de telefone do amigo.
     *
     * @return O número de telefone do amigo
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * Define o número de telefone do amigo.
     *
     * @param telefone O número de telefone do amigo
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }



    /**
     * Método para obter a lista de amigos.
     */
    public ArrayList<Amigo> getListaAmigo() throws SQLException {
        return dao.listar();
    }

    /**
     * Insere um amigo no banco de dados.
     *
     * @param nome O nome do amigo a ser inserido.
     * @param telefone O telefone do amigo a ser inserido.
     * @return true se a inserção for bem-sucedida, false caso contrário.
     */
    public boolean insertAmigoDB(String nome, int telefone) throws SQLException {
        int maiorID = dao.maiorID() + 1;
        Amigo amigo = new Amigo(maiorID, nome, telefone);
        dao.inserir(amigo);
        return true;
    }

    /**
     * Método para deletar um amigo do banco de dados.
     */
    public boolean deleteAmigoBD(int id) throws SQLException {
        dao.deletar(id);
        return true;
    }

    /**
     * Retorna o índice de um amigo na lista.
     *
     * @param id O ID do amigo a ser buscado.
     * @return O índice do amigo na lista.
     */
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AmigoDAO.listaAmigo.size(); i++) {
            if (AmigoDAO.listaAmigo.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    /**
     * Método para atualizar um amigo no banco de dados.
     */
    public boolean updateAmigoDB(int id, String nome, int telefone) throws SQLException {
        Amigo amigo = new Amigo(id, nome, telefone);
        int indice = this.procuraIndice(id);
        dao.atualizar(amigo);
        return true;
    }

    /**
     * Método para carregar dados de um amigo específico pelo seu ID.
     */
    public Amigo buscarAmigoDB(int id) throws SQLException {
        return dao.buscar(id);
    }

    /**
     * Método para retornar o maior ID da base de dados.
     */
    public int maiorID() {
        return dao.maiorID();
    }

    public boolean possuiEmprestimoAtivo(int id) {
        boolean emprestimoAtivo = false;

        Emprestimo emp = new Emprestimo();

        ArrayList<Emprestimo> listaEmprestimo = emp.getListaEmprestimoAtivo();

        for (Emprestimo emprestimo : listaEmprestimo) {

            if (emprestimo.getIdAmigo() == id) {
                emprestimoAtivo = true;

                break;
            }

        }
        return emprestimoAtivo;
    }

    public int quantidadeEmprestimo(int id) {
        int som = 0;
        Emprestimo emp = new Emprestimo();
        ArrayList<Emprestimo> listaEmprestimo = emp.listaEmprestimo();
        for (int i = 0; i < listaEmprestimo.size(); i++) {
            if (listaEmprestimo.get(i).getIdAmigo() == id) {
                som++;
            }
        }
        return som;
    }
}
