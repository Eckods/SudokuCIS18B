/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * ScoreActivity represents the new window displaying Sudoku's score
 * table
 * @author Steve Sanchez, Isaiah Robinson
 */
public class ScoreActivity extends JFrame{
    private DefaultTableModel model;
    private final Object colData[] = {"Alias","Attempts","Hints Given","Time","Difficulty"};
    private final String difficulty, totalTime;
    private boolean isOpen = true;
    private int commitCount, hintCount;
    private final boolean commitSelected;
    private final JLabel windowBackground, scoreLabel, aliasLabel, submitButton;
    private JButton closeButton;
    private final JPanel aliasPanel, buttonPanel;
    private final JScrollPane scrollPane;
    private final JTable scoreTable;
    private static JTextField textField;
    private Connection c;
    private Statement stmt;
    private PreparedStatement pst;
    
    /**
     * Sets up the components for the score window
     * @param title The new title of the window
     * @param buttonPressed The indicator for if commit brought up the window
     * @param commit The number of submits/tries the user entered before being correct
     * @param hint The number of hints the user retrieved while completing puzzle
     * @param level The level of difficulty the user completed the puzzle on
     * @param time The amount of time it took to complete the sudoku puzzle
     */
    public ScoreActivity(String title, boolean buttonPressed, int commit, int hint, int level, String time){
        super(title);
        // Set layout for frame 
        setLayout(new FlowLayout(0,0,0));     
        
        // Sets the boolean to the indicator of it Commit Sudoku was pressed
        // and initialize variables being passed to database
        c = null;
        stmt = null;
        pst = null;
        commitSelected = buttonPressed;
        commitCount = commit;
        hintCount = hint;
        totalTime = time;
        if (level == 48){
            difficulty = "Easy";
        }
        else if (level == 40){
            difficulty = "Medium";
        }
        else{
            difficulty = "Hard";
        }
        
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
        //scoreTable.setPreferredSize(new Dimension(470, 310));
        scoreTable.setMinimumSize(new Dimension(470, 310));
        fillTable();
        scoreTable.setFont(new Font("Serif", Font.PLAIN, 16));
        scoreTable.setForeground(Color.black);
        scoreTable.setRowHeight(24); 
        scoreTable.setVisible(true);
        scoreTable.convertRowIndexToView(0);
        scoreTable.setModel(model);
        scoreTable.getColumnModel().getColumn(0).setPreferredWidth(207);
        scoreTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        scrollPane = new JScrollPane(scoreTable);
        scrollPane.setMinimumSize(new Dimension(470, 310));
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 3;
        c.gridheight= 2;
        c.insets = new Insets(10,144,0,0);
        windowBackground.add(scrollPane, c);
        
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
     * Submit username, commitCount, hintCount, and time to a database of scores
     */
    public void submitButtonActionPerformed(){
        try {
        //Register JDBC Driver. 
            Class.forName("org.sqlite.JDBC");

            //Opening the connection. 
            System.out.println("Connecting to database...");
            //Pc users change the connection and use \\.
            c = DriverManager.getConnection("jdbc:sqlite:Sudoku.sqlite");

            //Inserting data into the database.
            String sql = "Insert into Sudoku (UserName, uAttempt, uHint, uTime, uDifficulty) values (?, ?, ?, ?, ?)";
            pst = c.prepareStatement(sql);
            pst.setString(1, textField.getText()); // placing the user input into UserName.
            pst.setInt(2, commitCount); //
            pst.setInt(3, hintCount);
            pst.setString(4, totalTime);
            pst.setString(5, difficulty);

            pst.execute();
        } catch (Exception se) {
            try{
                String userName = textField.getText();      
                String sql = "Replace into Sudoku (UserName, uAttempt, uHint, uTime, uDifficulty) values (?, ?, ?, ?, ?)";
                pst = c.prepareStatement(sql);
                pst.setString(1, userName);
                pst.setInt(2, commitCount);
                pst.setInt(3, hintCount);
                pst.setString(4, totalTime);
                pst.setString(5, difficulty);  
                pst.executeUpdate();
                System.out.println("Successfully Replaced");
            }catch(SQLException se2) {
                System.out.println("error....");//do nothing.
            }
        } finally {
            try{
                if(pst!=null)
                    pst.close();
            }catch(SQLException se2) {
                //do nothing.
            }
            try{
                if(c!=null)
                    c.close();
            } catch(SQLException se){
                //do nothing.
            }
        } System.out.println("Added User Successfully!");  
        submitButton.setEnabled(false);
    }
    
    private void fillTable(){
        //Query for Retrieving Data. Add this where we will be printing the users information.
        try{
            model = new DefaultTableModel();
            for (int j = 0; j < colData.length; j++){
                model.addColumn(colData[j]);
            }
            int i = 0;
            Class.forName("org.sqlite.JDBC");
            System.out.println("Connecting to database...");
            c = DriverManager.getConnection("jdbc:sqlite:Sudoku.sqlite"); // Change for OPC
          
            // First lets select all Data.
            stmt = c.createStatement();
            String sql = "SELECT `_rowid_`,* FROM `Sudoku`  ORDER BY `uHint` ASC LIMIT 0, 15;";
            pst = c.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while(rst.next()){
                String userName = rst.getString("UserName");
                int userCommit = rst.getInt("uAttempt");
                int userHint = rst.getInt("uHint");
                String userTime = rst.getString("uTime");
                String userDiff = rst.getString("uDifficulty");
                model.addRow(new Object[]{userName, userCommit, userHint, userTime, userDiff});
            }
            model.fireTableDataChanged();
            rst.close();
            stmt.close();
        }catch(Exception se){
            se.printStackTrace(); // Dont forget to print out the exceptions to see what problems your code could have
        } finally {
            try{
                if(pst!=null)
                    pst.close();
            } catch(SQLException se2) {
                //do nothing.
            } 
            try{
                if(c!=null)
                    c.close();
            } catch(SQLException se){
                //do nothing.
            }
        } 
    }
    
    /**
     * Sets the open status to false and closes the window
     * @param event The user pressed the close button
     */
    public void closeButtonActionPerformed(ActionEvent event){
        if (commitSelected == false){
            // Do nothing
        }
        else{
            //Updating the Users Hints and Commits.
            try {
                //Assigning the userName to the user input.
                String userName = textField.getText();      
                Class.forName("org.sqlite.JDBC");
                System.out.println("Connecting to database...");
                c = DriverManager.getConnection("jdbc:sqlite:Sudoku.sqlite"); // Change for OPC;

                // First lets get the last attempt
                String sql = "SELECT uAttempt FROM Sudoku where UserName = ?";
                pst = c.prepareStatement(sql);
                pst.setString(1, userName);
                ResultSet rs = pst.executeQuery();
                //STEP 5: Extract data from result set
                if(rs.next()){
                   //Retrieve by column name
                   commitCount  = rs.getInt("uAttempt");
                } else {
                   // user does not exist.  Call the add user function
                }

                // Now lets update the user attempts
                sql = "UPDATE Sudoku SET uAttempt = ?,  uHint = ?, uTime = ?, uDifficulty = ? WHERE UserName = ?";
                pst = c.prepareStatement(sql);
                pst.setInt(2, commitCount);
                pst.setInt(3, hintCount);
                pst.setString(4, totalTime);
                pst.setString(5, difficulty);  
                pst.setString(1, userName);
                pst.executeUpdate();
                System.out.println("Successfully Updated");
                rs.close();
            } catch(Exception se){
                se.printStackTrace(); // Dont forget to print out the exceptions to see what problems your code could have
            } finally {
                try{
                    if(pst!=null)
                        pst.close();
                } catch(SQLException se2) {
                    // do nothing
                }
                try{
                    if(c!=null)
                        c.close();
                } catch(SQLException se){
                    // do nothing
                }
            } 
        } 
        isOpen = false;
        super.dispose();
    }
}
