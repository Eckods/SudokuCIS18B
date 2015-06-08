/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * MainFrame represents the main window for the Sudoku application
 * @author Steve Sanchez
 */
public class MainFrame extends JFrame {
    private int hintAvailable = 1;
    public int hintCount, commitCount = 0;
    private final JLabel mainBackground, gameBackground, gridBackground, 
            sudokuTitle, options;
    private MyTableModel model;
    private JTable table;
    private JMenuBar menuBar;
    private JMenu gameMenu, aboutMenu;
    private JMenuItem backItem, exitItem, aboutItem;
    private ScoreActivity scoreFrame;
    private GuideActivity guideFrame;
    private AboutActivity aboutFrame;
    private final CardLayout cardLayout;
    int sudokuCompletePuzzle [][] = new int [9][9];
    private final JPanel stackedWindows, mainButtonPanel, gameButtonPanel, 
            gridPanel;
    private boolean scoreFrameOpen, guideFrameOpen, aboutFrameOpen, commitSelected = false;
    private final String sudokuForbidden[][] = new String[9][9];
    private final Object rowData[][] = new Object[9][9];
    private final Object colData[] = {"1","2","3","4","5","6","7","8","9"};
    private final JButton mainButton[] = new JButton[4];
    String mainButtonImages[] = {"Start", "Score", "Guide", "Exit"};
    String mainButtonTips[] = {"Start Game", "View Hi-Scores", 
        "View Guide to Sudoku", "Exit Game"};
    private final JButton otherButton[] = new JButton[6];
    String otherButtonImages[] = {"NewGame", "Restart", "Hint", "Solution", 
        "Commit", "OtherExit"};
    String otherButtonTips[] = {"Generate New Puzzle", "Restart Puzzle", 
        "Get Hint For A #", "Display Solution", "Submit Answer", "Exit Game"};
    Connection c = null;
    PreparedStatement pst3 = null;
    Statement stmt = null;
    ResultSet rst = null; 
    
    /**
     * Sets up the main window's components, visuals, and functionality
     * @param title The application title
     */
    public MainFrame(String title){
        super(title);
        
        // Set layout for frame 
        setLayout(new FlowLayout(0,0,0));
        
        // Initialize cardLayout for switching between main and game screens
        cardLayout = new CardLayout();
        stackedWindows = new JPanel(cardLayout);
        
        // Create menu bar 
        createMenuBar();
                
        // Set background image for main window and game window
        mainBackground = new JLabel();
        mainBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "TitleBackground.png")));  
        mainBackground.setLayout(new FlowLayout());
        
        gameBackground = new JLabel();
        gameBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "OtherBackground.png")));
        gameBackground.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
               
        // Create labels for main window and game window
        sudokuTitle = new JLabel();
        sudokuTitle.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Title.png")));
        sudokuTitle.setPreferredSize(new Dimension(800, 120));

        options = new JLabel();
        options.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Options.png")));
        options.setPreferredSize(new Dimension(200, 120));
        
        // Create panels to hold main window and game window buttons
        mainButtonPanel = new JPanel();
        mainButtonPanel.setLayout(new BoxLayout(mainButtonPanel, BoxLayout.Y_AXIS));
        mainButtonPanel.setOpaque(false);
        
        gameButtonPanel = new JPanel();
        gameButtonPanel.setLayout(new BoxLayout(gameButtonPanel, BoxLayout.Y_AXIS));
        gameButtonPanel.setOpaque(false);
        gameButtonPanel.setPreferredSize(new Dimension(200, 600));
        
        // Create main window and game window buttons
        createMainWindowButtons();
        createGameWindowButtons();
        
        // Create sudoku game grid and set its place on gridlayout
        createGrid();
        gridPanel = new JPanel();
        gridPanel.setLayout(new BoxLayout(gridPanel, BoxLayout.Y_AXIS));
        gridBackground = new JLabel();
        gridBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Grid.png")));  
        gridBackground.setLayout(new BorderLayout());
        gridBackground.add(table);
        gridPanel.add(gridBackground);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 2;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(0,25,0,0);
        gameBackground.add(gridPanel, constraints);
        
        // Add buttons to panel for main window
        for (int i =0; i < mainButton.length; i++){
            mainButtonPanel.add(mainButton[i]);
        }
        
        // Add buttons to panel for game window and set its place on gridlayout
        gameButtonPanel.add(options);
        for (int i =0; i < otherButton.length; i++){
            gameButtonPanel.add(otherButton[i]);
        }
        
        gameButtonPanel.add(Box.createRigidArea(new Dimension(0,204)));
    
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.insets = new Insets(0,25,0,0);
        gameBackground.add(gameButtonPanel, constraints);
        
        // Add the button panel to main window layout
        mainBackground.add(sudokuTitle);
        mainBackground.add(mainButtonPanel);
        
        // Add the main window layout and game window layout to card layout
        stackedWindows.add(mainBackground);
        stackedWindows.add(gameBackground);
        add(stackedWindows);
    }
    
    /**
     * Creates the menu bar for the main window
     */
    private void createMenuBar(){
        // Creates menu bar
        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(40,7,2));
        menuBar.setBorderPainted(false);
        
        // Creates categories in menu
        gameMenu = new JMenu("Game");
        gameMenu.setForeground(new Color(119,72,68));
        gameMenu.setBorderPainted(false);
        aboutMenu = new JMenu("About");
        aboutMenu.setForeground(new Color(119,72,68));
        aboutMenu.setBorderPainted(false);
        
        // Creates items for the menu categories
        backItem = new JMenuItem("Back to Title");
        backItem.setBorderPainted(false);
        backItem.setForeground(new Color(119,72,68));
        backItem.setBackground(new Color(40,7,2));
        backItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                backItemActionPerformed(event);
            }
        });
        exitItem = new JMenuItem("Exit");
        exitItem.setBorderPainted(false);
        exitItem.setForeground(new Color(119,72,68));
        exitItem.setBackground(new Color(40,7,2));
        exitItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                exitButtonActionPerformed(event);
            }
        });
        aboutItem = new JMenuItem("About Sudoku");
        aboutItem.setBorderPainted(false);
        aboutItem.setForeground(new Color(119,72,68));
        aboutItem.setBackground(new Color(40,7,2));
        aboutItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                aboutItemActionPerformed(event);
            }
        });

        // Sets up the menu bar
        gameMenu.add(backItem);
        gameMenu.add(exitItem);
        aboutMenu.add(aboutItem);
        menuBar.add(gameMenu);
        menuBar.add(aboutMenu);
        setJMenuBar(menuBar);
    }
    
    /**
     * Creates the table used as the game board
     */
    private void createGrid(){
        // Set the rowData for the game
        generateGameBoard();
        
        // Create the table for the game
        table = new JTable();
        model = new MyTableModel(rowData, colData, sudokuForbidden);
        table.setModel(model);
        //table.setDefaultEditor(Integer.class, new IntegerEditor(1, 9));
        table.addKeyListener(null);
        table.setRowSelectionAllowed(false);
        table.setPreferredSize(new Dimension(550, 550));
        table.setFont(new Font("Serif", Font.PLAIN, 18));
        table.setForeground(Color.white);
        table.setRowHeight(61); 
        table.setShowGrid(false);
        table.setVisible(true); 
        table.setOpaque(false);
        table.setBackground(new Color(0,0,0,0));
    }
    
    /**
     * Generates the numbers for the Sudoku game board
     */
    public void generateGameBoard(){
        SudokuCode puzzleGenerator = new SudokuCode();
        sudokuCompletePuzzle = puzzleGenerator.sudoku(sudokuCompletePuzzle);
        int sudokuUserPuzzle [][] = new int [9][9];
        int rNumber ;
        String dataNum = "";
        
        //test making random board template
        for(int row = 0; row < 9; row++){
            for(int column = 0; column <9; column++){
                   rNumber = (int)(2*Math.random());
                   sudokuUserPuzzle[row][column] = rNumber;
                   // Initialize forbidden cell 
                   sudokuForbidden[row][column] = "EditableValueHere";
            }
        }

        //test combining template and completed sudoku board to make users view of game
        for(int row = 0; row < 9; row++){
            for(int column = 0; column <9; column++){
                if(sudokuUserPuzzle[row][column]!= 0){
                    sudokuUserPuzzle[row][column] = sudokuCompletePuzzle[row][column];
                    dataNum = "" + sudokuUserPuzzle[row][column];
                    // If its a given number, its now a forbidden cell
                    sudokuForbidden[row][column] = dataNum;
                    rowData[row][column] = dataNum;
                }else{
                    sudokuUserPuzzle[row][column] = 0;
                    rowData[row][column] = ""; 
                }
            }
        }
    }

    /**
     * Creates the buttons used by the main window
     */
    private void createMainWindowButtons(){
        for(int i = 0; i < mainButton.length; i++){
            // Set up the button w/ its image, size and tip information
            mainButton[i] = new JButton();
            mainButton[i].setIcon(new ImageIcon(getClass().getResource("/Images/"
                    + mainButtonImages[i] + ".png")));       
            mainButton[i].setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                    + mainButtonImages[i] + "Pushed.png")));
            mainButton[i].setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                    + mainButtonImages[i] + "Hover.png")));
            mainButton[i].setPreferredSize(new Dimension(455, 105));
            mainButton[i].setToolTipText(mainButtonTips[i]);
            
            // Remove extra space and borders outlining image
            mainButton[i].setBorderPainted(false);
            mainButton[i].setFocusPainted(false);
            mainButton[i].setContentAreaFilled(false);  
        }
        
        // Establish listeners for each button and set margins as needed
        // for intended position on screen
        mainButton[0].setMargin(new Insets(20,0,0,12));
        mainButton[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                startButtonActionPerformed(event);
            }
        });
        
        mainButton[1].setMargin(new Insets(10,52,0,0));
        mainButton[1].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                scoreButtonActionPerformed(event);
            }
        });
        
        mainButton[2].setMargin(new Insets(9,0,0,12));
        mainButton[2].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                guideButtonActionPerformed(event);
            }
        });

        mainButton[3].setMargin(new Insets(9,52,0,0));
        mainButton[3].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                exitButtonActionPerformed(event);
            }
        });
    }
    
    /**
     * Creates the buttons used by the game window
     */
    private void createGameWindowButtons(){
        for(int i = 0; i < otherButton.length; i++){
            // Set up the button w/ its image, size and tip information
            otherButton[i] = new JButton();
            otherButton[i].setIcon(new ImageIcon(getClass().getResource("/Images/"
                    + otherButtonImages[i] + ".png")));       
            otherButton[i].setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                    + otherButtonImages[i] + "Pushed.png")));
            otherButton[i].setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                    + otherButtonImages[i] + "Hover.png")));
            otherButton[i].setDisabledIcon(new ImageIcon(getClass().getResource("/Images/"
                    + otherButtonImages[i] + "Hover.png")));
            otherButton[i].setPreferredSize(new Dimension(250, 45));
            otherButton[i].setToolTipText(otherButtonTips[i]);

            // Remove extra space and borders outlining image
            otherButton[i].setBorderPainted(false);
            otherButton[i].setFocusPainted(false);
            otherButton[i].setContentAreaFilled(false);  
        }
        // Establish listeners for each button
        otherButton[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                newGameButtonActionPerformed(event);
            }
        });

        otherButton[1].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                restartButtonActionPerformed(event);
            }
        });
        
        otherButton[2].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                hintButtonActionPerformed(event);
            }
        });
        
        otherButton[3].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                solutionButtonActionPerformed(event);
            }
        });
        
        otherButton[4].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                commitButtonActionPerformed(event);
            }
        });
        
        otherButton[5].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                exitButtonActionPerformed(event);
            }
        });    
    }
        
    /**
     * Switches to the game window
     * @param event The user pressed the start button
     */
    private void startButtonActionPerformed(ActionEvent event){                                         
         cardLayout.next(stackedWindows);
    }  
    
    /**
     * Displays a new window for Hi-Scores if one is not
     * already open
     * @param event The user pressed the score button
     */
    private void scoreButtonActionPerformed(ActionEvent event){                                         
        if(scoreFrameOpen == false || scoreFrame.getStatus() == false){
            scoreFrameOpen = true;
            scoreFrame = new ScoreActivity("Hi-Scores", commitSelected, commitCount, hintCount);
            scoreFrame.setSize(600, 525);
            scoreFrame.setResizable(false);
            scoreFrame.setVisible(true);
        }
        else{
            // Refocus on score window
            scoreFrame.toFront();
        }
        
        // Set a listener to handle closing event
        scoreFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent event){
                scoreFrameOpen = false;
                scoreFrame.setVisible(false);
                scoreFrame.dispose();
            }
        });
    }
    
    /**
     * Displays a new window for Guide to Sudoku if one is
     * not already open
     * @param event The user pressed the guide button
     */
    private void guideButtonActionPerformed(ActionEvent event){  
        // If not open, open window or if closed by close button, open window
        if(guideFrameOpen == false || guideFrame.getStatus() == false){
            guideFrameOpen = true;
            guideFrame = new GuideActivity("Guide to Sudoku");
            guideFrame.setSize(600, 525);
            guideFrame.setResizable(false);
            guideFrame.setVisible(true);
        }
        else{
            // Refocus on guide window
            guideFrame.toFront();
        }

        // Set a listener to handle frame closing event
        guideFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent event){
                guideFrameOpen = false;
                guideFrame.setVisible(false);
                guideFrame.dispose();
            }
        });
    }  
    
    /**
     * Closes all open sub windows along with the main window
     * @param event The user pressed the exit button
     */
    private void exitButtonActionPerformed(ActionEvent event){   
        if(guideFrameOpen == true){
            guideFrame.dispose();
        }
        if(scoreFrameOpen == true){
            scoreFrame.dispose();
        }
        if(aboutFrameOpen == true){
            aboutFrame.dispose();
        }
        super.dispose();  
    }
    
    /**
     * Generates a Sudoku puzzle and updates the table
     * @param event The user pressed the new game button
     */
    private void newGameButtonActionPerformed(ActionEvent event){ 
        // Generate new Sudoku puzzle and re-enable buttons
        generateGameBoard();
        enableButtons();

        // Assigns new rowData to the model's rowData as well as updates
        // the forbidden values
        resetTableValues();
        model.fireTableDataChanged();
    }
    
    /**
     * Resets the table back to its initial state where only values
     * given are displayed and values needing entry are clear
     * @param event The user pressed the restart button
     */
    private void restartButtonActionPerformed(ActionEvent event){
        // Re-enable buttons if disabled
        enableButtons();
        
        // Resetting the table with blanks where they should be
        resetTableValues();
        model.fireTableDataChanged();
    }
    
    /**
     * Resets the Sudoku table's values back to what they were initially
     */
    private void resetTableValues(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                model.rowData[i][j] = rowData[i][j];
                model.forbidden[i][j] = sudokuForbidden[i][j];
            }
        }
    }
    
    /**
     * Fills in a random value of the Sudoku table
     * @param event The user pressed the hint button
     */
    private void hintButtonActionPerformed(ActionEvent event){
        // Increment the amount of times the user pressed Get Hint
        if (hintAvailable > 0){
            hintCount++;
        }
        
        // Re-enable buttons and set the amount of hints to zero
        enableButtons();
        hintAvailable = 0;
        String blank = "";

        // Increment hintAvailble if the rowData has no value/is blank
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                 if (model.rowData[i][j].equals(blank)){
                    hintAvailable ++;
                }
            }
        }
        System.out.println(hintAvailable-1);
        
        // As long as there are hints, pick a random row and column to fill in
        while(hintAvailable > 0){
            int rNumberRow = (int)(9*Math.random());
            int rNumberCol = (int)(9*Math.random());
            
            // Only if the rowData is blank it will fill the randomly selected
            // row and column in
            if (model.rowData[rNumberRow][rNumberCol].equals(blank)){
                model.setValueAt(sudokuCompletePuzzle[rNumberRow][rNumberCol], rNumberRow, rNumberCol);
                break;
            }
        }
        // Decrement available hints once to get correct value of leftover hints
        hintAvailable--;
        
        // If there are no more hints, disable the button
        if(hintAvailable == 0){
            //otherButton[2].setEnabled(false);
            System.out.println("No more hints");
        }
        
        // If user erases a hint, rechecks if hint is available and calls function
        // again should there be a hint
        else if (hintAvailable < 0){
            
            hintAvailable++; // to negate the -- from above
            model.fireTableDataChanged();
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    System.out.println(model.rowData[i][j]);
                     if (model.rowData[i][j].equals(blank)){
                        hintAvailable++;
                    }
                }
            }
            if (hintAvailable > 0){
                System.out.println("If Statement");
                hintButtonActionPerformed(event);
            }
        }
    }
    
    /**
     * Displays the values for the generated Sudoku puzzle
     * @param event The user pressed the solution button
     */
    private void solutionButtonActionPerformed(ActionEvent event){ 
        // Re-enable buttons if disabled
        enableButtons();
        
        // Update the table, showing all values of the puzzle
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                model.setValueAt(sudokuCompletePuzzle[i][j], i, j);
            }
        }
        model.fireTableDataChanged();
        
        // Disable buttons
        disableButtons();
    }
    
    /**
     * Verifies the values of the Sudoku puzzle are correct and displays
     * a new score window for name submission if true
     * @param event The user pressed the commit button
     */
    private void commitButtonActionPerformed(ActionEvent event){ 
   
        // Increment amount of times user pressed Commit
        commitCount++;

        // Keep count for number of entries correct
        int match = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                String answer= "" + sudokuCompletePuzzle[i][j];
                // If the model rowData is a correct value, increment match  
                if (table.getValueAt(i, j).toString().equals(answer)){
                    match++;
                    System.out.println(" ->"+model.rowData[i][j] + "   " + (Object)sudokuCompletePuzzle[i][j]);
                }else{ // If the number is not a correct value, reset it/ make it blank
                    System.out.println("IN HERE");
                    model.rowData[i][j] = rowData[i][j];
                    model.fireTableCellUpdated(i, j);
                }
            } 
        }
        System.out.println(match);
        // If all values entered are correct, bring up the score window and disable
        // buttons
        if (match == 81){
            commitSelected = true;
            scoreButtonActionPerformed(event);
            disableButtons();
        }
        
        /*try{
            Class.forName("org.sqlite.JDBC");
            System.out.println("Connecting to database...");
            c = DriverManager.getConnection("jdbc:sqlite:/Users/iAmZay/SudokuCIS18B/SudokuV10/Sudoku.sqlite"); // Change for OPC
          
            // First lets get the last attempt
            stmt = c.createStatement();
            String sql = "SELECT * FROM Sudoku";
            pst3 = c.prepareStatement(sql);
            ResultSet rst = pst3.executeQuery();
            while(rst.next()){
                String userName = rst.getString("UserName");
                int userCommit = rst.getInt("uAttempt");
                int userHint = rst.getInt("uHint");
                System.out.println(userName + userCommit + userHint);
            }
        rst.close();
        stmt.close();
        }catch(Exception se){
           se.printStackTrace(); // Dont forget to print out the exceptions to see what problems your code could have
        }  finally {
           try{
                    if(pst3!=null)
                        pst3.close();
                } catch(SQLException se2) {
                    
                } //do nothing.
                try{
                    if(c!=null)
                        c.close();
                } catch(SQLException se){
               }
              } 
        */
         
        } 
    //} 

    /**
     * Returns user back to title/main screen
     * @param event The user pressed the back to title menu item
     */
    private void backItemActionPerformed(ActionEvent event) {
        cardLayout.first(stackedWindows);
    }
    
    /**
     * Displays a new window for About Sudoku if one is
     * not already open
     * @param event The user pressed the about sudoku menu item
     */
    private void aboutItemActionPerformed(ActionEvent event) {
        if(aboutFrameOpen == false || aboutFrame.getStatus() == false){
            aboutFrameOpen = true;
            aboutFrame = new AboutActivity("About this Project");
            aboutFrame.setSize(400, 278);
            aboutFrame.setResizable(false);
            aboutFrame.setVisible(true);
        }
        else{
            // Refocus on guide window
            aboutFrame.toFront();
        }

        // Set a listener to handle frame closing event
        aboutFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent event){
                aboutFrameOpen = false;
                aboutFrame.setVisible(false);
                aboutFrame.dispose();
            }
        });
    }
    
    /**
     * Enables all game buttons aside from New Game
     */
    private void enableButtons(){
        otherButton[1].setEnabled(true);
        otherButton[2].setEnabled(true);
        otherButton[3].setEnabled(true);
        otherButton[4].setEnabled(true);
    }
    
    /**
     * Disables all game buttons aside from New Game
     */
    private void disableButtons(){
        otherButton[1].setEnabled(false);
        otherButton[2].setEnabled(false);
        otherButton[3].setEnabled(false);
        otherButton[4].setEnabled(false);
    }
}

