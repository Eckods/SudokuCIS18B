/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * GameFrame represents the main window for the Sudoku application
 * @author Steve Sanchez
 */
public class MainFrame extends JFrame{
    private JButton startButton;
    private JButton scoreButton;
    private JButton guideButton;
    private JButton exitButton;
    private JButton newGameButton;
    private JButton restartButton;
    private JButton hintButton;
    private JButton solutionButton;
    private JButton commitButton;
    private JButton otherExitButton;
    private JMenuBar menuBar;
    private ScoreActivity scoreFrame;
    private GuideActivity guideFrame;
    private boolean scoreFrameOpen = false;
    private boolean guideFrameOpen = false;
    private CardLayout cardLayout;
    private JPanel stackedWindows;

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
        
        // Set menu bar
      //  menuBar = new JMenuBar();
       // JMenu gameMenu = new JMenu("Game");       
       // menuBar.add(gameMenu);
        //setJMenuBar(menuBar);
      //  JFrame invisFrame = new JFrame();
      //  invisFrame.setBackground(new Color(0,0,0,0));
       // invisFrame.setJMenuBar(menuBar);
                
        // Set background image for main window and game window
        JLabel mainBackground = new JLabel();
        mainBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "TitleBackground.png")));  
        mainBackground.setLayout(new FlowLayout());
        
        JLabel gameBackground = new JLabel();
        gameBackground.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "OtherBackground.png")));
        gameBackground.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
               
        // Create labels for main window and game window
        JLabel sudokuTitle = new JLabel();
        sudokuTitle.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Title.png")));
        sudokuTitle.setPreferredSize(new Dimension(800, 120));

        JLabel options = new JLabel();
        options.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Options.png")));
        options.setPreferredSize(new Dimension(200, 120));
        
        // Create panels to hold main window and game window buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setOpaque(false);
        
        JPanel gameButtonPanel = new JPanel();
        gameButtonPanel.setLayout(new BoxLayout(gameButtonPanel, BoxLayout.Y_AXIS));
        gameButtonPanel.setOpaque(false);
        gameButtonPanel.setPreferredSize(new Dimension(200, 600));
        
        // Create main window and game window buttons
        createMainWindowButtons();
        createGameWindowButtons();
        
        // Create sudoku game grid and set its place on gridlayout
        JTextField placeHolder = new JTextField("THIS IS A GRID PLACEHOLDER");
        placeHolder.setPreferredSize(new Dimension(550, 550));
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 2;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(0,25,0,0);
        gameBackground.add(placeHolder, constraints);
        
        // Add buttons to panel for main window
        buttonPanel.add(startButton);
        buttonPanel.add(scoreButton);
        buttonPanel.add(guideButton);
        buttonPanel.add(exitButton);
        
        // Add buttons to panel for game window and set its place on gridlayout
        gameButtonPanel.add(options);
        gameButtonPanel.add(newGameButton);
        gameButtonPanel.add(restartButton);
        gameButtonPanel.add(hintButton);
        gameButtonPanel.add(solutionButton);
        gameButtonPanel.add(commitButton);
        gameButtonPanel.add(otherExitButton);
        
        Dimension minSize = new Dimension(0,204);
        gameButtonPanel.add(Box.createRigidArea(minSize));
    
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.insets = new Insets(0,25,0,0);
        gameBackground.add(gameButtonPanel, constraints);
        
        // Add the button panel to main window layout
        mainBackground.add(sudokuTitle);
        mainBackground.add(buttonPanel);
        
        // Add the main window layout and game window layout to card layout
        stackedWindows.add(mainBackground);
        stackedWindows.add(gameBackground);
        add(stackedWindows);
    }
    
    /**
     * Creates the buttons used by the main window
     */
    private void createMainWindowButtons() {
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
            @Override
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
            @Override
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
            @Override
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
            @Override
            public void actionPerformed(ActionEvent event){
                exitButtonActionPerformed(event);
            }
        });
        
        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setMargin(new Insets(9,52,0,0));
    }
    
    /**
     * Creates the buttons used by the game window
     */
    private void createGameWindowButtons() {
        // Create new game button
        newGameButton = new JButton();
        newGameButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "NewGame.png")));       
        newGameButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "NewGamePushed.png")));
        newGameButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "NewGameHover.png")));    
        
        newGameButton.setPreferredSize(new Dimension(250, 45));
        newGameButton.setToolTipText("Generate New Puzzle");
        newGameButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                newGameButtonActionPerformed(event);
            }
        });
   
        newGameButton.setBorderPainted(false);
        newGameButton.setFocusPainted(false);
        newGameButton.setContentAreaFilled(false);
        
        // Create restart button
        restartButton = new JButton();
        restartButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Restart.png")));       
        restartButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "RestartPushed.png")));
        restartButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "RestartHover.png")));  
        
        restartButton.setPreferredSize(new Dimension(200, 45));
        restartButton.setToolTipText("Restart Puzzle");
        restartButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                restartButtonActionPerformed(event);
            }
        });
        
        restartButton.setBorderPainted(false);
        restartButton.setFocusPainted(false);
        restartButton.setContentAreaFilled(false);
        
        // Create hint button
        hintButton = new JButton();
        hintButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Hint.png")));       
        hintButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "HintPushed.png")));
        hintButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "HintHover.png")));  
        
        hintButton.setPreferredSize(new Dimension(200, 45));
        hintButton.setToolTipText("Get Hint For A #");
        hintButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                hintButtonActionPerformed(event);
            }
        });
        
        hintButton.setBorderPainted(false);
        hintButton.setFocusPainted(false);
        hintButton.setContentAreaFilled(false);
        
        // Create solution button
        solutionButton = new JButton();
        solutionButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Solution.png")));       
        solutionButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "SolutionPushed.png")));
        solutionButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "SolutionHover.png")));  
        
        solutionButton.setPreferredSize(new Dimension(200, 45));
        solutionButton.setToolTipText("Display Solution");
        solutionButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                solutionButtonActionPerformed(event);
            }
        });
        
        solutionButton.setBorderPainted(false);
        solutionButton.setFocusPainted(false);
        solutionButton.setContentAreaFilled(false);
              
        // Create commit button
        commitButton = new JButton();
        commitButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "Commit.png")));       
        commitButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "CommitPushed.png")));
        commitButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "CommitHover.png")));  
        
        commitButton.setPreferredSize(new Dimension(200, 45));
        commitButton.setToolTipText("Submit Answer");
        commitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                commitButtonActionPerformed(event);
            }
        });
        
        commitButton.setBorderPainted(false);
        commitButton.setFocusPainted(false);
        commitButton.setContentAreaFilled(false);
        
        // Create exit button
        otherExitButton = new JButton();
        otherExitButton.setIcon(new ImageIcon(getClass().getResource("/Images/"
                + "OtherExit.png")));       
        otherExitButton.setPressedIcon(new ImageIcon(getClass().getResource("/Images/"
                + "OtherExitPushed.png")));
        otherExitButton.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/"
                + "OtherExitHover.png")));  
        
        otherExitButton.setPreferredSize(new Dimension(200, 45));
        otherExitButton.setToolTipText("Exit Game");
        otherExitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                exitButtonActionPerformed(event);
            }
        });
        
        otherExitButton.setBorderPainted(false);
        otherExitButton.setFocusPainted(false);
        otherExitButton.setContentAreaFilled(false);
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
        if(scoreFrameOpen == false){
            scoreFrameOpen = true;
            scoreFrame = new ScoreActivity("Hi-Scores");
            scoreFrame.setSize(600, 525);
            scoreFrame.setResizable(false);
            scoreFrame.setVisible(true);
        }
        if(scoreFrame.getStatus() == false){
            scoreFrameOpen = true;
            scoreFrame = new ScoreActivity("Hi-Scores");
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
        if(guideFrameOpen == false){
            guideFrameOpen = true;
            guideFrame = new GuideActivity("Guide to Sudoku");
            guideFrame.setSize(600, 525);
            guideFrame.setResizable(false);
            guideFrame.setVisible(true);
        }
        // Check uif opened with close button
        if (guideFrame.getStatus() == false){
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
        super.dispose();  
    }
    
    /**
     * 
     * @param event The user pressed the new game button
     */
    private void newGameButtonActionPerformed(ActionEvent event){   
        System.out.println("New Game button was pushed");
    }
    
    /**
     * 
     * @param event The user pressed the restart button
     */
    private void restartButtonActionPerformed(ActionEvent event){   
        System.out.println("Restart button was pushed");
    }
    
    /**
     * 
     * @param event The user pressed the hint button
     */
    private void hintButtonActionPerformed(ActionEvent event){   
        System.out.println("Get hint button was pushed");
    }
    
    /**
     * 
     * @param event The user pressed the solution button
     */
    private void solutionButtonActionPerformed(ActionEvent event){   
        System.out.println("Show solution button was pushed");
    }
    
    /**
     * 
     * @param event The user pressed the commit button
     */
    private void commitButtonActionPerformed(ActionEvent event){   
        System.out.println("Commit Sudoku button was pushed");
    } 
    
}
