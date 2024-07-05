package java_Slips;
import java.awt.*;
import javax.swing.*;

public class frame {
    public static void main(String[] args){
        JFrame frame = new JFrame("This is click listeneer frame");
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        Font f = new Font("Monospaced", Font.BOLD , 30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField tf = new JTextField(60);
        tf.setSize(100,100);
        tf.setFont(f);

        JLabel label = new JLabel();

        JButton b = new JButton("Print");
        b.setSize(100,30);
        b.addActionListener(e ->{
           String text = tf.getText();
           label.setText(text);
        });

        frame.add(tf);
        frame.add(label);
        frame.add(b);
        frame.setVisible(true);
    }
}
