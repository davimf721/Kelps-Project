package controller;

import dao.EmprestimoDAO;
import model.Emprestimo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmprestimoController {
    private final EmprestimoDAO emprestimoDAO;
    private static final Logger LOGGER = Logger.getLogger(EmprestimoController.class.getName());

    /**
     * Construtor da classe EmprestimoController.
     * @param conexao Objeto de conexão com o banco de dados.
     */
    public EmprestimoController(Connection conexao) {
        this.emprestimoDAO = new EmprestimoDAO(conexao);
    }

    /**
     * Lista todos os empréstimos cadastrados no banco de dados.
     */
    public void listarEmprestimos() {
        try {
            List<Emprestimo> emprestimos = emprestimoDAO.listar();
            for (Emprestimo emprestimo : emprestimos) {
                System.out.println(emprestimo);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao listar os empréstimos", e);
        }
    }

    /**
     * Busca um empréstimo pelo seu ID no banco de dados.
     * @param id ID do empréstimo a ser buscado.
     */
    public void buscarEmprestimo(int id) {
        try {
            Emprestimo emprestimo = emprestimoDAO.buscar(id);
            if (emprestimo != null) {
                System.out.println("Empréstimo encontrado: " + emprestimo);
            } else {
                System.out.println("Empréstimo com ID " + id + " não encontrado.");
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar o empréstimo", e);
        }
    }

    /**
     * Insere um novo empréstimo no banco de dados.
     * @param emprestimo Empréstimo a ser inserido.
     */
    public void inserirEmprestimo(Emprestimo emprestimo) {
        try {
            emprestimoDAO.inserir(emprestimo);
            System.out.println("Empréstimo inserido com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir o empréstimo", e);
        }
    }

    /**
     * Atualiza os dados de um empréstimo no banco de dados.
     * @param emprestimo Empréstimo a ser atualizado.
     */
    public void atualizarEmprestimo(Emprestimo emprestimo) {
        try {
            emprestimoDAO.atualizar(emprestimo);
            System.out.println("Empréstimo atualizado com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao atualizar o empréstimo", e);
        }
    }

    /**
     * Deleta um empréstimo do banco de dados pelo seu ID.
     * @param id ID do empréstimo a ser deletado.
     */
    public void deletarEmprestimo(int id) {
        try {
            emprestimoDAO.deletar(id);
            System.out.println("Empréstimo deletado com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao deletar o empréstimo", e);
        }
    }
}