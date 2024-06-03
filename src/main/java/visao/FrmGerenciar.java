/*
 * Created by JFormDesigner on Wed May 22 22:31:02 BRT 2024
 */

package visual;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;


public class FrmGerenciar extends JPanel {
    public FrmGerenciar() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Marlos
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))
        throw new RuntimeException();}});

        //---- label1 ----
        label1.setText("GERENCIAMENTOS");
        label1.setFont(new Font("Segoe UI Black", Font.BOLD, 30));

        //---- button1 ----
        button1.setText("Gerenciar Amigos");
        button1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));

        //---- button2 ----
        button2.setText("Gerenciar Ferramentas");
        button2.setFont(new Font("Segoe UI Black", Font.BOLD, 13));

        //---- button3 ----
        button3.setText("Gerenciar Emprestimos");
        button3.setFont(new Font("Segoe UI Black", Font.BOLD, 13));

        //---- button4 ----
        button4.setText("Cancelar");
        button4.setFont(new Font("Segoe UI Black", Font.BOLD, 13));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(117, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(button3, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(button2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGap(115, 115, 115))))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(label1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(button4)))
                    .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(label1)
                    .addGap(33, 33, 33)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button3)
                    .addGap(18, 18, 18)
                    .addComponent(button4)
                    .addContainerGap(23, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Marlos
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
