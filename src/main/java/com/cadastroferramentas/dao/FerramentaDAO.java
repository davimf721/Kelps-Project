package main.java.com.cadastroferramentas.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FerramentaDAO {
    private Connection conexao;

    public FerramentaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void inserir(Ferramenta ferramenta) throws SQLException {
        String sql = "INSERT INTO Ferramentas (id, nome, marca, custoAquisicao) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, ferramenta.getId());
        stmt.setString(2, ferramenta.getNome());
        stmt.setString(3, ferramenta.getMarca());
        stmt.setDouble(4, ferramenta.getCustoAquisicao());
        stmt.execute();
    }

    public List<Ferramenta> listar() throws SQLException {
        List<Ferramenta> ferramentas = new ArrayList<>();
        String sql = "SELECT * FROM Ferramentas";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String marca = rs.getString("marca");
            double custoAquisicao = rs.getDouble("custoAquisicao");
            Ferramenta ferramenta = new Ferramenta(id, nome, marca, custoAquisicao);
            ferramentas.add(ferramenta);
        }
        return ferramentas;
    }

    public Ferramenta buscar(int id) throws SQLException {
        String sql = "SELECT * FROM Ferramentas WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String nome = rs.getString("nome");
            String marca = rs.getString("marca");
            double custoAquisicao = rs.getDouble("custoAquisicao");
            return new Ferramenta(id, nome, marca, custoAquisicao);
        } else {
            return null;
        }
    }

    public void atualizar(Ferramenta ferramenta) throws SQLException {
        String sql = "UPDATE Ferramentas SET nome = ?, marca = ?, custoAquisicao = ? WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, ferramenta.getNome());
        stmt.setString(2, ferramenta.getMarca());
        stmt.setDouble(3, ferramenta.getCustoAquisicao());
        stmt.setInt(4, ferramenta.getId());
        stmt.execute();
    }

    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM Ferramentas WHERE id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
    }

}
