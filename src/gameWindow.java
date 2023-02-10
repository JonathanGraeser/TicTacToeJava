import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class gameWindow implements ActionListener{

    boolean gameOver = false;

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
        String text = xTurn ? "X" : "0";
        clickedButton.setText(text);
        xTurn = !xTurn;
        checkWin();
    }

    private void checkWin() {
        for(int i = 0; i < 3; i++) {
           if(checkRow(i) || checkColumn(i) || checkDiagonal1(i) || checkDiagonal2(i)) {
               gameOver = true;
               break;
           }
           if (gameOver == true) {
               winWindow winW = new winWindow();
           }
        }
    }

    private boolean checkRow(int row) {
        return buttons[row][0].getText() == buttons[row][1].getText() &&
                buttons[row][1].getText() == buttons[row][2].getText() &&
                buttons[row][0].getText() !=  " ";
    }

    private boolean checkColumn(int col) {
        return buttons[0][col].getText() == buttons[1][col].getText() &&
                buttons[1][col].getText() == buttons[2][col].getText() &&
                buttons[0][col].getText() != " ";
    }

    private boolean checkDiagonal1(int dia1) {
        return buttons[0][0].getText() == buttons[1][1].getText() &&
                buttons[1][1].getText() == buttons[2][2].getText() &&
                buttons[0][0].getText() != " ";
    }

    private boolean checkDiagonal2(int dia2) {
        return buttons[0][2].getText() == buttons[1][1].getText() &&
                buttons[1][1].getText() == buttons[2][0].getText() &&
                buttons[0][2].getText() != " ";
    }
}

