/*
 * Created by JFormDesigner on Wed May 22 20:53:50 BRT 2024
 */

package com.project.visual;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author lucas
 */
public class FrmCadastroEmprestimo extends JPanel {
    public FrmCadastroEmprestimo() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Joao Manuel Pires Escouto
        label1 = new JLabel();
        label2 = new JLabel();
        JTFidamigo = new JTextField();
        label3 = new JLabel();
        JTFidferramenta = new JTextField();
        label4 = new JLabel();
        JTFdatainicial = new JTextField();
        label5 = new JLabel();
        JTFdatafinal = new JTextField();
        JBcadastrar = new JButton();
        JBcancelar = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
        Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );

        //---- label1 ----
        label1.setText("CADASTRAR EMPRESTIMO");
        label1.setFont(new Font("Kohinoor Devanagari", Font.BOLD, 22));

        //---- label2 ----
        label2.setText("ID Amigo:");

        //---- label3 ----
        label3.setText("ID Ferramenta:");

        //---- label4 ----
        label4.setText("Data Inicial:");

        //---- label5 ----
        label5.setText("Data Final:");

        //---- JBcadastrar ----
        JBcadastrar.setText("Cadastrar");

        //---- JBcancelar ----
        JBcancelar.setText("Cancelar");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(JBcadastrar))
                                .addComponent(JTFdatainicial, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(JTFdatafinal)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup()
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(JBcancelar))
                                        .addComponent(label5))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(label2)
                        .addComponent(JTFidamigo, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3)
                        .addComponent(JTFidferramenta, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTFidamigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTFidferramenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(label5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFdatainicial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTFdatafinal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(JBcadastrar)
                        .addComponent(JBcancelar))
                    .addContainerGap(32, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Joao Manuel Pires Escouto
    private JLabel label1;
    private JLabel label2;
    private JTextField JTFidamigo;
    private JLabel label3;
    private JTextField JTFidferramenta;
    private JLabel label4;
    private JTextField JTFdatainicial;
    private JLabel label5;
    private JTextField JTFdatafinal;
    private JButton JBcadastrar;
    private JButton JBcancelar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
