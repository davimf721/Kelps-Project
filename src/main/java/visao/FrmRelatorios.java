/*
 * Created by JFormDesigner on Wed May 22 22:35:59 BRT 2024
 */

package visual;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;


public class FrmRelatorios extends JPanel {
    public FrmRelatorios() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Marlos
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
        0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
        .BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
        red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
        beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});

        //---- label1 ----
        label1.setText("RELAT\u00d3RIO");
        label1.setFont(new Font("Segoe UI Black", Font.BOLD, 30));

        //---- button1 ----
        button1.setText("Realizar Relatorio");
        button1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));

        //---- button2 ----
        button2.setText("Cancelar");
        button2.setFont(new Font("Segoe UI Black", Font.BOLD, 13));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(101, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(label1)))
                    .addGap(105, 105, 105))
                .addGroup(layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(button2)
                    .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(label1)
                    .addGap(43, 43, 43)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                    .addComponent(button2)
                    .addGap(29, 29, 29))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Marlos
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
