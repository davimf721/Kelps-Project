package visao;

import java.sql.SQLException;
import model.Ferramenta;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Amigo;

/**
 *
 * @author bento
 */
public class JFrameGerenciamentoFerramenta extends javax.swing.JFrame {
    
    private Ferramenta objetoferramenta;
    /**
     * Creates new form JFrameGerenciamentoFerramenta
     */
    public JFrameGerenciamentoFerramenta() {
        initComponents();
        this.objetoferramenta = new Ferramenta();
        this.carregaTabela();
    }
    public void carregaTabela() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) this.jTabelaFerramentas.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
        //Carrega a lista de objetos aluno
        ArrayList<Ferramenta> Ferramentas = objetoferramenta.listar();
        for (Ferramenta a : Ferramentas) {
          modelo.addRow(new Object[]{
            a.getId(),
            a.getNome(),
            a.getMarca(),
            a.getCustoAquisicao(),
          });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaFerramentas = new javax.swing.JTable();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBSalvar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JTFMarca = new javax.swing.JTextField();
        JTFCustoAquisicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFId = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gerenciar ferramentas");

        jTabelaFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Marca", "Custo de aquisição"
            }
        ));
        jTabelaFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaFerramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaFerramentas);

        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBSalvar.setText("Salvar");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Custo de aquisição:");

        jLabel5.setText("Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBAlterar)
                    .addComponent(JBSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCancelar)
                    .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFId, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(JTFNome))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTFCustoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCustoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBApagar)
                    .addComponent(JBAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBSalvar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        // TODO add your handling code here:
        try {
            // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            String marca = "";
            double custoAquisicao = 0.0;
 
            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }    
            if (this.JTFCustoAquisicao.getText().length() !=0) {
                throw new Mensagem("O custo deve ser diferente de 0.");
            } else {
                nome = this.JTFCustoAquisicao.getText();
            }  
            
            if (this.jTabelaFerramentas.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro selecione uma Ferramenta para alterar");
            } else {
                id = Integer.parseInt(this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 0).toString());
            }
            
            if (this.objetoferramenta.atualizar(id, nome, marca, custoAquisicao)){
                    // limpa os campos               
                this.JTFId.setText("");
                this.JTFNome.setText("");
                this.JTFMarca.setText("");
                this.JTFCustoAquisicao.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada com Sucesso!");
            }
                //Exibe no console o aluno cadastrado
            System.out.println(this.objetoferramenta.listar().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } catch (SQLException ex) {
            Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // atualiza a tabela.
                carregaTabela();
            } catch (SQLException ex) {
                Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        // TODO add your handling code here:]
        try {
            // validando dados da interface gráfica.
            int id = 0;
            if (this.jTabelaFerramentas.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione uma Ferramenta para APAGAR");
            } else {
                id = Integer.parseInt(this.jTabelaFerramentas.
                    getValueAt(this.jTabelaFerramentas.getSelectedRow(), 0).toString());
            }
                // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.
                showConfirmDialog(null,"Tem certeza que deseja apagar esta Ferramenta ?");
            
            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Aluno processar
                if (this.objetoferramenta.deletar(id)) {
                    // limpa os campos
                    this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFCustoAquisicao.setText("");
                    JOptionPane.showMessageDialog(rootPane,"Ferramenta Apagada com Sucesso!");
                }
            }
            // atualiza a tabela.
            System.out.println(this.objetoferramenta.listar().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            try {
                // atualiza a tabela.
                carregaTabela();
            } catch (SQLException ex) {
                Logger.getLogger(JFrameGerenciamentoFerramenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTabelaFerramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaFerramentasMouseClicked
        // TODO add your handling code here:
        if (this.jTabelaFerramentas.getSelectedRow() != -1) {
        String id = this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 1).toString();
        String nome = this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 2).toString();
        String marca = this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 3).toString();
        String custoAquisicao = this.jTabelaFerramentas.getValueAt(this.jTabelaFerramentas.getSelectedRow(), 4).toString();
        
        this.JTFId.setText(id);
        this.JTFNome.setText(nome);
        this.JTFMarca.setText(marca);
        this.JTFCustoAquisicao.setText(custoAquisicao);       
        }
    }//GEN-LAST:event_jTabelaFerramentasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGerenciamentoFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JTextField JTFCustoAquisicao;
    private javax.swing.JTextField JTFId;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaFerramentas;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
