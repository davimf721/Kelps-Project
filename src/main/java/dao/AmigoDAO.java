package dao;

import model.Amigo;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 * Esta classe implementa operações de acesso a dados para a entidade Amigo no banco de dados.
 */
public class AmigoDAO {
    private final Connection conexao;

    /**
     * Construtor que inicializa a conexão com o banco de dados.
     *
     * @param conexao A conexão com o banco de dados
     */
    public AmigoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    /**
     * Insere um novo amigo no banco de dados.
     *
     * @param amigo O objeto Amigo a ser inserido
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public void inserir(Amigo amigo) throws SQLException {
        String query = "INSERT INTO amigos (nome, telefone) VALUES (?, ?)";
        try (PreparedStatement statement = conexao.prepareStatement(query)) {
            statement.setString(1, amigo.getNome());
            statement.setString(2, amigo.getTelefone());
            statement.executeUpdate();
        }
    }

    /**
     * Lista todos os amigos cadastrados no banco de dados.
     *
     * @return Uma lista de objetos Amigo representando todos os amigos cadastrados
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public List<Amigo> listar() throws SQLException {
        List<Amigo> amigos = new ArrayList<>();
        String sql = "SELECT * FROM amigos";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String telefone = rs.getString("telefone");
            Amigo amigo = new Amigo(id, nome, telefone);
            amigos.add(amigo);
        }
        return amigos;
    }

    /**
     * Atualiza as informações de um amigo no banco de dados.
     *
     * @param amigo O objeto Amigo com as informações atualizadas
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public void atualizar(Amigo amigo) throws SQLException {
        String sql = "UPDATE amigos SET nome = ?, telefone = ? WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, amigo.getNome());
        stmt.setString(2, amigo.getTelefone());
        stmt.setInt(3, amigo.getId());
        stmt.executeUpdate();
    }


    /**
     * Deleta um amigo do banco de dados com base no ID.
     *
     * @param amigoId O ID do amigo a ser deletado
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public void deletar(int amigoId) throws SQLException {
        String query = "DELETE FROM amigos WHERE id=?";
        try (PreparedStatement statement = conexao.prepareStatement(query)) {
            statement.setInt(1, amigoId);
            statement.executeUpdate();
        }
    }

    /**
     * Busca um amigo no banco de dados com base no ID.
     *
     * @param id O ID do amigo a ser buscado
     * @return O objeto Amigo encontrado ou null se não encontrado
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public Amigo buscar(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("ID de amigo inválido: " + id);
        }

        String sql = "SELECT nome, telefone FROM amigos WHERE id=?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String telefone = rs.getString("telefone");
                    return new Amigo(id, nome, telefone);
                } else {
                    return null;
                }
            }
        }
    }

    }


