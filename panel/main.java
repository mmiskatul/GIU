import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {
    public static void main(String[] args) {

    JLabel label=new JLabel();
    label.setText("Hi");
    label.setVerticalAlignment(JLabel.TOP);
    ImageIcon icon=new ImageIcon("panel/image.png");
    label.setIcon(icon);
    JPanel redpanel=new JPanel();
    redpanel.setBackground(Color.RED);
    redpanel.setBounds(0, 0, 250, 250);
    JPanel bluepPanel=new JPanel();
    bluepPanel.setBackground(Color.BLUE);
    bluepPanel.setBounds(250, 0, 250, 250);
    JPanel greeJPanel=new JPanel();
    greeJPanel.setBackground(Color.GREEN);
    greeJPanel.setBounds(0, 250, 750, 500);

    JFrame frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(720,720);
    frame.setVisible(true);
    redpanel.add(label);
    frame.add(redpanel);
    frame.add(bluepPanel);
    frame.add(greeJPanel);
    }
}
