/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.Emprestimo;

/**
 *
 * @author joaomanuel
 */
public class JFrameCadastroEmprestimo extends javax.swing.JFrame {

    public Emprestimo objetoemprestimo;

    /**
     * Creates new form JFrameCadastroEmprestimo
     */
    public JFrameCadastroEmprestimo() {
        initComponents();
        this.objetoemprestimo = new Emprestimo();
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
        jLabel2 = new javax.swing.JLabel();
        JTFIDdoamigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFIDferramenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JBLimpar = new javax.swing.JButton();
        JBFechar = new javax.swing.JButton();
        JBAplicar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTFDataEmprestimo = new javax.swing.JTextField();
        JTFDataDevolucao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JBVoltar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        jLabel1.setText("Cadastro Emprestimo");

        jLabel2.setText("ID do Amigo:");

        jLabel3.setText("ID da Ferramenta:");

        JTFIDferramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIDferramentaActionPerformed(evt);
            }
        });

        jLabel4.setText("Data Emprestimo:");

        jLabel5.setText("Data Devolucao:");

        JBLimpar.setText("Limpar");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        JBAplicar.setText("Aplicar");
        JBAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAplicarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setText("Kelps.");

        jLabel6.setText("yyyy-mm-dd");

        jLabel8.setText("yyyy-mm-dd");

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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(103, 103, 103)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(JTFIDdoamigo)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jLabel2))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(54, 54, 54)
                                                                                .addComponent(JBAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(JTFIDferramenta)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(6, 6, 6)
                                                                                                .addComponent(jLabel6)))
                                                                                .addGap(217, 217, 217)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(JTFDataDevolucao)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addGap(6, 6, 6)
                                                                                                                .addComponent(jLabel8))
                                                                                                        .addComponent(jLabel5))
                                                                                                .addGap(0, 4, Short.MAX_VALUE)))))))
                                                .addGap(43, 43, 43))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(JBVoltar)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFIDdoamigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFIDferramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JBAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(JBVoltar))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFIDferramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIDferramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIDferramentaActionPerformed

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        // TODO add your handling code here:
        
        // Limpa o campo de texto para o ID do amigo
        JTFIDdoamigo.setText("");
        
        // Limpa o campo de texto para o ID da ferramenta
        JTFIDferramenta.setText("");
    }//GEN-LAST:event_JBLimparActionPerformed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAplicarActionPerformed
        // TODO add your handling code here:
        try {
            //Recebendo e validando dados da interface gráfica.
            int idamigo = 0; // Variável para armazenar o ID do amigo
            int idferramenta = 0; // Variável para armazenar o ID da ferramenta
            String dataemprestimo = ""; // Variável para armazenar a data de empréstimo
            String datadevolucao = ""; // Variável para armazenar a data de devolução

            System.out.println("Validando ID");
            if (this.JTFIDferramenta.getText().length() >= 1) {
                // Se o campo de ID da ferramenta tiver pelo menos um caractere
                idferramenta = Integer.parseInt(this.JTFIDferramenta.getText());
            } else {
                throw new Mensagem("Informe um ID válido.");
            }
            System.out.println("Validando ID");
            if (this.JTFIDdoamigo.getText().length() >= 1) {
                // Se o campo de ID do amigo tiver pelo menos um caractere
                idamigo = Integer.parseInt(this.JTFIDdoamigo.getText());
            } else {
                throw new Mensagem("Informe um ID válido.");
            }

            System.out.println("Validando Data Emprestimo");
            if (this.JTFDataEmprestimo.getText().length() == 10) {
                // Se o campo de data de empréstimo tiver 10 caracteres (formato dd/MM/yyyy)
                dataemprestimo = this.JTFDataEmprestimo.getText();
            } else {
                throw new Mensagem("Informe uma data valida.");
            }
            System.out.println("Validando Data Devolucao");
            if (this.JTFDataDevolucao.getText().length() == 10) {
                // Se o campo de data de devolução tiver 10 caracteres (formato dd/MM/yyyy)
                datadevolucao = this.JTFDataDevolucao.getText();
            } else {
                throw new Mensagem("Informe uma data valida.");
            }

            Date sqlDataEmprestimo = convertStringToDate(dataemprestimo);
            Date sqlDataDevolucao = convertStringToDate(datadevolucao);


            System.out.println("Chamando inserirEmprestimoDB");
            // Chama o método para inserir o empréstimo no banco de dados
            if (this.objetoemprestimo.inserirEmprestimoDB(idferramenta, idamigo, sqlDataEmprestimo, sqlDataDevolucao)) {
                // Se o empréstimo for cadastrado com sucesso, exibe uma mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Emprestimo Cadastrado com Sucesso!");
                //Limpa campos da interface
                this.JTFIDdoamigo.setText("");
                this.JTFIDferramenta.setText("");
                this.JTFDataEmprestimo.setText("");
                this.JTFDataDevolucao.setText("");

            }
        } catch (Mensagem error) {
            // Se ocorrer um erro de mensagem personalizada, exibe a mensagem de erro
            JOptionPane.showMessageDialog(null, error.getMessage());
        } catch (NumberFormatException | SQLException | ParseException erro2) {
            // Se ocorrer um erro de formato de número, SQL ou de análise, exibe uma mensagem genérica de erro
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        }

    }
    
    /**
    * Converte uma string em formato de data para o tipo Date.
    *
    * @param dateString A string representando a data no formato "yyyy-MM-dd".
    * @return Um objeto Date representando a data convertida.
    * @throws ParseException Se ocorrer um erro durante a análise da string de data.
    */
    private Date convertStringToDate(String dateString) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        // Parse a string para um objeto java.util.Date
        java.util.Date date = formatter.parse(dateString);
        // Converte o objeto java.util.Date para java.sql.Date e retorna
        return new java.sql.Date(date.getTime());
    }

    public class Mensagem extends Exception {

        public Mensagem(String message) {
            super(message);
        }

    }//GEN-LAST:event_JBAplicarActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        // TODO add your handling code here:
        
        /**
        * Cria e exibe a interface gráfica para cadastrar.
        */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrameCadastrar frame = new JFrameCadastrar();
                frame.setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAplicar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JTextField JTFDataDevolucao;
    private javax.swing.JTextField JTFDataEmprestimo;
    private javax.swing.JTextField JTFIDdoamigo;
    private javax.swing.JTextField JTFIDferramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
