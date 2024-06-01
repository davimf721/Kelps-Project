package visao;

import dao.AmigoDAO;
import java.sql.SQLException;
import model.Amigo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


    public class JFrameGerenciamentoAmigo extends javax.swing.JFrame {
    
        private Amigo objetoamigo;

    public JFrameGerenciamentoAmigo() throws SQLException {
        initComponents();
        this.objetoamigo = new Amigo(); //Carrega objetoamigo de Amigo  
        this.carregarTabela(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabelaAmigos = new javax.swing.JTable();
        JBCancelar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBBuscar = new javax.swing.JButton();
        jTFNome = new javax.swing.JTextField();
        jTFTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gerenciar Amigos");

        JTabelaAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ));
        JTabelaAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabelaAmigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTabelaAmigos);

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefoneActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(160, 160, 160))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(JBAlterar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JBBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAlterar)
                    .addComponent(JBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBApagar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed
    public void carregarTabela() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) this.JTabelaAmigos.getModel();
        modelo.setNumRows(0);
        ArrayList<Amigo> minhaLista = objetoamigo.listar();
        for (Amigo a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone(),});
        }
    }
    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        // TODO add your handling code here:
        try {

            int id = 0;
            String nome = "";
            int telefone = 0;

            if (this.JTabelaAmigos.getSelectedRow() == -1) {
                throw new Mensagem("Selecione um Amigo para apagar");
            } else {
                id = Integer.parseInt(this.JTabelaAmigos.getValueAt(this.JTabelaAmigos.getSelectedRow(), 0).toString());
            }

            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Amigo?");

            if (respostaUsuario == 0) {

                if (this.objetoamigo.deletar(id)) {

                    this.jTFNome.setText("");
                    this.jTFTelefone.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Amigo Apagado.");
                }
            }

            System.out.println(this.objetoamigo.listar().toString()); 
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                carregarTabela();
            } catch (SQLException ex) {
                Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefoneActionPerformed

    private void JTabelaAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabelaAmigosMouseClicked
        // TODO add your handling code here:
        if (this.JTabelaAmigos.getSelectedRow() != -1) {
            String nome = this.JTabelaAmigos.getValueAt(this.JTabelaAmigos.getSelectedRow(), 1).toString();
            String telefone = this.JTabelaAmigos.getValueAt(this.JTabelaAmigos.getSelectedRow(), 2).toString();

            this.jTFNome.setText(nome);
            this.jTFTelefone.setText(telefone);

        }
    }//GEN-LAST:event_JTabelaAmigosMouseClicked

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        // TODO add your handling code here:
        try {

            int id = 0;
            String nome = "";
            int telefone = 0;

            if (this.jTFNome.getText().length() < 1) {
                throw new Mensagem("O Nome deve conter ao menos 1 caracteres.");
            } else {
                nome = this.jTFNome.getText();
            }

            if (this.jTFTelefone.getText().length() < 9 && this.jTFTelefone.getText().length() < 10) {
                throw new Mensagem("O Telefone deve ter 9 digitos.");
            } else {
                telefone = Integer.parseInt(this.jTFTelefone.getText());
            }

            if (this.JTabelaAmigos.getSelectedRow() == -1) {
                throw new Mensagem("Escolha um Amigo para Editar");
            } else {
                id = Integer.parseInt(this.JTabelaAmigos.getValueAt(this.JTabelaAmigos.getSelectedRow(), 0).toString());
            }

            if (this.objetoamigo.atualizar(nome, id, telefone)) {
                this.jTFNome.setText("");
                this.jTFTelefone.setText("");

                JOptionPane.showMessageDialog(null, "Amigo Editado com sucesso.");

            }
            System.out.println(this.objetoamigo.listar().toString());  
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } catch (SQLException ex) {
            Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                carregarTabela();
            } catch (SQLException ex) {
                Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }         
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JBBuscarActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameGerenciamentoAmigo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameGerenciamentoAmigo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTable JTabelaAmigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
