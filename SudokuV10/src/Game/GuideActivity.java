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
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * GuideActivity represents the new window displaying Sudoku's rules
 * read in from an external source (URL)
 * @author Steve Sanchez
 */
public class GuideActivity extends JFrame{
    public boolean isOpen = true;
    private final JLabel windowBackground, guideLabel;
    private final JEditorPane editorPane;
    private final JScrollPane editorScrollPane;
    private final JButton closeButton;
    
   
    /**
     * Sets up the components for the guide window
     * @param title 
     */
    public GuideActivity(String title) {//throws MalformedURLException{
        super(title);
        // Set layout for frame 
        setLayout(new FlowLayout(0,0,0));     
        
        // Set background image for guide window
        windowBackground = new JLabel();
        windowBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "WindowBackground.png")));  
        windowBackground.setPreferredSize(new Dimension(600, 500));
        windowBackground.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        // Create guide window label
        guideLabel = new JLabel();
        guideLabel.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "GuideLabel.png")));
        guideLabel.setSize(new Dimension(600, 110));
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(0,0,10,0);
        windowBackground.add(guideLabel, c);
        
        // Create editor pane
        editorPane = new JEditorPane();
        editorScrollPane = new JScrollPane(editorPane);
        editorPane.setForeground(Color.white);
        editorPane.setBackground(new Color(79, 14, 8));
        editorScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        editorScrollPane.setPreferredSize(new Dimension(470, 340));
        editorScrollPane.setMinimumSize(new Dimension(470, 340));  
        
       
        editorPane.setEditable(false);
          try {
            Document doc = Jsoup.connect("http://www.conceptispuzzles.com/?uri=puzzle/sudoku/rules").get();
            org.jsoup.select.Elements paragraph = doc.select("p");
            for(Element p: paragraph){
                System.out.println(p.text());
            }
        } catch (IOException ex) {
            Logger.getLogger(GuideActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //editorPane.setPage();
        editorScrollPane.setBorder(BorderFactory.createEmptyBorder());
        editorScrollPane.setBackground(new Color(79,14,8));
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 3;
        c.gridheight= 2;
        c.insets = new Insets(10,142,0,0);
        windowBackground.add(editorScrollPane, c);
        
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
        c.gridx = 3;
        c.gridy = 3;
        c.insets = new Insets(0,442,0,0);
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
