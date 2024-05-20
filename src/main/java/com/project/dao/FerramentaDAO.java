package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.project.model.Ferramenta;
import java.util.ArrayList;
import java.util.List;

public class FerramentaDAO {
    private final Connection conexao; /** Assumindo que a conexão seja fornecida ou injetada */

    public FerramentaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public Ferramenta buscar(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("ID de ferramenta inválido: " + id);
        }

        String sql = "SELECT nome, marca, custo_aquisicao FROM ferramentas WHERE id=?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String marca = rs.getString("marca");
                    double custoAquisicao = rs.getDouble("custo_aquisicao");
                    return new Ferramenta(id, nome, marca, custoAquisicao);
                } else {
                    return null; // Não encontrado
                }
            }
        }
    }

    public List<Ferramenta> listar() throws SQLException {
        List<Ferramenta> ferramentas = new ArrayList<>();
        String sql = "SELECT id, nome, marca, custo_aquisicao FROM ferramentas";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String marca = rs.getString("marca");
                    double custoAquisicao = rs.getDouble("custo_aquisicao");
                    ferramentas.add(new Ferramenta(id, nome, marca, custoAquisicao));
                }
            }
        }
        return ferramentas;

    }
    public void deletar(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("ID de ferramenta inválido: " + id);
        }

        String sql = "DELETE FROM ferramentas WHERE id=?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    public void atualizar(Ferramenta ferramenta) throws SQLException {
        if (ferramenta == null) {
            throw new IllegalArgumentException("Ferramenta não pode ser nula");
        }

        String sql = "UPDATE ferramentas SET nome=?, marca=?, custo_aquisicao=? WHERE id=?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, ferramenta.getNome());
            stmt.setString(2, ferramenta.getMarca());
            stmt.setDouble(3, ferramenta.getCustoAquisicao());
            stmt.setInt(4, ferramenta.getId());
            stmt.executeUpdate();
        }
    }
    public void inserir(Ferramenta ferramenta) throws SQLException {
        if (ferramenta == null) {
            throw new IllegalArgumentException("Ferramenta não pode ser nula");
        }

        String sql = "INSERT INTO ferramentas (nome, marca, custo_aquisicao) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, ferramenta.getNome());
            stmt.setString(2, ferramenta.getMarca());
            stmt.setDouble(3, ferramenta.getCustoAquisicao());
            stmt.executeUpdate();
        }
    }

}