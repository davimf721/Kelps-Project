package dao;

import model.Emprestimo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe implementa operações de acesso a dados para a entidade Emprestimo no banco de dados.
 */
public class EmprestimoDAO {
    private final Connection conexao;

    /**
     * Construtor que inicializa a conexão com o banco de dados.
     *
     * @param conexao A conexão com o banco de dados
     */
    public EmprestimoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    /**
     * Insere um novo empréstimo no banco de dados.
     *
     * @param emprestimo O objeto Emprestimo a ser inserido
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
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

    /**
     * Lista todos os empréstimos registrados no banco de dados.
     *
     * @return Uma lista de objetos Emprestimo representando todos os empréstimos registrados
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
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

    /**
     * Busca um empréstimo no banco de dados com base no ID do empréstimo.
     *
     * @param idEmprestimo O ID do empréstimo a ser buscado
     * @return O objeto Emprestimo encontrado ou null se não encontrado
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public Emprestimo buscar(int idEmprestimo) throws SQLException {
        String sql = "SELECT * FROM emprestimos WHERE id_emprestimo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idEmprestimo);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int idFerramenta = rs.getInt("id_ferramenta");
            int idAmigo = rs.getInt("id_amigo");
            Date dataEmprestimo = rs.getDate("data_emprestimo");
            Date dataDevolucao = rs.getDate("data_devolucao");
            boolean devolvido = rs.getBoolean("devolvido");
            return new Emprestimo(idEmprestimo, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao, devolvido);
        } else {
            return null;
        }
    }

    /**
     * Atualiza as informações de um empréstimo no banco de dados.
     *
     * @param emprestimo O objeto Emprestimo com as informações atualizadas
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
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

    /**
     * Deleta um empréstimo do banco de dados com base no ID do empréstimo.
     *
     * @param idEmprestimo O ID do empréstimo a ser deletado
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public void deletar(int idEmprestimo) throws SQLException {
        String sql = "DELETE FROM emprestimos WHERE id_emprestimo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idEmprestimo);
        stmt.executeUpdate();
    }
}
