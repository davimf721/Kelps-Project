package dao;

import model.Ferramenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * Esta classe implementa operações de acesso a dados para a entidade Ferramenta no banco de dados.
 */
public class FerramentaDAO extends ConexaoDAO {
    /**
     * Lista de ferramentas em armazenamento.
     */
    public static ArrayList<Ferramenta> listaFerramenta = new ArrayList<>();

    /**
     * Obtém a lista de ferramentas do banco de dados.
     *
     * @return Lista de ferramentas.
     */
    public ArrayList<Ferramenta> listar() {
        listaFerramenta.clear();
        try {
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("select * from ferramentas");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double custoAquisicao = res.getDouble("custo_aquisicao");
                Ferramenta objeto = new Ferramenta(id, nome, custoAquisicao, marca);

                listaFerramenta.add(objeto);
            }
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return listaFerramenta;
    }

    /**
     * Busca uma ferramenta no banco de dados com base no ID.
     *
     * @param id O ID da ferramenta a ser buscada
     * @return O objeto Ferramenta encontrado ou null se não encontrado
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
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

    /**
     * Deleta uma ferramenta do banco de dados com base no ID da ferramenta.
     *
     * @param id O ID da ferramenta a ser deletada
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
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

    /**
     * Atualiza as informações de uma ferramenta no banco de dados.
     *
     * @param ferramenta O objeto Ferramenta com as informações atualizadas
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
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

    /**
     * Insere uma nova ferramenta no banco de dados.
     *
     * @param ferramenta A ferramenta a ser inserida
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
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
    public Ferramenta carregarFerramenta(int id) {
        Ferramenta objeto = new Ferramenta();
        objeto.setId(id);
        try {
            Statement statement = this.conexao.createStatement();            
            ResultSet res = statement.executeQuery("SELECT * FROM tb_amigos WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setMarca(res.getString("marca"));
            objeto.setCustoAquisicao(res.getDouble("Custo de aquisição"));

            statement.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }

    public int maiorID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}