package dao;

import model.Amigo;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 * Esta classe implementa operações de acesso a dados para a entidade Amigo no banco de dados.
 */
public class AmigoDAO extends ConexaoDAO {

    public boolean inserir(Amigo amigo) throws SQLException {
        String res = "insert into amigos(id,nome,telefone)values(?,?,?)";
        try {
            PreparedStatement smt = super.getConexao().prepareCall(res);
            smt.setInt(1, amigo.getId());
            smt.setString(2, amigo.getNome());
            smt.setInt(3, amigo.getTelefone());
            smt.execute();
            smt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public static ArrayList<Amigo> listaAmigo = new ArrayList<>();

    /**
     * Lista todos os amigos cadastrados no banco de dados.
     *
     * @return Uma lista de objetos Amigo representando todos os amigos cadastrados
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public ArrayList<Amigo> listar() throws SQLException {
        listaAmigo.clear();
        try {
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("SELECT * FROM amigos");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int telefone = res.getInt("telefone");
                Amigo objeto = new Amigo(id, nome, telefone);
                listaAmigo.add(objeto);
            }
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return listaAmigo;
    }
    /**
     * Define a lista de amigos.
     *
     * @param listaAmigo Lista de amigos a ser definida.
     */
    public static void setListaAmigo(ArrayList<Amigo> listaAmigo) {
        AmigoDAO.listaAmigo = listaAmigo;
    }

    /**
     * Atualiza as informações de um amigo no banco de dados.
     *
     * @param amigo O objeto Amigo com as informações atualizadas
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public boolean atualizar(Amigo amigo) throws SQLException {
        String sql = "UPDATE amigos set id=?,nome=?,telefone=? where id=?";
        try {
            PreparedStatement smt = super.getConexao().prepareStatement(sql);
            smt.setInt(1, amigo.getId());
            smt.setString(2, amigo.getNome());
            smt.setInt(3, amigo.getTelefone());
            smt.setInt(4, amigo.getId());
            smt.execute();
            smt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }


    /**
     * Deleta um amigo do banco de dados com base no ID.
     *
     * @param idAmigo O ID do amigo a ser deletado
     */
    public boolean deletar(int idAmigo) {
        try {
            Statement smt = super.getConexao().createStatement();
            smt.executeUpdate("delete from amigos where id = " + idAmigo);
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }

    /**
     * Busca um amigo no banco de dados com base no ID.
     *
     * @param IdAmigo O ID do amigo a ser buscado
     * @return O objeto Amigo encontrado ou null se não encontrado
     */
    public Amigo buscar(int IdAmigo) {
        Amigo amigo = new Amigo();
        amigo.setId(IdAmigo);
        try {
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("select * from amigos where id = " + IdAmigo);
            res.next();
            amigo.setNome(res.getString("nomeAmigo"));
            amigo.setTelefone(res.getInt("telefone"));
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return amigo;
    }

    public int maiorID() {
        int MaiorID = 0;
        try {
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("select MAX(id)idAmigo from amigos");
            res.next();
            MaiorID = res.getInt("idAmigo");
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return MaiorID;
    }
}


