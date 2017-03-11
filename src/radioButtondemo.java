import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class radioButtondemo {
    public static void main(String args[])
    {
        radioButtonTest rdn = new radioButtonTest();
        rdn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class radioButtonTest extends JFrame
{
    radioButtonTest()
    {
        setTitle("RadioButton Demo");
        setLocation(300,300);
        setSize(WIDTH,HEIGHT);
        Container contentPane = getContentPane();
        panel = new JPanel();
        label = new JLabel("India is my country");
        label.setFont(new Font("Serif",Font.PLAIN,DEFAULT_SIZE));
        contentPane.add(label,BorderLayout.CENTER);
        group = new ButtonGroup();
        addRadioButton("small",12);
        addRadioButton("medium",18);
        addRadioButton("large",20);
        addRadioButton("Extra Large",36);

        contentPane.add(panel,BorderLayout.SOUTH);
        setVisible(true);
    }

    public void addRadioButton(String name, final int size)
    {
        boolean selected = (size == DEFAULT_SIZE);
        
        JRadioButton button = new JRadioButton(name,selected);
        group.add(button);
        panel.add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                    label.setFont(new Font("Serif",Font.PLAIN,size));
                    
            }
        });
    }
    final int DEFAULT_SIZE = 18;
    JLabel label;
    JPanel panel;
    ButtonGroup group;
    final int WIDTH = 500,HEIGHT = 500;

}