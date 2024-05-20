package main.java.com.cadastroferramentas.service;

import main.java.com.cadastroferramentas.dao.EmprestimoDAO;
import main.java.com.cadastroferramentas.model.Emprestimo;

import java.sql.SQLException;
import java.util.List;

public class EmprestimoService {
    private final EmprestimoDAO emprestimoDAO;

    public EmprestimoService(EmprestimoDAO emprestimoDAO){
        this.emprestimoDAO = emprestimoDAO;
    }

    /**
     * Retorna uma lista de todos os empréstimos.
     *
     * @return Lista de empréstimos
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     */
    public List<Emprestimo> listar() throws SQLException {
        return emprestimoDAO.listar();
    }

    /**
     * Insere um novo empréstimo no banco de dados.
     *
     * @param emprestimo O empréstimo a ser inserido
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     * @throws IllegalArgumentException se o empréstimo for inválido
     */
    public void inserirEmprestimo(Emprestimo emprestimo) throws SQLException {
        validarEmprestimo(emprestimo);
        emprestimoDAO.inserir(emprestimo);
    }

    /**
     * Atualiza um empréstimo existente no banco de dados.
     *
     * @param emprestimo O empréstimo a ser atualizado
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     * @throws IllegalArgumentException se o empréstimo for inválido
     */
    public void atualizarEmprestimo(Emprestimo emprestimo) throws SQLException {
        validarEmprestimo(emprestimo);
        emprestimoDAO.atualizar(emprestimo);
    }

    /**
     * Deleta um empréstimo do banco de dados com base no ID.
     *
     * @param id O ID do empréstimo a ser deletado
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     * @throws IllegalArgumentException se o ID for inválido
     */
    public void deletarEmprestimo(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException(STR."ID de empréstimo inválido: \{id}");
        }
        emprestimoDAO.deletar(id);
    }

    /**
     * Valida um empréstimo antes de inseri-lo ou atualizá-lo no banco de dados.
     *
     * @param emprestimo O empréstimo a ser validado
     * @throws IllegalArgumentException se o empréstimo for inválido
     */
    private void validarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo == null) {
            throw new IllegalArgumentException("Empréstimo não pode ser nulo");
        }
        // Adicione outras verificações de validação aqui conforme necessário
    }
}