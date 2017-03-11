
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class comboColorAction {

    public static void main(String args[])
    {
    	try{
   			SwingUtilities.invokeAndWait(new Runnable(){
   					public void run()
   					{
   						new comboColorDemo();
   					}
   			});
   		}
   		catch(Exception e)
   		{
   			System.out.println("This class can not be loaded because of  "+e);
   		}
    }    
}

class comboColorDemo extends JFrame{
	
	comboColorDemo()
	{
		setTitle("comboColor");
		setLocation(300,200);
		setSize(WIDTH,HEIGHT);
		Container contentPane = getContentPane();
		panel = new JPanel();
		combo = new JComboBox(arr);
		panel.add(combo,BorderLayout.NORTH);
		panel.setBackground(Color.white);
		combo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String s = (String)combo.getSelectedItem();
				
				if(s.equals("red"))
				panel.setBackground(Color.red);
				if(s.equals("green"))
				panel.setBackground(Color.green);
				if(s.equals("blue"))
				panel.setBackground(Color.blue);
			
			}
		});
		
		
		
		contentPane.add(panel);
		setVisible(true);
	}
	JPanel panel;
	JComboBox combo;
	final String arr[] = {"red","blue","green"};
	final int WIDTH = 400,HEIGHT = 400;
}