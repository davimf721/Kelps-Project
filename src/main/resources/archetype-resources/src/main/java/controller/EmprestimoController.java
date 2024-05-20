package main.java.com.cadastroferramentas.controller;

import main.java.com.cadastroferramentas.dao.EmprestimoDAO;
import main.java.com.cadastroferramentas.model.Emprestimo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmprestimoController {
    private final EmprestimoDAO emprestimoDAO;
    private static final Logger LOGGER = Logger.getLogger(EmprestimoController.class.getName());

    public EmprestimoController(Connection conexao) {
        this.emprestimoDAO = new EmprestimoDAO(conexao);
    }

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

    public void inserirEmprestimo(Emprestimo emprestimo) {
        try {
            emprestimoDAO.inserir(emprestimo);
            System.out.println("Empréstimo inserido com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir o empréstimo", e);
        }
    }

    public void atualizarEmprestimo(Emprestimo emprestimo) {
        try {
            emprestimoDAO.atualizar(emprestimo);
            System.out.println("Empréstimo atualizado com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao atualizar o empréstimo", e);
        }
    }

    public void deletarEmprestimo(int id) {
        try {
            emprestimoDAO.deletar(id);
            System.out.println("Empréstimo deletado com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao deletar o empréstimo", e);
        }
    }
}