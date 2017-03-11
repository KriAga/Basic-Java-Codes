import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class comboboxTest {
    public static void main(String arg[])
    {
            comboBoxDemo frm = new comboBoxDemo();
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class comboBoxDemo extends JFrame
{
    comboBoxDemo()
    {
        setTitle("ComboBoxDemo");
        setLocation(300,200);
        setSize(WIDTH,HEIGHT);
        panel = new JPanel();
        Container contentPane = getContentPane();
        label = new JLabel("India is my country");
        label.setFont(new Font("Serif",Font.PLAIN,SIZE));
        contentPane.add(label,BorderLayout.CENTER);
        combobox = new JComboBox(arr);
		
        combobox.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int a = 0;
                
                String s =(String)combobox.getSelectedItem();
                
                if(s.equals("Small"))
                a = 15;
                else if(s.equals("Medium"))
                a = 20;
                else if(s.equals("Large"))
                a = 25;
                else
                a = 36;
                label.setFont(new Font("Serif",Font.PLAIN,a));
            }
        });


        panel.add(combobox);
        contentPane.add(panel,BorderLayout.SOUTH);
        setVisible(true);
    }

    JLabel label;
    JPanel panel;
    JComboBox combobox;
    final String arr[] = {"Small","Medium","Large","Extra_Large"};
    final int WIDTH = 400,HEIGHT = 400;
    final int SIZE = 12,Small=14,Medium = 20,Large = 25,Extra_Large = 36;
}
