/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Sudoku Final Project
 * @author Steve Sanchez
 */
public class App {
    /**
     * Main method of Sudoku application
     * @param args the command line arguments
     */
    public static void main (String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame appFrame = new MainFrame("Sudoku");
                appFrame.setSize(800, 650);
                appFrame.setResizable(false);
                appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                appFrame.setVisible(true);
            }
        });    
    }
}
