import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton startButton = new JButton("Start Game");
    JLabel startText = new JLabel("Tic Tac Toe");

    startPage(){

        startButton.setBounds(100, 160, 200, 40);
        startButton.setFocusable(false);
        startButton.addActionListener(this);


        frame.add(startButton);

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

    }
}
