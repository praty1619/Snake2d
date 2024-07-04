/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake2d;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Pratyush
 */
public class Snake2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("snake2");
        frame.setBounds(10, 10, 905, 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        
        frame.setVisible(true);
        
    }
    
}
