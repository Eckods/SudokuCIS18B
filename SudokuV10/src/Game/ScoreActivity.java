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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * ScoreActivity represents the new window displaying Sudoku's score
 * table
 * @author Steve Sanchez
 */
public class ScoreActivity extends JFrame{
    public boolean isOpen = true;
    public int commitCount, hintCount = 0;
    private boolean commitSelected = false;
    private final JLabel windowBackground, scoreLabel, aliasLabel, submitButton;
    private JButton closeButton;
    private final JPanel aliasPanel, buttonPanel;
    private final JTable scoreTable;
    public static JTextField textField;
    Connection c = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    
    /**
     * Sets up the components for the score window
     * @param title The new title of the window
     * @param buttonPressed The indicator for if commit brought up the window
     */
    public ScoreActivity(String title, boolean buttonPressed, int commit, int hint){
        super(title);
        // Set layout for frame 
        setLayout(new FlowLayout(0,0,0));     
        
        // Sets the boolean to the indicator of it Commit Sudoku was pressed
        commitSelected = buttonPressed;
        commitCount = commit;
        hintCount = hint;
        
        // Set background image for score window
        windowBackground = new JLabel();
        windowBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "OtherWindowBackground.png")));  
        windowBackground.setPreferredSize(new Dimension(600, 500));
        windowBackground.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        // Create score window label
        scoreLabel = new JLabel();
        scoreLabel.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "ScoreLabel.png")));
        scoreLabel.setSize(new Dimension(600, 110));
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(0,0,10,0);
        windowBackground.add(scoreLabel, c);
        
        // Create a text field for alias input
        aliasPanel = new JPanel();
        aliasPanel.setMinimumSize(new Dimension(470, 20));
        aliasPanel.setOpaque(false);
        aliasPanel.setLayout(new FlowLayout(0,0,0));
        aliasLabel = new JLabel("Enter an alias: ");
        aliasLabel.setForeground(Color.white);
        aliasLabel.setOpaque(false);
        aliasLabel.setPreferredSize(new Dimension(90, 20));
        
        textField = new JTextField();
        textField.setEditable(commitSelected);
        textField.setPreferredSize(new Dimension(370, 20));
        
        aliasPanel.add(aliasLabel);
        aliasPanel.add(textField);
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 3;
        c.insets = new Insets(0,154,0,0);
        windowBackground.add(aliasPanel, c);
        
        // Create table for scores
        scoreTable = new JTable();
        scoreTable.setPreferredSize(new Dimension(470, 310));
        scoreTable.setMinimumSize(new Dimension(470, 310));
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight= 2;
        c.insets = new Insets(10,144,0,0);
        windowBackground.add(scoreTable, c);
        
        // Create buttons
        submitButton = new JLabel();
        createButtons();
        
        // Add the close button to submit button layout and add that to
        // the button panel
        buttonPanel = new JPanel();
        buttonPanel.setMinimumSize(new Dimension(321,30));
        buttonPanel.setLayout(new FlowLayout(0,0,0));
        buttonPanel.setOpaque(false);
        submitButton.add(closeButton);
        buttonPanel.add(submitButton);
        c.gridx = 3;
        c.gridy = 4;
        c.insets = new Insets(10,344,0,0);
        windowBackground.add(buttonPanel, c);
        
        // Add background w/ components to frame
        add(windowBackground);
    }
    
    /**
     * Creates buttons for the score window
     */
    public void createButtons(){
        // Set up the button w/ its image, size and tip information
        // (submit button made a label to group it together with the close 
        // button due to its custom shape)
        submitButton.setIcon( new ImageIcon(getClass().getResource("/Images/"
                    + "Submit.png")));
        submitButton.setPreferredSize(new Dimension(317,30));
        submitButton.setLayout(new FlowLayout(0,129,0));
        submitButton.setToolTipText("Submit Score to Database");
        
        closeButton = new JButton();
        closeButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Close.png")));       
        closeButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "ClosePushed.png")));   
        closeButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "CloseHover.png")));   
        closeButton.setPreferredSize(new Dimension(160, 30));
        closeButton.setToolTipText("Close Window");
        closeButton.setBorderPainted(false);
        closeButton.setFocusPainted(false);
        closeButton.setContentAreaFilled(false);
        
        // Establish listeners for each button 
        submitButton.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                ImageIcon image = new ImageIcon(getClass().getResource("/Images/"
                    + "SubmitHover.png"));
                submitButton.setIcon(image);
            }

            @Override
            public void mousePressed(MouseEvent me) {
                ImageIcon image = new ImageIcon(getClass().getResource("/Images/"
                    + "SubmitPushed.png"));
                submitButton.setIcon(image);
                submitButtonActionPerformed();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                ImageIcon image = new ImageIcon(getClass().getResource("/Images/"
                    + "SubmitHover.png"));
                submitButton.setIcon(image);
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                ImageIcon image = new ImageIcon(getClass().getResource("/Images/"
                    + "SubmitHover.png"));
                submitButton.setIcon(image);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                ImageIcon image = new ImageIcon(getClass().getResource("/Images/"
                    + "Submit.png"));
                submitButton.setIcon(image);
            }
        });
        
        closeButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                closeButtonActionPerformed(event);
            }
        });   
        submitButton.setDisabledIcon(new ImageIcon(getClass().getResource("/Images/"
                    + "SubmitHover.png")));
        submitButton.setEnabled(commitSelected);
    }
      
    /**
     * Returns a boolean indicating whether or not the window is open
     * @return isOpen boolean
     */
    public boolean getStatus(){
        return isOpen;
    }
    
    /**
     * 
     */
    public void submitButtonActionPerformed(){
             try {
             //Register JDBC Driver. 
                Class.forName("org.sqlite.JDBC");
                
                //Opening the connection. 
                System.out.println("Connecting to database...");
                //Pc users change the connection and use \\.
                c = DriverManager.getConnection("jdbc:sqlite:/Users/iAmZay/SudokuCIS18B/SudokuV10/Sudoku.sqlite");
                
                //Inserting data into the database.
                String sql = "Insert into Sudoku (UserName, uAttempt, uHint) values (?, ?, ?)";
                pst = c.prepareStatement(sql);
                pst.setString(1, textField.getText()); // placing the user input into UserName.
                pst.setInt(2, 0); //
                pst.setInt(3, 0);
                
                
                pst.execute();
            
            } catch (Exception se) {
                se.printStackTrace();
            } finally {
                try{
                    if(pst!=null)
                        pst.close();
                } catch(SQLException se2) {
                    
                } //do nothing.
                try{
                    if(c!=null)
                        c.close();
                } catch(SQLException se){
               }
            } System.out.println("Added User Successfully!");
            
           
    }
    
    /**
     * Sets the open status to false and closes the window
     * @param event The user pressed the close button
     */
    public void closeButtonActionPerformed(ActionEvent event){
        //Updating the Users Hints and Commits.
                try {
            //Assigning the userName to the user input.
            String userName = textField.getText();
            //int clicks = 0;
            //int commitCount =0;
            
            Class.forName("org.sqlite.JDBC");
            System.out.println("Connecting to database...");
            c = DriverManager.getConnection("jdbc:sqlite:/Users/iAmZay/SudokuCIS18B/SudokuV10/Sudoku.sqlite"); // Change for OPC
          
            // First lets get the last attempt
            //stmt = c.createStatement();
            String sql = "SELECT uAttempt FROM Sudoku where UserName = ?";
            pst2 = c.prepareStatement(sql);
            pst2.setString(1, userName);
            ResultSet rs = pst2.executeQuery();
            //STEP 5: Extract data from result set
            if(rs.next()){
               //Retrieve by column name
               commitCount  = rs.getInt("uAttempt");
            } else {
               // user does not exist.  Call the add user function
            }
            commitCount++;
          
            // Now lets update the user attempts
            sql = "Update Sudoku SET uAttempt = ? where UserName = ?";
            pst2 = c.prepareStatement(sql);
            pst2.setInt(1, commitCount);
            pst2.setString(2, userName);
            pst2.executeUpdate();
            System.out.println("Successfull Update");
            rs.close();
        } catch(Exception se){
           se.printStackTrace(); // Dont forget to print out the exceptions to see what problems your code could have
        }  finally {
           try{
                    if(pst2!=null)
                        pst2.close();
                } catch(SQLException se2) {
                    
                } //do nothing.
                try{
                    if(c!=null)
                        c.close();
                } catch(SQLException se){
               }
              } 
        
        if (commitSelected == false){
            // Do nothing
        }
        else
            System.out.println("Submit button was pushed"); 
        
        isOpen = false;
        super.dispose();
    }
}
