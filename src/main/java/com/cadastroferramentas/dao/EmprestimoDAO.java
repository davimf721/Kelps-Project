package main.java.com.cadastroferramentas.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import main.java.com.cadastroferramentas.model.Emprestimo;

public class EmprestimoDAO {
    private final Connection conexao;

    public EmprestimoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public EmprestimoDAO() {

    }

    public void inserir(Emprestimo emprestimo) throws SQLException {
        String sql = "INSERT INTO emprestimos (id_emprestimo, id_ferramenta, id_amigo, data_emprestimo, data_devolucao, devolvido) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, emprestimo.getIdEmprestimo());
        stmt.setInt(2, emprestimo.getIdFerramenta());
        stmt.setInt(3, emprestimo.getIdAmigo());
        stmt.setDate(4, emprestimo.getDataEmprestimo());
        stmt.setDate(5, emprestimo.getDataDevolucao());
        stmt.setBoolean(6, emprestimo.isDevolvido());
        stmt.executeUpdate();
    }

    public List<Emprestimo> listar() throws SQLException {
        List<Emprestimo> emprestimos = new ArrayList<>();
        String sql = "SELECT * FROM emprestimos";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int idEmprestimo = rs.getInt("id_emprestimo");
            int idFerramenta = rs.getInt("id_ferramenta");
            int idAmigo = rs.getInt("id_amigo");
            Date dataEmprestimo = rs.getDate("data_emprestimo");
            Date dataDevolucao = rs.getDate("data_devolucao");
            boolean devolvido = rs.getBoolean("devolvido");
            Emprestimo emprestimo = new Emprestimo(idEmprestimo, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao, devolvido);
            emprestimos.add(emprestimo);
        }
        return emprestimos;
    }

    public void atualizar(Emprestimo emprestimo) throws SQLException {
        String sql = "UPDATE emprestimos SET id_ferramenta = ?, id_amigo = ?, data_emprestimo = ?, data_devolucao = ?, devolvido = ? WHERE id_emprestimo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, emprestimo.getIdFerramenta());
        stmt.setInt(2, emprestimo.getIdAmigo());
        stmt.setDate(3, emprestimo.getDataEmprestimo());
        stmt.setDate(4, emprestimo.getDataDevolucao());
        stmt.setBoolean(5, emprestimo.isDevolvido());
        stmt.setInt(6, emprestimo.getIdEmprestimo());
        stmt.executeUpdate();
    }

    public void deletar(int idEmprestimo) throws SQLException {
        String sql = "DELETE FROM emprestimos WHERE id_emprestimo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idEmprestimo);
        stmt.executeUpdate();
    }
}
