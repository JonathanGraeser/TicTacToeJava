import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class gameWindow implements ActionListener{

    boolean xTurn = true;

    JButton[][] buttons = new JButton[3][3];


    JFrame frame = new JFrame();

    JPanel panel = new JPanel(new GridLayout(3, 3));
    gameWindow(){

        frame.setTitle("Tic Tac Toe Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);

        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                buttons[i][y] = new JButton();
                buttons[i][y].addActionListener(this);
                panel.add(buttons[i][y]);
            }
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String text = xTurn ? "X" : "O";
        clickedButton.setText(text);
        xTurn = !xTurn;
    }
}
