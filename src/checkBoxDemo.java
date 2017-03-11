import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class checkBoxDemo {
    public static void main(String args[])
    {
        checkBoxFrame chkframe = new checkBoxFrame();
        chkframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class checkBoxFrame extends JFrame
{
    checkBoxFrame()
    {
        setTitle("CheckBoxFrame Demo");
        setLocation(300,300);
        setSize(WIDTH,HEIGHT);
        panel = new JPanel();
        Container contentPane = getContentPane();
        label = new JLabel("India is my country");
        label.setFont(new Font("Serif",Font.PLAIN,FONTSIZE));
        contentPane.add(label,BorderLayout.CENTER);
        bold = new JCheckBox("Bold");
        italic = new JCheckBox("italic");
        panel.add(bold);
        panel.add(italic);
        bold.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                label.setFont(new Font("Arial",Font.BOLD,FONTSIZE));
            }
        });

        italic.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                label.setFont(new Font("Serif",Font.ITALIC,FONTSIZE));
            }
        });



        contentPane.add(panel,BorderLayout.SOUTH);
        setVisible(true);
    }

    JLabel label;
    JPanel panel;
    final int WIDTH = 500,HEIGHT = 500,FONTSIZE = 40;
    JCheckBox bold,italic;
}