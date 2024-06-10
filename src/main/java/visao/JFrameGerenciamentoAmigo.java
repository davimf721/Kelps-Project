package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Amigo;
import javax.swing.ImageIcon;

/**
 *
 * @author bento
 */
    public class JFrameGerenciamentoAmigo extends javax.swing.JFrame {
    
        private Amigo objetoamigo;

        public JFrameGerenciamentoAmigo() throws SQLException {
            initComponents();
            this.objetoamigo = new Amigo(); //Carrega objetoamigo de Amigo  
            this.carregaTabela(); 
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabelaAmigos = new javax.swing.JTable();
        JBFechar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel1.setText("Gerenciar Amigos");

        JTabelaAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTabelaAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabelaAmigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTabelaAmigos);
        if (JTabelaAmigos.getColumnModel().getColumnCount() > 0) {
            JTabelaAmigos.getColumnModel().getColumn(0).setResizable(false);
            JTabelaAmigos.getColumnModel().getColumn(1).setResizable(false);
            JTabelaAmigos.getColumnModel().getColumn(2).setResizable(false);
        }

        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
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

        jLabel2.setText("Telefone:");

        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        JTFId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIdActionPerformed(evt);
            }
        });

        jLabel4.setText("Id:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("Kelps.");

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110)
                                        .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JBVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed
    public void carregaTabela() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) this.JTabelaAmigos.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
        //Carrega a lista de objetos aluno
        ArrayList<Amigo> Amigos = objetoamigo.listarAmigo();
        for (Amigo a : Amigos) {
          modelo.addRow(new Object[]{
            a.getId(),
            a.getNome(),
            a.getTelefone()
          });
        }
    }
    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        // TODO add your handling code here:
        try {
            // validando dados da interface gráfica.
            int id = 0;
            if (this.JTabelaAmigos.getSelectedRow() == -1) {
                ImageIcon customIcon = new ImageIcon("C:\\Users\\lucas\\Desktop\\FACULDAD\\Kelps-Project\\src\\main\\java\\visao\\pequenaLOGO.png");
                JOptionPane.showMessageDialog(null, "Primeiro Selecione um amigo para APAGAR!","Calma ai parceiro!", 0,customIcon);
            } else {
                id = Integer.parseInt(this.JTabelaAmigos.
                    getValueAt(this.JTabelaAmigos.getSelectedRow(), 0).toString());
            }
                // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.
                showConfirmDialog(null,"Tem certeza que deseja apagar este amigo ?");
            
            if (respostaUsuario == 0) {// clicou em SIM

                if (this.objetoamigo.deletarAmigoBD(id)) {
                    // limpa os campos
                    this.JTFId.setText("");
                    this.JTFNome.setText("");
                    this.JTFTelefone.setText("");
                    ImageIcon customIcon = new ImageIcon("C:\\Users\\lucas\\Desktop\\FACULDAD\\Kelps-Project\\src\\main\\java\\visao\\pequenaLOGO.png");
                    JOptionPane.showMessageDialog(null, "Amigo apagado com sucesso!","Sucesso!", 0,customIcon);
                }
            }
            // atualiza a tabela.
                System.out.println(this.objetoamigo.listarAmigo().toString());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {

                carregaTabela();
            } catch (SQLException ex) {
                Logger.getLogger(JFrameGerenciamentoFerramenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefoneActionPerformed

    private void jTabelaAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabelaAmigosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTabelaAmigosMouseClicked

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        // TODO add your handling code here:
         try {
            // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            int telefone = 0;
 
            if (this.JTFNome.getText().length() < 2) {
                    ImageIcon customIcon = new ImageIcon("C:\\Users\\lucas\\Desktop\\FACULDAD\\Kelps-Project\\src\\main\\java\\visao\\pequenaLOGO.png");
                    JOptionPane.showMessageDialog(null, "Nome deve conter ao menos 2 caracteres!","Calma ai parceiro!", 0,customIcon);
            } else {
                nome = this.JTFNome.getText();
            }    
            if (this.JTFTelefone.getText().length() < 9) {
                    ImageIcon customIcon = new ImageIcon("C:\\Users\\lucas\\Desktop\\FACULDAD\\Kelps-Project\\src\\main\\java\\visao\\pequenaLOGO.png");
                    JOptionPane.showMessageDialog(null, "O telefone deve ter 9 digitos!","Calma ai parceiro!", 0,customIcon);
            } else {
                telefone = Integer.parseInt(this.JTFTelefone.getText());
            }  
            
            if (this.JTFId.getText().length() == -1) {
                    ImageIcon customIcon = new ImageIcon("C:\\Users\\lucas\\Desktop\\FACULDAD\\Kelps-Project\\src\\main\\java\\visao\\pequenaLOGO.png");
                    JOptionPane.showMessageDialog(null, "Informe um Id Valido!","Calma ai parceiro!", 0,customIcon);
            } else {
                id = Integer.parseInt(this.JTFId.getText());
            }  
            
            
            if (this.objetoamigo.atualizarAmigoDB(id, nome, telefone)){
                    // limpa os campos               
                this.JTFId.setText("");
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
                ImageIcon customIcon = new ImageIcon("C:\\Users\\lucas\\Desktop\\FACULDAD\\Kelps-Project\\src\\main\\java\\visao\\pequenaLOGO.png");
                JOptionPane.showMessageDialog(null, "Amigo alterado com Sucesso!","Sucesso!", 0,customIcon);
            }
                //Exibe no console o Amigo cadastrado
                System.out.println(this.objetoamigo.listarAmigo().toString());
            } catch (NumberFormatException erro2) {
                ImageIcon customIcon = new ImageIcon("C:\\Users\\lucas\\Desktop\\FACULDAD\\Kelps-Project\\src\\main\\java\\visao\\pequenaLOGO.png");
                JOptionPane.showMessageDialog(null, "Informe um número válido!","Erro!", 0,customIcon);
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

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JTabelaAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaAmigosMouseClicked
        // TODO add your handling code here:
        if (this.JTabelaAmigos.getSelectedRow() != -1) {
        String id = this.JTabelaAmigos.getValueAt(this.JTabelaAmigos.getSelectedRow(), 1).toString();
        String nome = this.JTabelaAmigos.getValueAt(this.JTabelaAmigos.getSelectedRow(), 2).toString();
        String telefone = this.JTabelaAmigos.getValueAt(this.JTabelaAmigos.getSelectedRow(), 3).toString();        
        
        this.JTFId.setText(id);
        this.JTFNome.setText(nome);
        this.JTFTelefone.setText(telefone);
        
        }
    }//GEN-LAST:event_jTabelaAmigosMouseClicked

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            JFrameGerenciar frame = new JFrameGerenciar();
            frame.setVisible(true);
         }
      });
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JTFIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdActionPerformed
    
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
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JTextField JTFId;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JTable JTabelaAmigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
