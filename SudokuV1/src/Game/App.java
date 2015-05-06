/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Steve
 */
public class App {
    
    public static void main (String[] args){
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame appFrame = new GameFrame("Sudoku");
                appFrame.setSize(800, 628);
                appFrame.setResizable(false);
                appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                appFrame.setVisible(true);
            }
        });
    }
}
