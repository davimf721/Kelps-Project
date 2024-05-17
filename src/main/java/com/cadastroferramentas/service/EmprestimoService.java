package main.java.com.cadastroferramentas.service;

import main.java.com.cadastroferramentas.dao.EmprestimoDAO;
import main.java.com.cadastroferramentas.model.Emprestimo;

import java.sql.SQLException;
import java.util.List;
public class EmprestimoService {
    private EmprestimoDAO emprestimoDAO = new EmprestimoDAO();

    public List<Emprestimo> listar() throws SQLException {
        return emprestimoDAO.listar();
    }
    public void inserirEmprestimo(Emprestimo emprestimo) throws SQLException {
        emprestimoDAO.inserir(emprestimo);
    }

    public void atualizarEmprestimo(Emprestimo emprestimo) throws SQLException {
        emprestimoDAO.atualizar(emprestimo);
    }

    public void deletarEmprestimo(int id) throws SQLException {
        emprestimoDAO.deletar(id);
    }

}
