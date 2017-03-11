import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboSelectTest {

   public static void main(String args[])
   {
   		try{
   			SwingUtilities.invokeAndWait(new Runnable(){
   					public void run()
   					{
   						new ComboSelectDemo();
   					}
   			});
   		}
   		catch(Exception e)
   		{
   			System.out.println("This class can not be loaded because of  "+e);
   		}
   } 
}
class ComboSelectDemo extends JFrame
{
	ComboSelectDemo()
	{
		setTitle("ComboTest");
		setLocation(300,200);
		setSize(WIDTH,HEIGHT);
		panel = new JPanel();
		panel1 = new JPanel();
		Container contentPane  = getContentPane();
		comboBox = new JComboBox(arr);
		comboBox.setSelectedIndex(1);
		comboBox.addActionListener(new comboAction());
		textArea = new JTextArea(20,30);
		scroll = new JScrollPane(textArea);
		textArea.setText(arr1[1]);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(comboBox);
		panel1.add(scroll);
		contentPane.add(panel,BorderLayout.NORTH);
		contentPane.add(panel1,BorderLayout.SOUTH);
		setVisible(true);
	}
	class comboAction implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			int p = comboBox.getSelectedIndex();
			
			textArea.setText(arr1[p]);
		}
	}
	final int WIDTH = 500,HEIGHT = 500;	
	JPanel panel,panel1;
	JComboBox comboBox;
	JTextArea textArea;
	JScrollPane scroll;
	final String arr[] = {"Arun Singh","Sagar Goel","Krishna Agarwal","Vaishali Verma","Karan Banker","Veer Singh","Aviral Charia"};
	final String arr1[] = { "Teacher\n1/175 virat khand Gomti Nagar Lucknow\nSeth M.R. Jaipuria School",
							"Student\n1/105 vishwas khand Gomti Nagar Lucknow\nKIIT Bhuwneshwar",
							"Student\n92/160 GB Marg Lucknow\nVIT Vellore",	
							"Student\n4/316 Vijyant khand Gomti Nagar Lucknow\nSRM Chennai",	
							"Student\nL1/78 Vinay Khand Gomti Nagar Lucknow\nSRM Chennai",
							"Student\n2/169 Virat Khand Gomti Nagar Lucknow\nSeth M.R. Jaipuria School",
							"Studnet\n2/259 Virat Khand Gomti Nagar Lucknow\nSeth M.R.Jaipuria School"
	};
}