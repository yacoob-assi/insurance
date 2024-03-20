/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JFrame;

/**
 *
 * @author Ammar
 */
public class Insurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   Start s=new Start();
     s.setResizable(false);
     s.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
     s.setVisible(true);
    }
    
}
