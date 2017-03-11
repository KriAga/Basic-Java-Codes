import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class InfixConversion {

    public static void main(String args[])
    {
    	InfixCont obj = new InfixCont();
    	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class InfixCont extends JFrame{
	
	InfixCont()
	{
		setTitle("Infix Expression ");
		setLocation(300,100);
		setSize(WIDTH,HEIGHT);
		Container contentPane = getContentPane();
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		label = new JLabel("Infix Expression");
		panel.add(label);
		text1 = new JTextField(40);
		panel.add(text1);
		button1 = new JButton("In To Post");
		
		button1.addActionListener(new inToPostAction());
		panel.add(button1);
		
		text2 = new JTextField(40);
		panel.add(text2);
		text3 = new JTextField(40);
		button2 = new JButton("Post to Pre");
		button2.addActionListener(new postToPreAction());
		panel.add(button2);
		panel.add(text3);
		contentPane.add(panel);
		
		setVisible(true);
	}
	class inToPostAction implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String infix = text1.getText().trim();
			infix = infix.replaceAll("\\s+","");
			infix = infix.replaceAll(" ","");
			infix = "("+infix+")";
			text1.setText(infix);
			text2.setText(intoPost(infix));
		}
	}
	
	class postToPreAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String post = text2.getText();
			System.out.println(post);
			text3.setText(postToPre(post));
		}
	}
	
	String postToPre(String post)
	{
		String stack[] = new String[post.length()];
		String f="",s="";
		int top = -1;
		String v = "-+*/^";
		
		for(int i=0;i<post.length();i++)
		{
			char ch = post.charAt(i);
			if(v.indexOf(ch) == -1)
			stack[++top] = ch+"";
			else
			{
				s = stack[top--];
				f = stack[top--];
				f = ch+ f + s;
				stack[++top] = f;
			}
		}
		return stack[0];
	}
	String intoPost(String infix)
	{
		String post="",v="-+*/^";
		char stack[] = new char[infix.length()];
		int top = -1;
		
		for(int i=0;i<infix.length();i++)
		{
			char ch = infix.charAt(i);
			if(ch == '(')
			stack[++top] = ch;
			else if(ch == ')')
			{
				while(true)
				{
					ch = stack[top--];
					if(ch == '(')
					break;
					post = post + ch;
				
				}
			}
			else if(v.indexOf(ch) == -1)
			{
				post = post + ch;
			}
			else
			{
				while(v.indexOf(stack[top]) >= v.indexOf(ch))
				post = post + stack[top--];
				
				stack[++top] = ch;		
			}
		}
		
		return post;
	}
	
	JPanel panel;
	JLabel label;
	JTextField text1, text2,text3;
	JButton button1,button2,button3;
	final int WIDTH = 400,HEIGHT = 400;
}