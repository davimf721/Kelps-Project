

import javax.swing.SwingUtilities;
import visao.JFrameMenu;
public class Main {
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            JFrameMenu frame = new JFrameMenu();
            frame.setVisible(true);
         }
      });
   }

   }
