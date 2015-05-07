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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Steve Sanchez
 */
public class GuideActivity extends JFrame{
    public boolean isOpen = true;
    
    public GuideActivity(String title){
        super(title);
        // Set layout for frame 
        setLayout(new FlowLayout(0,0,0));     
        
        // Set background image for guide window
        JLabel windowBackground = new JLabel();
        windowBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "WindowBackground.png")));  
        windowBackground.setPreferredSize(new Dimension(600, 500));
        windowBackground.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        // Create guide window label
        JLabel guideLabel = new JLabel();
        guideLabel.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "GuideLabel.png")));
        guideLabel.setSize(new Dimension(600, 110));
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(0,0,10,0);
        windowBackground.add(guideLabel, c);
        
        // Create editor pane
        JEditorPane editorPane = new JEditorPane();
        JScrollPane editorScrollPane = new JScrollPane(editorPane);
        editorPane.setForeground(Color.white);
        editorPane.setBackground(new Color(79, 14, 8));
        editorScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        editorScrollPane.setPreferredSize(new Dimension(470, 340));
        editorScrollPane.setMinimumSize(new Dimension(470, 340));
        
        //editorPane.setText(title);

        editorScrollPane.setBorder(BorderFactory.createEmptyBorder());
        editorScrollPane.setBackground(new Color(79,14,8));
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 3;
        c.gridheight= 2;
        c.insets = new Insets(10,142,0,0);
        windowBackground.add(editorScrollPane, c);
        
        // Create close button
        JButton closeButton = new JButton();
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
        c.gridx = 3;
        c.gridy = 3;
        c.insets = new Insets(0,442,0,0);
        windowBackground.add(closeButton, c);
        
        // Add background w/ components to frame
        add(windowBackground);
    }
    
    public boolean getStatus(){
        return isOpen;
    }
    
    public void closeButtonActionPerformed(ActionEvent event){
        isOpen = false;
        super.dispose();
    }
}
