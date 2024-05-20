package com.project.service;

import com.google.protobuf.ServiceException;
import com.project.dao.EmprestimoDAO;
import com.project.model.Emprestimo;

import java.sql.SQLException;
import java.util.List;

public class EmprestimoService {
    private final EmprestimoDAO emprestimoDAO;

    public EmprestimoService(EmprestimoDAO emprestimoDAO) {
        this.emprestimoDAO = emprestimoDAO;
    }

    /**
     * List all emprestimos from the database.
     *
     * @return a list of Emprestimo
     * @throws ServiceException if there is an error during the database operation
     */
    public List<Emprestimo> listar() throws ServiceException {
        try {
            return emprestimoDAO.listar();
        } catch (SQLException e) {
            // Print the stack trace for debugging purposes
            e.printStackTrace();
            throw new ServiceException("Erro ao listar emprestimos", e);
        }
    }

    /**
     * Find an emprestimo by its ID.
     *
     * @param id the ID of the emprestimo
     * @return the found Emprestimo
     * @throws ServiceException if there is an error during the database operation
     */
    public Emprestimo buscarEmprestimo(int id) throws ServiceException {
        try {
            return emprestimoDAO.buscar(id);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServiceException("Erro ao buscar emprestimo", e);
        }
    }

    /**
     * Insert a new emprestimo into the database.
     *
     * @param emprestimo the Emprestimo to insert
     * @throws ServiceException if there is an error during the database operation
     */
    public void inserirEmprestimo(Emprestimo emprestimo) throws ServiceException {
        try {
            emprestimoDAO.inserir(emprestimo);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServiceException("Erro ao inserir emprestimo", e);
        }
    }

    /**
     * Update an existing emprestimo in the database.
     *
     * @param emprestimo the Emprestimo to update
     * @throws ServiceException if there is an error during the database operation
     */
    public void atualizarEmprestimo(Emprestimo emprestimo) throws ServiceException {
        try {
            emprestimoDAO.atualizar(emprestimo);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServiceException("Erro ao atualizar emprestimo", e);
        }
    }

    /**
     * Delete an emprestimo from the database.
     *
     * @param id the ID of the emprestimo to delete
     * @throws ServiceException if there is an error during the database operation
     */
    public void deletarEmprestimo(int id) throws ServiceException {
        try {
            emprestimoDAO.deletar(id);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServiceException("Erro ao deletar emprestimo", e);
        }
    }
}