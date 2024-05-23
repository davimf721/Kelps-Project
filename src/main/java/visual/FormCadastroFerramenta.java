package visual;

import javax.swing.*;

public class FormCadastroFerramenta {
    private JPanel panelMain;
    private JLabel cadastroDaFerramentaLabel;
    private JTextField JTFNome;
    private JTextField JTFMarca;
    private JTextField JTFCusto;
    private JButton salvarButton;
    private JButton cancelarButton;


    public FormCadastroFerramenta() {
        // Inicializa a interface gráfica
        initComponents();
    }

    private void initComponents() {
        // Inicializa os componentes da interface gráfica aqui
        salvarButton.addActionListener(e -> salvar());
        cancelarButton.addActionListener(e -> cancelar());
    }

    private void salvar() {
        // Implementa a lógica para salvar os dados do formulário
        String nome = JTFNome.getText();
        String marca = JTFMarca.getText();
        double custo = Double.parseDouble(JTFCusto.getText());

        // salvar os dados em um banco de dados
        System.out.println("Dados salvos: " + nome + ", " + marca + ", " + custo);
    }

    public void setVisible(boolean visible) {
        // Define a visibilidade do formulário
        // Você pode implementar a lógica para exibir ou ocultar o formulário aqui
    }

    private void cancelar() {
        // Implementa a lógica para cancelar a operação
        System.out.println("Operação cancelada");
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
