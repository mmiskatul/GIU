package lable;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class main {
  
    
        public static void main(String[] args) {
    
            ImageIcon image =new ImageIcon("lable/image.png");
            Border border =BorderFactory.createLineBorder(Color.green,3);
        JLabel label=new JLabel();
        label.setText("Do you even Code ?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli",Font.PLAIN, 20 ));
        label.setIconTextGap(30);
        label.setBackground(Color.BLACK );
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0,0,250,250);
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Label project");
        frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
    }
}
