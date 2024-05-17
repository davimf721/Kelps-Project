package main.java.com.cadastroferramentas.controller;

import main.java.com.cadastroferramentas.dao.EmprestimoDAO;
import main.java.com.cadastroferramentas.model.Emprestimo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmprestimoController {
    private final EmprestimoDAO emprestimoDAO;

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
            System.err.println("Erro ao listar os empréstimos: " + e.getMessage());
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
            System.err.println("Erro ao inserir o empréstimo: " + e.getMessage());
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
            System.err.println("Erro ao atualizar o empréstimo: " + e.getMessage());
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
            System.err.println("Erro ao deletar o empréstimo: " + e.getMessage());
        }
    }
}
