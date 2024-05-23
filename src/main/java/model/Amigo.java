package model;

/**
 * Representa um amigo cadastrado no sistema.
 */
public class Amigo {
    // Atributos do amigo
    private int id;// Identificador único do amigo
    private String nome;// Nome do amigo
    private String telefone;// Número de telefone do amigo

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
}
