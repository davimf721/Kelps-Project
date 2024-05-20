package main.java.com.cadastroferramentas.dao;

import java.util.List;
import java.util.ArrayList;
import main.java.com.cadastroferramentas.model.Amigo;
import java.sql.*;

public class AmigoDAO {
    private Connection conexao;

    // Construtor para receber a conexão com o banco de dados
    public AmigoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    // Método para adicionar um novo amigo ao banco de dados
    public void inserir(Amigo amigo) throws SQLException {
        String query = "INSERT INTO amigos (nome, telefone) VALUES (?, ?)";
        try (PreparedStatement statement = conexao.prepareStatement(query)) {
            statement.setString(1, amigo.getNome());
            statement.setString(2, amigo.getTelefone());
            statement.executeUpdate();
        }
    }

    // Método para listar todos os amigos do banco de dados
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




    // Método para atualizar um amigo no banco de dados
    public void atualizar(Amigo amigo) throws SQLException {
        String sql = "UPDATE amigos SET nome = ?, telefone = ? WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, amigo.getNome());
        stmt.setString(2, amigo.getTelefone());
        stmt.setInt(3, amigo.getId());
        stmt.executeUpdate();
    }


    // Método para deletar um amigo do banco de dados
    public void deletar(int amigoId) throws SQLException {
        String query = "DELETE FROM amigos WHERE id=?";
        try (PreparedStatement statement = conexao.prepareStatement(query)) {
            statement.setInt(1, amigoId);
            statement.executeUpdate();
        }
    }
    // Método para buscar um amigo pelo ID
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
                    return null; // Não encontrado
                }
            }
        }
    }

    }


