package com.project.visual;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;


public class FrmMenu extends JPanel {
    public FrmMenu() {
        initComponents();
    }

    private void JBCadastroAmigo(ActionEvent e) {
        // TODO add your code here
    }

    private void JBCadastroGeral(ActionEvent e) {
        // TODO add your code here
        

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Marlos
        JBTitulo = new JLabel();
        JBCadastroGeral = new JButton();
        JBGerenciarGeral = new JButton();
        JBRelatorio = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))
        throw new RuntimeException();}});

        //---- JBTitulo ----
        JBTitulo.setText("Kelps Ferramentas");
        JBTitulo.setFont(new Font("Segoe UI Black", Font.BOLD, 34));

        //---- JBCadastroGeral ----
        JBCadastroGeral.setText("Cadastros");
        JBCadastroGeral.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
        JBCadastroGeral.addActionListener(e -> {
			JBCadastroAmigo(e);
			JBCadastroGeral(e);
			JBCadastroGeral(e);
			JBCadastroGeral(e);
		});

        //---- JBGerenciarGeral ----
        JBGerenciarGeral.setText("Gerenciar");
        JBGerenciarGeral.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));

        //---- JBRelatorio ----
        JBRelatorio.setText("Relatorio");
        JBRelatorio.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(JBCadastroGeral, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(JBGerenciarGeral, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(JBRelatorio, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(54, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 78, Short.MAX_VALUE)
                    .addComponent(JBTitulo)
                    .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(JBTitulo)
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(JBCadastroGeral)
                        .addComponent(JBGerenciarGeral))
                    .addGap(27, 27, 27)
                    .addComponent(JBRelatorio)
                    .addGap(0, 117, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Marlos
    private JLabel JBTitulo;
    private JButton JBCadastroGeral;
    private JButton JBGerenciarGeral;
    private JButton JBRelatorio;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
