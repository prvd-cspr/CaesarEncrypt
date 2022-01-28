/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Xiaomi
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Caesar Crypt");
        jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width - 50, 
                Toolkit.getDefaultToolkit().getScreenSize().height - 50);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(new NewJPanel());
        jFrame.setVisible(true);
    }
    
}
