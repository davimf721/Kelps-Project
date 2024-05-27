

import dao.AmigoDAO;
import dao.FerramentaDAO;
import dao.EmprestimoDAO;
import model.Amigo;
import model.Emprestimo;
import model.Ferramenta;
import service.AmigoService;
import service.FerramentaService;
import service.EmprestimoService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
public class Main {
//      try (Connection conexao = DriverManager.getConnection("url", "usuario", "senha")) {
//        // Testando AmigoDAO e AmigoService
//        AmigoDAO amigoDAO = new AmigoDAO(conexao);
//        AmigoService amigoService = new AmigoService(amigoDAO);
//
//        Amigo novoAmigo = new Amigo("João", "123456789");
//        amigoService.inserirAmigo(novoAmigo);
//
//        List<Amigo> amigos = amigoService.listar();
//        System.out.println("Lista de amigos:");
//        for (Amigo amigo : amigos) {
//            System.out.println(amigo);
//        }
//
//        // Testando FerramentaDAO e FerramentaService
//        FerramentaDAO ferramentaDAO = new FerramentaDAO(conexao);
//        FerramentaService ferramentaService = new FerramentaService(ferramentaDAO);
//
//        Ferramenta novaFerramenta = new Ferramenta("Martelo", "MarcaX", 25.0);
//        ferramentaService.inserirFerramenta(novaFerramenta);
//
//        List<Ferramenta> ferramentas = ferramentaService.listar();
//        System.out.println("\nLista de ferramentas:");
//        for (Ferramenta ferramenta : ferramentas) {
//            System.out.println(ferramenta);
//        }
//
//        // Testando EmprestimoDAO e EmprestimoService
//        EmprestimoDAO emprestimoDAO = new EmprestimoDAO(conexao);
//        EmprestimoService emprestimoService = new EmprestimoService(emprestimoDAO);
//
//        Emprestimo novoEmprestimo = new Emprestimo(1, 1, 1, "2024-05-23", "2024-05-30", false);
//        emprestimoService.inserirEmprestimo(novoEmprestimo);
//
//        List<Emprestimo> emprestimos = emprestimoService.listar();
//        System.out.println("\nLista de empréstimos:");
//        for (Emprestimo emprestimo : emprestimos) {
//            System.out.println(emprestimo);
//        }
//
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//}

////    public static void main(String[] args) {
//
////        try (Connection conexao = MySQLConnection.getConnection()) {
////            AmigoDAO amigoDAO = new AmigoDAO(conexao);
////
////            // Criando um novo amigo
////            Amigo novoAmigo = new Amigo("João", "123456789");
////
////            // Inserindo o novo amigo no banco de dados
////            amigoDAO.inserir(novoAmigo);
////            System.out.println("Amigo adicionado com sucesso!");
////
////        } catch (SQLException e) {
////            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
////        }
//
//    public static void main(String[] args) {
//        // Cria um novo JFrame Menu Principal
//        JFrame frame = new JFrame("Kelps Ferramentas");
//        frame.setSize(600, 500);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Cria um painel
//        JPanel panelMain = new JPanel();
//        frame.add(panelMain);
//
//        // Chama o método que adicionará os componentes ao painel
//        placeComponents(panelMain);
//
//        // Define a janela como visível
//        frame.setVisible(true);
//    }
//
//    private static void placeComponents(JPanel panelMain) {
//        panelMain.setLayout(null);
//
//        // Cria e configura um título
//        JLabel label = new JLabel("Bem-vindo ao Kelps Ferramentas");
//        label.setBounds(190, 50, 300, 25); // Define a posição e tamanho do rótulo
//        panelMain.add(label); // Adiciona o rótulo ao painel
//
////        // Cria e configura um campo de texto
////        JTextField userText = new JTextField(20);
////        userText.setBounds(10,20,165,25);
////        panelMain.add(userText);
//
//        // Cria e configura um botão
//        JButton BtnCadastroA = new JButton("Cadastro Amigo");
//        BtnCadastroA.setBounds(90, 350, 155, 25);
//        panelMain.add(BtnCadastroA);
//
//        // Cria e configura um botão
//        JButton BtnCadastroF = new JButton("Cadastro Ferramenta");
//        BtnCadastroF.setBounds(310, 350, 155, 25);
//        panelMain.add(BtnCadastroF);
//
//        // Adiciona um ouvinte de ação ao botão
//        BtnCadastroA.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Cria uma nova instância de CadastroAmigo e chama o método criarInterface()
//                CadastroAmigo cadastroAmigo = new CadastroAmigo() {
//                    @Override
//                    public void criarInterface() {
//                        CadastroAmigo.super.criarInterface(); // Chama o método criarInterface() da interface
//                    }
//                };
//                cadastroAmigo.criarInterface(); // Chama o método criarInterface() da instância de CadastroAmigo
//            }
//        });
//    }
   }
