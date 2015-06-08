/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * AboutActivity represents the new window displaying general info
 * about this project
 * @author Steve Sanchez
 */
public class AboutActivity extends JFrame{
    public boolean isOpen = true;
    private final JLabel windowBackground, infoLabel, aboutLabel;
    private final JButton closeButton;
    
    /**
     * Sets up the components for the about window
     * @param title 
     */
    public AboutActivity(String title) {
        super(title);
        // Set layout for frame 
        setLayout(new FlowLayout(0,0,0));     
        
        // Set background image for about window
        windowBackground = new JLabel();
        windowBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "InfoBackground.png")));  
        windowBackground.setPreferredSize(new Dimension(400, 250));
        windowBackground.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        // Create about window label alongside an info icon
        infoLabel = new JLabel();
        infoLabel.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Info.png")));  
        infoLabel.setPreferredSize(new Dimension(110, 220));       
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 3;
        c.insets = new Insets(0,0,0,50);
        windowBackground.add(infoLabel, c);
        
        String label = "Sudoku is a collaborative project for Java Advanced "
                + "Object Programming developed by Steve Sanchez, "
                + "Michael Preciado, and Isaiah Robinson. "
                + "<p>The program features:</p>"
                + "<p>- An intereactive interface</p>"
                + "<p>- A randomly generated Sudoku game board</p>"
                + "<p>- A database for user scores</p>"
                + "<p>- Data pulled from an external URL</p>"
                + "<p>- Etc.</p>";
        String html = "<html><body style='width: 190 px'>";
        aboutLabel = new JLabel(html + label);
        aboutLabel.setForeground(Color.white);
        aboutLabel.setPreferredSize(new Dimension(270, 220));
        aboutLabel.setFont(aboutLabel.getFont().deriveFont(13f));
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 2;
        c.insets = new Insets(20,0,0,38);
        windowBackground.add(aboutLabel, c);
        
        // Create close button
        closeButton = new JButton();
        closeButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Close.png")));       
        closeButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "ClosePushed.png")));
        closeButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "CloseHover.png")));  
        
        closeButton.setPreferredSize(new Dimension(160, 30));
        closeButton.setToolTipText("Close Window");
        closeButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                closeButtonActionPerformed(event);
            }
        });
        closeButton.setBorderPainted(false);
        closeButton.setFocusPainted(false);
        closeButton.setContentAreaFilled(false);
        c.gridx = 2;
        c.gridy = 2;
        c.gridwidth = 2;
        c.insets = new Insets(1,82,0,0);
        windowBackground.add(closeButton, c);
        
        // Add background w/ components to frame
        add(windowBackground);
    }
    
    /**
     * Returns a boolean indicating whether or not the window is open
     * @return isOpen boolean
     */
    public boolean getStatus(){
        return isOpen;
    }
    
    /**
     * Sets the open status to false and closes the window
     * @param event The user pressed the close button
     */
    public void closeButtonActionPerformed(ActionEvent event){
        isOpen = false;
        super.dispose();
    }
}
