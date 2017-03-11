import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingDemoButton
{
    public static void main(String args[])
    {
        SwingDemoTest obj = new SwingDemoTest();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class SwingDemoTest extends JFrame
{
    SwingDemoTest()
    {
        setTitle("SwingDemo");
        setLocation(300,200);
        setSize(WIDTH,HEIGHT);
        Container contentPane = getContentPane();
        panel = new JPanel();
        button1 = new JButton("Exit");
        button1.addActionListener(new exitAction());
        textField1 = new JTextField(40);
        
        textField1.addKeyListener(new KeyAdapter() 
		{
				public void keyTyped(KeyEvent e)
				{
                                    
                                                
						char c = e.getKeyChar();
                                                
                                                String s = textField1.getText().trim();
                                                int p = count(s);
                                                if(p == 1)
                                                {
                                                       if(!((c >= '0') && (c <= '9')||(c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
                                                       {
                                                            e.consume();
                                                       }
                                                }
                                                
						if(!((c >= '0') && (c <= '9')||(c=='.') ||(c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
						{
						e.consume();
						}
				}
		});
        panel.add(textField1);
        panel.add(button1);
        contentPane.add(panel);
        setVisible(true);
    }
    class exitAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    int count(String str)
    {
        int c =0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '.')
            c = c + 1;
        }
        return c;
    }
    final int WIDTH = 500,HEIGHT = 500;
    JButton button1;
    JPanel panel;
    JTextField textField1;
}