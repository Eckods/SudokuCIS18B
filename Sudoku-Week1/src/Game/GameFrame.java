/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Steve
 */
public class GameFrame extends JFrame{
    private JButton startButton;
    private JButton scoreButton;
    private JButton guideButton;
    private JButton exitButton;
    private JMenuBar menuBar;
    
    public GameFrame(String title){
        super(title);
        
        // Set layout for frame
        setLayout(new BorderLayout());
        
        // Set menu bar
        menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");       
        menuBar.add(gameMenu);
        //setJMenuBar(menuBar);
        
        // Set background image for frame (using a JLabel here)
        JLabel background = new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "TitleBackground.png")));  
        add(background);
        background.setLayout(new FlowLayout());
        
        // Create title screen label
        JLabel sudokuTitle = new JLabel();
        sudokuTitle.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Title.png")));
        sudokuTitle.setPreferredSize(new Dimension(800, 120));

        
        // Set a panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setOpaque(false);
        
        // Create start button 
        startButton = new JButton();
        startButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Start.png")));       
        startButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "StartPushed.png")));
        startButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "StartHover.png")));    
        
        startButton.setPreferredSize(new Dimension(455, 105));
        startButton.setToolTipText("Start Game");
        startButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                startButtonActionPerformed(event);
            }
        });
   
        // Remove extra space and borders outlining image
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setMargin(new Insets(20,0,0,12));
        
        // Create hi score button
        scoreButton = new JButton();
        scoreButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Score.png")));       
        scoreButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "ScorePushed.png")));
        scoreButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "ScoreHover.png")));  
        
        scoreButton.setPreferredSize(new Dimension(455, 105));
        scoreButton.setToolTipText("View Hi-Scores");
        scoreButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                scoreButtonActionPerformed(event);
            }
        });
        
        scoreButton.setBorderPainted(false);
        scoreButton.setFocusPainted(false);
        scoreButton.setContentAreaFilled(false);
        scoreButton.setMargin(new Insets(10,52,0,0));
        
        // Create how to play button
        guideButton = new JButton();
        guideButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Guide.png")));       
        guideButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "GuidePushed.png")));
        guideButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "GuideHover.png")));  
        
        guideButton.setPreferredSize(new Dimension(455, 105));
        guideButton.setToolTipText("View Guide to Sudoku");
        guideButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                guideButtonActionPerformed(event);
            }
        });
        
        guideButton.setBorderPainted(false);
        guideButton.setFocusPainted(false);
        guideButton.setContentAreaFilled(false);
        guideButton.setMargin(new Insets(9,0,0,12));
              
        // Create exit button
        exitButton = new JButton();
        exitButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Exit.png")));       
        exitButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "ExitPushed.png")));
        exitButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "ExitHover.png")));  
        
        exitButton.setPreferredSize(new Dimension(455, 105));
        exitButton.setToolTipText("Exit Game");
        exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                exitButtonActionPerformed(event);
            }
        });
        
        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setMargin(new Insets(9,52,0,0));
        
        // Add buttons to the panel
        buttonPanel.add(startButton);
        buttonPanel.add(scoreButton);
        buttonPanel.add(guideButton);
        buttonPanel.add(exitButton);
        
        // Add the button panel to initial layout
        background.add(sudokuTitle);
        background.add(buttonPanel);

    }
    
    private void startButtonActionPerformed(ActionEvent event){                                         
        System.out.println("Testing");
    }  
    
    private void scoreButtonActionPerformed(ActionEvent event){                                         
        System.out.println("Testing");
    }  
    
    private void guideButtonActionPerformed(ActionEvent event){                                         
        System.out.println("Testing");
    }  
        
    private void exitButtonActionPerformed(ActionEvent event){                                         
        super.dispose();
    }  
            
}
