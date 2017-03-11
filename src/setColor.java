/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class setColor {
    public static void main(String args[])
    {
    	try{
    		SwingUtilities.invokeAndWait(new Runnable(){
    			public void run()
    			{
    				new setColorClass();
    			}
    		});
    		
    	}catch(Exception e){
    		System.out.println("This class can not be loaded beacuse of "+e);
    	}	
    }
    static class setColorClass extends JFrame
    {
        setColorClass()
        {
                setTitle("Color");
		setLocation(300,200);
		setSize(500,500);
		Container contentPane = getContentPane();
		panel = new JPanel();
                combo = new JComboBox(arr);
                combo.addActionListener(new comboAction(){
                    public void actionPerformed(ListSelectionEvent e)
                    {
                        
                        
                    }
         
                 });
                panel.add(combo);
                
                contentPane.add(panel,BorderLayout.CENTER);
                
                setVisible(true);
        }
        class comboAction implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                String x = combo.getSelectedItem().toString();
                System.out.println(x);
                
                panel.setBackground(getColor(x));
                
            }
           Color getColor(String a)
            {
              if(a=="Red")
              {
                  return Color.red;
              }
              else if(a=="Green")
              {
                  return Color.green;
              }
              else if(a=="Blue")
              {
                  return Color.blue;
              }
              else
              {
                  return Color.black;
              }
                 
            };
        }
        JPanel panel;
        JComboBox combo;
        
        final String arr[]={"Red","Green","Blue"};
        
    }
    
}
