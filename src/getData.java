/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class getData {
    public static void main(String args[])
    {
    	try{
    		SwingUtilities.invokeAndWait(new Runnable(){
    			public void run()
    			{
    				new getDataClass();
    			}
    		});
    		
    	}catch(Exception e){
    		System.out.println("This class can not be loaded beacuse of "+e);
    	}
    	
    }
    static class getDataClass extends JFrame
    {
        getDataClass()
        {
                setTitle("Employee Data");
		setLocation(300,200);
		setSize(500,500);
		Container contentPane = getContentPane();
		panel1 = new JPanel();
                panel2 = new JPanel();
                list = new JList(arr);
                text = new JTextArea();
                list.addListSelectionListener(new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent e)
                    {
                        int p = list.getSelectedIndex();
                        text.setText(data[p]);
                        
                    }
         
                 });
                panel1.add(list);
                panel2.add(text);
                contentPane.add(panel1,BorderLayout.NORTH);
                contentPane.add(panel2,BorderLayout.CENTER);
                setVisible(true);
        }
        JPanel panel1,panel2;
        JList list;
        JTextArea text;
        final String arr[]={"Veer","Aviral","Arun Sir"};
        final String data[]={"Name: Veer, Age:18, City:Lucknow.","Name: Aviral, Age:16, City: Lucknow","Name: Arun Kumar, Age:18, City:Lucknow"};
    }
    
}
