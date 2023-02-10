import javax.swing.*;
import java.awt.*;

public class winWindow {

    JFrame frame = new JFrame("Winner");

    JLabel winLabel = new JLabel("Gewonnen");

    JButton again = new JButton("Play again");
    JButton exit = new JButton("Exit");



    winWindow() {

        winLabel.setBounds(150, 50, 200, 40);
        winLabel.setFont(new Font(null, Font.BOLD, 35));



        frame.add(winLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
