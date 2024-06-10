
package visao;

import javax.swing.SwingUtilities;

/**
 *
 * @author marlos
 */
public class JFrameCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCadastrar
     */
    public JFrameCadastrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JBCadastrarAmigo = new javax.swing.JButton();
        JBCadastroFerramenta = new javax.swing.JButton();
        JBCadastroEmprestimo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar");

        JBCadastrarAmigo.setText("Cadastrar Amigo");
        JBCadastrarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarAmigoActionPerformed(evt);
            }
        });

        JBCadastroFerramenta.setText("Cadastrar Ferramenta");
        JBCadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroFerramentaActionPerformed(evt);
            }
        });

        JBCadastroEmprestimo.setText("Cadastrar Emprestimo");
        JBCadastroEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroEmprestimoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Kelps.");

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
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBCadastroFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBCadastroEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBCadastrarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel1)))
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(JBCadastrarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBCadastroFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBCadastroEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(JBVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCadastrarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarAmigoActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(new Runnable() {
            
            /**
             * Inicia a interface gráfica para o cadastro de um amigo.
             * Isso cria uma instância de JFrameCadastroAmigo e torna a janela visível.
             */
         public void run() {
             // Cria uma instância da janela de cadastro de amigo
            JFrameCadastroAmigo frame = new JFrameCadastroAmigo();
            // Torna a janela de cadastro de amigo visível para o usuário
            frame.setVisible(true);
            
         }
      });
        
        this.dispose();
            
    }//GEN-LAST:event_JBCadastrarAmigoActionPerformed

    private void JBCadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroFerramentaActionPerformed
        // TODO add your handling code here:
        
        /**
        * Invoca uma nova thread para executar a interface gráfica para o cadastro de uma ferramenta.
        * Isso é feito dentro de uma instância de Runnable para garantir que a operação seja realizada na thread de despacho de eventos do Swing.
        * Isso evita problemas de concorrência e bloqueios na interface do usuário.
        */
        SwingUtilities.invokeLater(new Runnable() {
            
            /**
            * O método run() é implementado aqui para criar e tornar visível a janela de cadastro de ferramentas.
            * Isso é executado na thread de despacho de eventos do Swing.
            */
         public void run() {
             // Cria uma instância da janela de cadastro de ferramenta
            JFrameCadastroFerramenta frame = new JFrameCadastroFerramenta();
            
            // Torna a janela de cadastro de ferramenta visível para o usuário
            frame.setVisible(true);
            
         }
      });
        this.dispose();
    }//GEN-LAST:event_JBCadastroFerramentaActionPerformed

    private void JBCadastroEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroEmprestimoActionPerformed
        // TODO add your handling code here:
        
        /**
        * Invoca uma nova thread para executar a interface gráfica do menu.
        * Isso é feito dentro de uma instância de Runnable para garantir que a operação seja realizada na thread de despacho de eventos do Swing.
        * Isso evita problemas de concorrência e bloqueios na interface do usuário.
        */
        SwingUtilities.invokeLater(new Runnable() {   
            
            /**
            * O método run() é implementado aqui para criar e tornar visível a janela do menu.
            * Isso é executado na thread de despacho de eventos do Swing.
            */
         public void run() {
            // Cria uma instância da janela de cadastro de ferramenta
            JFrameCadastroEmprestimo frame = new JFrameCadastroEmprestimo();
            // Torna a janela de cadastro de ferramenta visível para o usuário
            frame.setVisible(true);
            
         }
      });
        this.dispose();
    }//GEN-LAST:event_JBCadastroEmprestimoActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        // TODO add your handling code here:
        
        /**
        * Invoca uma nova thread para executar a interface gráfica do menu.
        * Isso é feito dentro de uma instância de Runnable para garantir que a operação seja realizada na thread de despacho de eventos do Swing.
        * Isso evita problemas de concorrência e bloqueios na interface do usuário.
        */
        SwingUtilities.invokeLater(new Runnable() {
            /**
            * O método run() é implementado aqui para criar e tornar visível a janela do menu.
            * Isso é executado na thread de despacho de eventos do Swing.
            */
         public void run() {
             // Cria uma instância da janela do menu
            JFrameMenu frame = new JFrameMenu();
            
            // Torna a janela do menu visível para o usuário
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
            java.util.logging.Logger.getLogger(JFrameCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrarAmigo;
    private javax.swing.JButton JBCadastroEmprestimo;
    private javax.swing.JButton JBCadastroFerramenta;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
