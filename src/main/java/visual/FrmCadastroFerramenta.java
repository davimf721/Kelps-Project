/*
 * Created by JFormDesigner on Wed May 22 20:54:06 BRT 2024
 */

package visual;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author lucas
 */
public class FrmCadastroFerramenta extends JPanel {
    public FrmCadastroFerramenta() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Marlos
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        JTFNome = new JTextField();
        JTFMarca = new JTextField();
        JTFCusto = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );

        //---- label1 ----
        label1.setText("CADASTRO FERRAMENTA");
        label1.setFont(new Font("Segoe UI Black", Font.BOLD, 26));

        //---- label2 ----
        label2.setText("Nome:");
        label2.setFont(new Font("Segoe UI Black", Font.BOLD, 16));

        //---- label3 ----
        label3.setText("Marca:");
        label3.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));

        //---- label4 ----
        label4.setText("Custo:");
        label4.setFont(new Font("Segoe UI Black", Font.BOLD, 16));

        //---- button1 ----
        button1.setText("Cadastrar");
        button1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));

        //---- button2 ----
        button2.setText("Cancelar");
        button2.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label4)
                            .addContainerGap(364, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label3))
                            .addGap(0, 360, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 24, Short.MAX_VALUE)
                                    .addComponent(label1))
                                .addComponent(JTFNome, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addComponent(JTFMarca, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
                                .addComponent(JTFCusto, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                            .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTFNome, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTFMarca, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label4)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTFCusto, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2)
                        .addComponent(button1))
                    .addContainerGap(25, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Marlos
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField JTFNome;
    private JTextField JTFMarca;
    private JTextField JTFCusto;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
