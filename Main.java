package JavaStuff;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton btn1 = new JButton("One");
    JButton btn2 = new JButton("Two");
    JButton btn3 = new JButton("Three");
    JButton btn4 = new JButton("Three");
    JButton btn5 = new JButton("Three");
    JButton btn6 = new JButton("Three");
    JButton btn7 = new JButton("Three");
    JButton btn8 = new JButton("Three");
    JButton btn9 = new JButton("Three");
    JButton btn10 = new JButton("Three");


    public Main() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(btn1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(btn2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;

        panel.add(btn4,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(btn3, gbc);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

}