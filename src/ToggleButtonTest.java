import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ToggleButtonTest {
    public static void main(String args[])
    {
       try{
           SwingUtilities.invokeAndWait(new Runnable(){
               public void run()
               {
                   new ToggleButtonDemo();
               }
           });
       }
       catch(Exception ex)
       {
           System.out.println("Can not create GUI");
       }
       
    }
}
class ToggleButtonDemo extends JFrame
{
    ToggleButtonDemo()
    {
        setTitle("ToggleButton Demo");
        setLocation(300,300);
        setSize(WIDTH,HEIGHT);
        panel = new JPanel();
        Container contentPane = getContentPane();
        button = new JToggleButton("On/Off");
        button.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ev)
            {
                if(button.isSelected())
                    label.setText("Button is On");
                else 
                    label.setText("Button is Off");
            }
        });
        panel.add(button);
        label = new JLabel("Button is off");
        contentPane.add(label,BorderLayout.CENTER);
        contentPane.add(panel,BorderLayout.SOUTH);
        setVisible(true);
    }   
    final int WIDTH = 400,HEIGHT = 400;
    JToggleButton button;
    JLabel label;
    JPanel panel;
    
}
