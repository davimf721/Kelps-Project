package dao;

import model.Emprestimo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe implementa operações de acesso a dados para a entidade Emprestimo no banco de dados.
 */
public class EmprestimoDAO extends ConexaoDAO {
    /**
     * Insere um novo empréstimo no banco de dados.
     *
     * @param emprestimo O objeto Emprestimo a ser inserido
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public boolean inserir(Emprestimo emprestimo) throws SQLException {
        String sql = "insert into emprestimos (id_ferramenta,id_amigo,data_emprestimo,data_devolucao)values(?,?,?,?)";
        try {
            PreparedStatement smt = super.getConexao().prepareCall(sql);
            smt.setInt(1, emprestimo.getIdFerramenta());
            System.out.println("emprestimo.getIdFerramenta: " + emprestimo.getIdFerramenta());
            smt.setInt(2, emprestimo.getIdAmigo());
            System.out.println("emprestimo.getIdAmigo: " + emprestimo.getIdAmigo());
            smt.setDate(3, emprestimo.getDataEmprestimo());
            smt.setDate(4, emprestimo.getDataDevolucao());
            smt.execute();
            smt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }
    public int maiorIDEmprestimo() {
        int MaiorIDEmprestimo = 0;
        try {
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("select MAX(id_emprestimo)idEmprestimo from emprestimos");
            res.next();
            MaiorIDEmprestimo = res.getInt("id_emprestimo");
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return MaiorIDEmprestimo;
    }

    // Lista para armazenar os dados dos empréstimos
    public static ArrayList<Emprestimo> listaEmprestimo = new ArrayList<>();

    /**
     * Estabelece uma conexão com o banco de dados de empréstimos.
     *
     * @return Conexão com o banco de dados ou null se a conexão falhar.
     */
    public ArrayList<Emprestimo> listar() {
        // Limpa a lista para evitar duplicatas

        listaEmprestimo.clear();
        try {
            // Cria uma declaração para executar a consulta SQL
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("select * from emprestimos");

            // Itera sobre o resultado da consulta e adiciona empréstimos à lista
            while (res.next()) {
                int idEmprestimo = res.getInt("id_emprestimo");
                int idFerramenta = res.getInt("id_ferramenta");
                int idAmigo = res.getInt("id_amigo");
                Date dataEmprestimo = res.getDate("data_emprestimo");
                Date dataDevolucao = res.getDate("data_devolucao");
                Emprestimo objeto = new Emprestimo(idEmprestimo, idFerramenta, idAmigo, dataEmprestimo, dataDevolucao);

                listaEmprestimo.add(objeto);
            }
            // Fecha a declaração após a execução da consulta
            smt.close();
        } catch (SQLException erro) {
            // Trata o erro caso ocorra algum problema na execução da consulta
            System.out.println("Erro: " + erro);
        }
        // Retorna a lista de empréstimos
        return listaEmprestimo;

    }

    public static void setListaEmprestimo(ArrayList<Emprestimo> listaEmprestimo) {
        EmprestimoDAO.listaEmprestimo = listaEmprestimo;

    }

    /**
     * Busca um empréstimo no banco de dados com base no ID do empréstimo.
     *
     * @param IdEmprestimo O ID do empréstimo a ser buscado
     * @return O objeto Emprestimo encontrado ou null se não encontrado
     */
    public Emprestimo buscar(int IdEmprestimo) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setIdEmprestimo(IdEmprestimo);
        try {
            Statement smt = super.getConexao().createStatement();
            ResultSet res = smt.executeQuery("select * from emprestimos where id_emprestimo = " + IdEmprestimo);
            res.next();
            emprestimo.setIdEmprestimo(res.getInt("id_emprestimo"));
            emprestimo.setDataDevolucao(res.getDate("data_devolucao"));
            emprestimo.setDataEmprestimo(res.getDate("data_emprestimo"));
            emprestimo.setIdAmigo(res.getInt("id_amigo"));
            emprestimo.setIdFerramenta(res.getInt("id_ferramenta"));
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return emprestimo;
    }

    /**
     * Atualiza as informações de um empréstimo no banco de dados.
     *
     * @param emprestimo O objeto Emprestimo com as informações atualizadas
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public boolean atualizar(Emprestimo emprestimo) {
        String res = "update emprestimos set id_emprestimo=?,id_ferramenta=?, id_amigo=?, data_emprestimo=?, data_devolucao=? where id_emprestimo=?";
        try {
            PreparedStatement smt = super.getConexao().prepareStatement(res);
            smt.setInt(1, emprestimo.getIdEmprestimo());
            smt.setInt(2, emprestimo.getIdFerramenta());
            smt.setInt(3, emprestimo.getIdAmigo());
            smt.setDate(4, emprestimo.getDataEmprestimo());
            smt.setDate(5, emprestimo.getDataDevolucao());
            smt.setInt(6, emprestimo.getIdEmprestimo());
            smt.execute();
            smt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Deleta um empréstimo do banco de dados com base no ID do empréstimo.
     *
     * @param id_emprestimo O ID do empréstimo a ser deletado
     * @throws SQLException Se ocorrer um erro durante a execução da operação SQL
     */
    public boolean deletar(int id_emprestimo) throws SQLException {
        try {
            Statement smt = super.getConexao().createStatement();
            smt.executeUpdate("delete from emprestimos where id_emprestimo=" + id_emprestimo);
            smt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }
}
