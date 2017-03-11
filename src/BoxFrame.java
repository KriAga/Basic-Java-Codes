import java.awt.*;
import javax.swing.*;

class BoxFrame extends JFrame
{
	public static void main( String args[] )
	{
		BoxFrameDemo frm = new BoxFrameDemo();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class BoxFrameDemo extends JFrame
{
	BoxFrameDemo()
	{
		setTitle("My Box Frame Demo");
		setLocation(300,200);
		setSize(WIDTH,HEIGHT);
		Container contentPane = getContentPane();
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		button1 = new JButton("First Button");
		button1.setAlignmentY(Component.TOP_ALIGNMENT);
		button2 = new JButton("Second Button");
		button2.setAlignmentY(Component.TOP_ALIGNMENT);
		button3 = new JButton("Third Button");
		button3.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		contentPane.add(panel);		
		setVisible(true);
	}
	
	final int WIDTH = 400,HEIGHT = 400;
	JPanel panel;
	JButton button1,button2,button3;
}
