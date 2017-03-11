import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SecondPro {
public static void main(String args[])
    {
        ChangeColor frm = new ChangeColor();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class ChangeColor extends JFrame
{
    final int WIDTH = 500,HEIGHT = 500;
    JButton red,blue,green;
    JPanel panel;
    ChangeColor()
    {
        setTitle("Change Color");
        setLocation(300,300);
        setSize(WIDTH,HEIGHT);
        Container contentPane = getContentPane();
        panel = new JPanel();
        red = new JButton("red");
        red.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel.setBackground(Color.red);
                
            }
        });
        blue = new JButton("blue");
        blue.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                panel.setBackground(Color.blue);
                
            }
        });
        green = new JButton("green");
        green.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                panel.setBackground(Color.green);
                
            }
        });
        panel.add(red);
        panel.add(blue);
        panel.add(green);
        contentPane.add(panel);
        setVisible(true);
    }
}