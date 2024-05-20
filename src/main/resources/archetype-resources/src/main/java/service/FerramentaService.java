package main.java.com.cadastroferramentas.service;

import main.java.com.cadastroferramentas.dao.FerramentaDAO;
import main.java.com.cadastroferramentas.model.Ferramenta;

import java.sql.SQLException;
import java.util.List;

public class FerramentaService {
    private final FerramentaDAO ferramentaDAO;

    public FerramentaService(FerramentaDAO ferramentaDAO) {
        this.ferramentaDAO = ferramentaDAO;
    }

    public List<Ferramenta> listar() throws SQLException {
        return ferramentaDAO.listar();
    }

    public Ferramenta buscarFerramenta(int id) throws SQLException {
        return ferramentaDAO.buscar(id);
    }

    public void inserirFerramenta(Ferramenta ferramenta) throws SQLException {
        ferramentaDAO.inserir(ferramenta);
    }

    public void atualizarFerramenta(Ferramenta ferramenta) throws SQLException {
        ferramentaDAO.atualizar(ferramenta);
    }

    public void deletarFerramenta(int id) throws SQLException {
        ferramentaDAO.deletar(id);
    }
}
