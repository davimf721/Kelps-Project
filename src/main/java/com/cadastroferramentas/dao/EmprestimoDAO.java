package main.java.com.cadastroferramentas.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import main.java.com.cadastroferramentas.model.Emprestimo;

public class EmprestimoDAO {
    private Connection conexao;
    public FerramentaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void inserir(Emprestimo emprestimo) throws SQLException {
        String sql = "INSERT INTO Ferramentas (idEmpresetimo, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao, devolvido) VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, emprestimo.getIdEmprestimo());
        stmt.setInt(2, emprestimo.getIdFerramenta());
        stmt.setInt(3, emprestimo.getIdAmigo());
        stmt.setDate(4, emprestimo.getDataEmprestimo());
        stmt.setDate(5, emprestimo.getDataDevolucao());
        stmt.setBoolean(6, emprestimo.isDevolvido());
    }

    public List<Emprestimo> listar() throws SQLException {
        List<Emprestimo> emprestimos = new ArrayList<>();
        String sql = "SELECT * FROM Emprestimo";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int idEmpresetimo = rs.getInt("idEmprestimo");
            int idFerramenta = rs.getInt("idFerramenta");
            int idAmigo = rs.getInt("idAmigo");
            Date dataEmprestimo = rx.getDate("dataEmprestimo");
            Date dataDevolucao = rx.getDate("dataDevolucao");
            boolean devolvido = rx.isDevolvido("devolvido");
            Emprestimo emprestimo = new Emprestimo(idEmprestimo, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao, devolvido);
            emprestimos.add(emprestimo);
        }
        return emprestimos;
    }
    public void atualizar(Emprestimo emprestimo) throws SQLException {
        String sql = "UPDATE Emprestimos SET idFerramenta = ?, idAmigo = ?, dataEmprestimo = ?, dataDevolucao = ?, devolvido = ? WHERE idEmprestimo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, emprestimo.getIdFerramenta());
        stmt.setInt(2, emprestimo.getIdAmigo());
        stmt.setDate(3, emprestimo.getDataEmprestimo());
        stmt.setDate(4, emprestimo.getDataDevolucao());
        stmt.setBoolean(5, emprestimo.isDevolvido());
        stmt.setInt(6, emprestimo.getIdEmprestimo());
        stmt.execute();
    }

    public void deletar(int idEmprestimo) throws SQLException {
        String sql = "DELETE FROM Emprestimos WHERE idEmprestimo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idEmprestimo);
        stmt.execute();
    }
}
