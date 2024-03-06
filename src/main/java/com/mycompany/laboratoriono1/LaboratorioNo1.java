
package com.mycompany.laboratoriono1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LaboratorioNo1 {
     public static void main(String[] args) {
          
         SwingUtilities.invokeLater(new Runnable(){
        
            @Override
        public void run(){
            
            JFrame frame = new Gasolinera();
            frame.setSize(400, 400);
            frame.setVisible(true);
            
        }
    });
     }
}
