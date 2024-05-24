/*
 * Created by JFormDesigner on Wed May 22 20:53:28 BRT 2024
 */

package com.project.visual;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;


public class FrmCadastroAmigo extends JPanel {
    public FrmCadastroAmigo() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Joao Manuel Pires Escouto
        label1 = new JLabel();
        JTFnome = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        JTFtelefone = new JTextField();
        JBcadastrar = new JButton();
        JBcancelar = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );

        //---- label1 ----
        label1.setText("  CADASTRAR AMIGO ");
        label1.setFont(new Font("Kohinoor Devanagari", Font.BOLD, 22));

        //---- label2 ----
        label2.setText("Nome:");

        //---- label3 ----
        label3.setText("Telefone:");

        //---- JBcadastrar ----
        JBcadastrar.setText("Cadastrar");

        //---- JBcancelar ----
        JBcancelar.setText("Cancelar");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3)
                                .addComponent(JTFtelefone, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                .addComponent(JTFnome, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(JBcadastrar)
                            .addGap(54, 54, 54)
                            .addComponent(JBcancelar)))
                    .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTFnome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTFtelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(JBcadastrar)
                        .addComponent(JBcancelar))
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Joao Manuel Pires Escouto
    private JLabel label1;
    private JTextField JTFnome;
    private JLabel label2;
    private JLabel label3;
    private JTextField JTFtelefone;
    private JButton JBcadastrar;
    private JButton JBcancelar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
