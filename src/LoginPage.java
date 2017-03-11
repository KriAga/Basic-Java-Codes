import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage {
    public static void main(String args[])
    {
        Page frm = new Page();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Page extends JFrame
{
    final int WIDTH = 500,HEIGHT = 500;
    JButton red,blue,green;
    JPanel panel;
    Page()
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