package main.java.com.cadastroferramentas.dao;

import main.java.com.cadastroferramentas.model.Amigo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class AmigoDAO {
    private final Connection conexao;

    public AmigoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void inserir(Amigo amigo) throws SQLException {
        String sql = "INSERT INTO amigos (nome, telefone) VALUES (?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, amigo.getNome());
        stmt.setString(2, amigo.getTelefone());
        stmt.execute();

        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            amigo.setId(rs.getInt(1));
        }
    }

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

    public Amigo buscar(int id) throws SQLException {
        String sql = "SELECT * FROM amigos WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String nome = rs.getString("nome");
            String telefone = rs.getString("telefone");
            return new Amigo(id, nome, telefone);
        } else {
            return null;
        }
    }

    public void atualizar(Amigo amigo) throws SQLException {
        String sql = "UPDATE amigos SET nome = ?, telefone = ? WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, amigo.getNome());
        stmt.setString(2, amigo.getTelefone());
        stmt.setInt(3, amigo.getId());
        stmt.execute();
    }

    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM amigos WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
    }
}