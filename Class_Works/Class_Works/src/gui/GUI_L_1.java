package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class GUI_L_1 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        
        JButton b = new JButton("Hellow");
        b.setBounds(130, 100, 100, 40);
        
        f.add(b);
        
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
