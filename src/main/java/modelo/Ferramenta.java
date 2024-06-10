package modelo;


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
    private double total;// Total dos Preços
    private FerramentaDAO dao;

    
    /**
     * Construtor padrão para a classe Ferramenta.
     * Inicializa os atributos com valores padrão.
     */
    public Ferramenta() {
        this(0, "", "", 0);
    }
    
    /**
     * Construtor para criar uma nova ferramenta com atributos definidos.
     *
     * @param id Identificador único da ferramenta
     * @param nome Nome da ferramenta
     * @param marca Marca da ferramenta
     * @param custoAquisicao Custo de aquisição da ferramenta
     */
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
    
    public double getTotal(){
        return total;
    }
    /**
     * Define o total dos custos das ferramentas.
     *
     * @param total O total dos custos
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    /**
     * Verifica a disponibilidade de uma ferramenta com base no seu ID.
     *
     * @param id O ID da ferramenta a ser verificada
     * @return "Sim" se a ferramenta estiver disponível, "Não" caso contrário
     */
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
    
    /**
     * Obtém uma lista de todas as ferramentas cadastradas.
     *
     * @return Lista de ferramentas
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public ArrayList<Ferramenta> listarFerramenta() throws SQLException {
        return dao.listar();
    }
    /**
     * Insere uma nova ferramenta no banco de dados.
     *
     * @param nome Nome da ferramenta a ser inserida
     * @param marca Marca da ferramenta a ser inserida
     * @param custoAquisicao Custo de aquisição da ferramenta a ser inserida
     * @return true se a inserção for bem-sucedida, false caso contrário
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public boolean inserirFerramentaDB(String nome, String marca, double custoAquisicao) throws SQLException {
        int maiorID = dao.maiorIDFerramenta() + 1;
        Ferramenta ferramenta = new Ferramenta(maiorID, nome, marca, custoAquisicao);
        dao.inserir(ferramenta);
        return true;

    }

    /**
     * Deleta uma ferramenta do banco de dados com base no seu ID.
     *
     * @param id O ID da ferramenta a ser deletada
     * @return true se a exclusão for bem-sucedida, false caso contrário
     */
    public boolean deletarFerramentaDB(int id) {
        dao.deletar(id);
        return true;
    }
    
    /**
     * Procura o índice de uma ferramenta na lista de ferramentas.
     *
     * @param id O ID da ferramenta a ser procurada
     * @return O índice da ferramenta na lista, ou -1 se não encontrada
     */
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < FerramentaDAO.listaFerramenta.size(); i++) {
            if (FerramentaDAO.listaFerramenta.get(i).getId() == id) {
                indice = i;
            }

        }
        return indice;
    }
    
    /**
     * Atualiza os dados de uma ferramenta no banco de dados.
     *
     * @param id O ID da ferramenta a ser atualizada
     * @param nome Nome atualizado da ferramenta
     * @param marca Marca atualizada da ferramenta
     * @param custoAquisicao Custo de aquisição atualizado da ferramenta
     * @return true se a atualização for bem-sucedida, false caso contrário
     */
    public boolean atualizarFerramentaDB(int id, String nome, String marca, double custoAquisicao) {
        Ferramenta ferramenta = new Ferramenta(id, nome, marca, custoAquisicao);
        dao.atualizar(ferramenta);
        return true;
    }
    
    /**
     * Busca uma ferramenta no banco de dados com base no seu ID.
     *
     * @param id O ID da ferramenta a ser buscada
     * @return O objeto Ferramenta correspondente ao ID, ou null se não encontrada
     */
    public Ferramenta buscarFerramentaDB(int id) {
        return dao.buscar(id);
    }
}
