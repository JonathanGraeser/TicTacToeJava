import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class startPage implements ActionListener{

    JFrame frame = new JFrame("Tic Tac Toe Main Menu");
    JButton startButton = new JButton("Start Game");
    JButton exitButton = new JButton("Exit");
    JLabel startText = new JLabel("Tic Tac Toe");

    startPage(){

        startText.setBounds(150, 50, 200, 40);
        startText.setFont(new Font(null, Font.BOLD, 35));

        startButton.setBounds(100, 160, 200, 40);
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        exitButton.setBounds(100, 260, 200, 40);
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);


        frame.add(startText);
        frame.add(startButton);
        frame.add(exitButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == startButton) {
            gameWindow newGame = new gameWindow();
        }

        if (e.getSource() == exitButton) {
            System.exit(0);
        }

    }
}
