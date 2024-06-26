/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;

/**
 *
 * @author bento
 */
public class JFrameGerenciamentoEmprestimo extends javax.swing.JFrame {
    
    private Emprestimo objetoemprestimo;

    /**
     * Creates new form JFrameGerenciamentoEmprestimo
     */
    public JFrameGerenciamentoEmprestimo() throws SQLException {
        initComponents();
        this.objetoemprestimo = new Emprestimo();
        this.carregaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTabelaEmprestimos = new javax.swing.JTable();
        JBFechar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JLAmigo = new javax.swing.JLabel();
        JLFerramenta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTFDataEmprestimo = new javax.swing.JTextField();
        JTFDataDevolucao = new javax.swing.JTextField();
        JTFEmprestimo = new javax.swing.JTextField();
        JTFFerramenta = new javax.swing.JTextField();
        JTFAmigo = new javax.swing.JTextField();
        JBVoltar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel1.setText("Gerenciar Emprestimos");

        JTabelaEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Emprestimo", "Ferramenta", "Amigo ", "Data Emprestimo", "Data Devolucao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTabelaEmprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabelaEmprestimosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTabelaEmprestimos);
        if (JTabelaEmprestimos.getColumnModel().getColumnCount() > 0) {
            JTabelaEmprestimos.getColumnModel().getColumn(0).setResizable(false);
            JTabelaEmprestimos.getColumnModel().getColumn(1).setResizable(false);
            JTabelaEmprestimos.getColumnModel().getColumn(2).setResizable(false);
            JTabelaEmprestimos.getColumnModel().getColumn(3).setResizable(false);
            JTabelaEmprestimos.getColumnModel().getColumn(4).setResizable(false);
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

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Kelps.");

        JLAmigo.setText("Amigo:");

        JLFerramenta.setText("Ferramenta:");

        jLabel6.setText("Emprestimo:");

        jLabel7.setText("Data de devolução:");

        jLabel8.setText("Data do emprestimo:");

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
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(167, 167, 167)
                                                .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JTFEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6))
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JLFerramenta)
                                                    .addComponent(JTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JLAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JTFAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jLabel1)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAmigo)
                    .addComponent(JLFerramenta)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JBVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed

        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed

        try {
            // validando dados da interface gráfica.
            int id = 0;
            if (this.JTabelaEmprestimos.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione um emprestimo para APAGAR");
            } else {
                id = Integer.parseInt(this.JTabelaEmprestimos.
                    getValueAt(this.JTabelaEmprestimos.getSelectedRow(), 0).toString());
            }
                // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.
                showConfirmDialog(null,"Tem certeza que deseja apagar este emprestimo ?");
            
            if (respostaUsuario == 0) {// clicou em SIM

                if (this.objetoemprestimo.deletarEmprestimoDB(id)) {
                    // limpa os campos
                    this.JTFAmigo.setText("");
                    this.JTFFerramenta.setText("");
                    this.JTFDataDevolucao.setText("");
                    this.JTFDataEmprestimo .setText("");
                    JOptionPane.showMessageDialog(rootPane,"Emprestimo apagado com sucesso");
                }
            }
            // atualiza a tabela.
                System.out.println(this.objetoemprestimo.listaEmprestimo().toString());
            } catch (Mensagem erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                // atualiza a tabela.
                carregaTabela();
            } catch (SQLException ex) {
                Logger.getLogger(JFrameGerenciamentoEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed

        try {
            // recebendo e validando dados da interface gráfica.
            int idEmprestimo = 0;
            int idFerramenta = 0;
            int idAmigo = 0;
            String dataEmprestimo = "";
            String dataDevolucao = "";
 
            if (this.JTFEmprestimo.getText().length() < 1) {
                throw new Mensagem("O emprestimo deve conter ao menos 1 caracter.");
            } else {
                idEmprestimo = Integer.parseInt(this.JTabelaEmprestimos.getValueAt(this.JTabelaEmprestimos.getSelectedRow(), 0).toString());
            } 
            if (this.JTFFerramenta.getText().isEmpty()) {
                throw new Mensagem("A ferramenta deve conter ao menos 1 caracteres.");
            } else {
                idFerramenta = Integer.parseInt(this.JTabelaEmprestimos.getValueAt(this.JTabelaEmprestimos.getSelectedRow(), 0).toString());
            }
            idAmigo = Integer.parseInt(this.JTFAmigo.getText());
            dataEmprestimo = this.JTFDataEmprestimo.getText();
            dataDevolucao = this.JTFDataDevolucao.getText();


            Date sqlDataEmprestimo = null;
            Date sqlDataDevolucao = null;

            if (!dataEmprestimo.isEmpty()) {
                sqlDataEmprestimo = convertStringToDate(dataEmprestimo);
            }
            if (!dataDevolucao.isEmpty()) {
                sqlDataDevolucao = convertStringToDate(dataDevolucao);
            }



            if (this.objetoemprestimo.atualizarEmprestimoDB(idAmigo, idFerramenta, idEmprestimo, sqlDataEmprestimo, sqlDataDevolucao)){
                    // limpa os campos               
                this.JTFAmigo.setText("");
                this.JTFFerramenta.setText("");
                this.JTFEmprestimo.setText("");
                this.JTFDataEmprestimo.setText("");
                this.JTFDataDevolucao.setText("");
                
                JOptionPane.showMessageDialog(rootPane, "Emprestimo alterado com Sucesso!");
            }

                //Exibe no console o Amigo cadastrado
                System.out.println(this.objetoemprestimo.listaEmprestimo().toString());
            } catch (Mensagem erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
            } catch (NumberFormatException erro2) {
                JOptionPane.showMessageDialog(null, "Informe um número válido.");
            } catch (SQLException ex) {
                Logger.getLogger(JFrameGerenciamentoEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
                try {
                // atualiza a tabela.
                carregaTabela();
            } catch (SQLException ex) {
                Logger.getLogger(JFrameGerenciamentoEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_JBAlterarActionPerformed

    private Date convertStringToDate(String dateString) throws ParseException {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = formatter.parse(dateString);
            return new java.sql.Date(date.getTime());
        }


    private void JTabelaEmprestimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabelaEmprestimosMouseClicked
        // TODO add your handling code here:
        if (this.JTabelaEmprestimos.getSelectedRow() != -1) {
        String idEmprestimo = this.JTabelaEmprestimos.getValueAt(this.JTabelaEmprestimos.getSelectedRow(), 1).toString();
        String idFerramenta = this.JTabelaEmprestimos.getValueAt(this.JTabelaEmprestimos.getSelectedRow(), 2).toString();
        String idAmigo = this.JTabelaEmprestimos.getValueAt(this.JTabelaEmprestimos.getSelectedRow(), 3).toString();
        String dataEmprestimo = this.JTabelaEmprestimos.getValueAt(this.JTabelaEmprestimos.getSelectedRow(), 5).toString();
        String dataDevolucao = this.JTabelaEmprestimos.getValueAt(this.JTabelaEmprestimos.getSelectedRow(), 4).toString();
        
        
        
        this.JTFEmprestimo.setText(idEmprestimo);
        this.JTFFerramenta.setText(idFerramenta);
        this.JTFAmigo.setText(idAmigo);
        this.JTFDataEmprestimo.setText(dataEmprestimo);
        this.JTFDataDevolucao.setText(dataDevolucao);
        
        }
    }//GEN-LAST:event_JTabelaEmprestimosMouseClicked

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
    public void carregaTabela() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) this.JTabelaEmprestimos.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
        //Carrega a lista de objetos aluno
        ArrayList<Emprestimo> Emprestimos = objetoemprestimo.listaEmprestimo();
        for (Emprestimo a : Emprestimos) {
          modelo.addRow(new Object[]{
                  a.getIdEmprestimo(),
                  a.getIdFerramenta(),
                  a.getIdAmigo(),
                  a.getDataDevolucao(),
                  a.getDataEmprestimo(),
          });
        }
    }
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
            java.util.logging.Logger.getLogger(JFrameGerenciamentoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGerenciamentoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameGerenciamentoEmprestimo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameGerenciamentoEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel JLAmigo;
    private javax.swing.JLabel JLFerramenta;
    private javax.swing.JTextField JTFAmigo;
    private javax.swing.JTextField JTFDataDevolucao;
    private javax.swing.JTextField JTFDataEmprestimo;
    private javax.swing.JTextField JTFEmprestimo;
    private javax.swing.JTextField JTFFerramenta;
    private javax.swing.JTable JTabelaEmprestimos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
