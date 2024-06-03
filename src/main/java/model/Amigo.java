package model;

/**
 * Representa um amigo cadastrado no sistema.
 */
public class Amigo {
    // Atributos do amigo
    private int id;// Identificador único do amigo
    private String nome;// Nome do amigo
    private String telefone;// Número de telefone do amigo


    public Amigo(){
        this(0,"","");
    }
    /**
     * Construtor para criar um novo amigo sem ID atribuído.
     *
     * @param nome Nome do amigo
     * @param telefone Número de telefone do amigo
     */
    public Amigo(String nome, String telefone)  {
        this.nome = nome;
        this.telefone = telefone;
    }

    /**
     * Construtor para criar um novo amigo com ID atribuído.
     *
     * @param id Identificador único do amigo
     * @param nome Nome do amigo
     * @param telefone Número de telefone do amigo
     */
    public Amigo(int id, String nome, String telefone) {
        this.id = id;// Define o ID do amigo
        this.nome = nome;// Define o nome do amigo
        this.telefone = telefone;// Define o telefone do amigo
    }

    // Métodos de acesso aos atributos do amigo
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
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o número de telefone do amigo.
     *
     * @param telefone O número de telefone do amigo
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Sobrescreve o método toString para exibir informações do amigo.
     *
     * @return Uma representação em string do amigo
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone;
    }
    public ArrayList<Amigo> listar() throws SQLException {
        return (ArrayList<Amigo>) dao.listar();
    }

    //Cadastrar novo amigo
    public boolean inserir(int id, String Nome, int telefone) throws SQLException {
        id = this.maiorID() + 1;
        Amigo objeto = new Amigo(id, Nome, telefone);
        dao.inserir(objeto);
        return true;
    }

    //Deletar um amigo
    public boolean deletar(int id) throws SQLException {
        dao.deletar(id);
        return true;
    }

    public boolean atualizar(String nome, int id, int telefone) throws SQLException {
        Amigo objeto = new Amigo(id, nome, telefone);
        dao.atualizar(objeto);
        return true;
    }
    public Amigo carregaAmigo(int id) {
        return dao.carregarAmigo(id);
    }

    //Retorna o maior ID da base de dados
    public int maiorID() {
        return dao.maiorID();

    }

    public boolean inserirAmigo(String nome, String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
