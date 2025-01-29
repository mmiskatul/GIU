package frame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myframe extends JFrame{
    Myframe(){
        
        this.setTitle("GUI project ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);
        
        ImageIcon image=new ImageIcon("images.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));;
    }
}
