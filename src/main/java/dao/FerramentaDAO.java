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
                Ferramenta objeto = new Ferramenta(id, nome, marca, custoAquisicao);

                listaFerramenta.add(objeto);
            }
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return listaFerramenta;
    }

    public int maiorIDFerramenta() {
        int MaiorID = 0;
        try {
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("select MAX(id)idFerramenta from ferramentas");
            res.next();
            MaiorID = res.getInt("id");
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return MaiorID;
    }

    public boolean inserir(Ferramenta ferramenta) {
        String res = "insert into ferramentas(nome,marca,custo_aquisicao)values(?,?,?)";
        try {
            PreparedStatement smt = super.getConexao().prepareCall(res);
            smt.setString(1, ferramenta.getNome());
            smt.setString(2, ferramenta.getMarca());
            smt.setDouble(3, ferramenta.getCustoAquisicao());
            smt.execute();
            smt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Busca uma ferramenta no banco de dados com base no ID.
     *
     * @param IdFerramenta O ID da ferramenta a ser buscada
     * @return O objeto Ferramenta encontrado ou null se não encontrado
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public Ferramenta buscar(int IdFerramenta) {
        Ferramenta ferramenta = new Ferramenta();
        ferramenta.setId(IdFerramenta);
        try {
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("select * from ferramentas where id = " + IdFerramenta);
            res.next();
            ferramenta.setNome(res.getString("nome"));
            ferramenta.setMarca(res.getString("marca"));
            ferramenta.setCustoAquisicao(res.getDouble("custo_aquisicao"));
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return ferramenta;
    }
    /**
     * Atualiza as informações de uma ferramenta no banco de dados.
     *
     * @param ferramenta O objeto Ferramenta com as informações atualizadas
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public boolean atualizar(Ferramenta ferramenta) {
        String res = "update ferramentas set id=?,nome=?, marca=?, custo_aquisicao=? where id=?";
        try {
            PreparedStatement smt = super.getConexao().prepareStatement(res);
            smt.setInt(1, ferramenta.getId());
            smt.setString(2, ferramenta.getNome());
            smt.setString(3, ferramenta.getMarca());
            smt.setDouble(4, ferramenta.getCustoAquisicao());
            smt.setInt(5, ferramenta.getId());
            smt.execute();
            smt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Deleta uma ferramenta do banco de dados com base no ID da ferramenta.
     *
     * @param id O ID da ferramenta a ser deletada
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public boolean deletar(int IdFerramenta) {
        try {
            Statement smt = super.getConexao().createStatement();
            smt.executeUpdate("delete from ferramentas where id=" + IdFerramenta);
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }

}