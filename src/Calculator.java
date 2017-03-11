import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator
{
    public static void main(String args[])
    {
        calci obj = new calci();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class calci extends JFrame
{
    
    calci()
    {
        
        setTitle("calci");
        setLocation(600,200);
        setSize(WIDTH,HEIGHT);
        Container contentPane = getContentPane();
        panel = new JPanel();
        panel3 = new JPanel();
        equal = new JButton("=");
        equal.setPreferredSize(new Dimension(260,40));
        equal.addActionListener(new resultAction());
        panel3.add(equal);
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0,1));
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(0,4));
        text1 = new JTextField();
        text1.setPreferredSize(new Dimension(260,40));
        panel1.add(text1);
        
        button0 = new JButton("0");
        button0.addActionListener(new NumberAction());
        button1 = new JButton("1");
        button1.addActionListener(new NumberAction());
        button2 = new JButton("2");
        button2.addActionListener(new NumberAction());
        buttonp = new JButton("+");
        buttonp.addActionListener(new solveAction());
        panel2.add(button0);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(buttonp);
        
        button3 = new JButton("3");
        button3.addActionListener(new NumberAction());
        button4 = new JButton("4");
        button4.addActionListener(new NumberAction());
        button5 = new JButton("5");
        button5.addActionListener(new NumberAction());
        buttons = new JButton("-");
        buttons.addActionListener(new solveAction());
         panel2.add(button3);
         panel2.add(button4);
         panel2.add(button5);
         panel2.add(buttons);
       
        
        button6 = new JButton("6");
        button6.addActionListener(new NumberAction());
        button7 = new JButton("7");
        button7.addActionListener(new NumberAction());
        button8 = new JButton("8");
        button8.addActionListener(new NumberAction());
        buttonm = new JButton("*");
        buttonm.addActionListener(new solveAction());
        
        panel2.add(button6);
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(buttonm);
       
        
        button9 = new JButton("9");
        button9.addActionListener(new NumberAction());
        dot = new JButton(".");
        dot.addActionListener(new NumberAction());
        
        buttond = new JButton("/");
        buttond.addActionListener(new solveAction());
        clear = new JButton("Clear");
        clear.addActionListener(new clearAction());
        panel2.add(button9);
        panel2.add(dot);
        panel2.add(clear);
        
        panel2.add(buttond);
        
        
        panel.add(panel1,BorderLayout.NORTH);
        
        
        
        panel.add(panel2,BorderLayout.CENTER);
        panel.add(panel3,BorderLayout.SOUTH);
        contentPane.add(panel);
        setVisible(true);
        setResizable(false);
    }
    class NumberAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String act = e.getActionCommand();
            
            if(act.equals("0"))
            {
                text1.setText(text1.getText()+"0");
                        
            }
            if(act.equals("1"))
            {
                text1.setText(text1.getText()+"1");
                        
            }
            if(act.equals("2"))
            {
                text1.setText(text1.getText()+"2");
                        
            }
            if(act.equals("3"))
            {
                text1.setText(text1.getText()+"3");
                        
            }
            if(act.equals("4"))
            {
                text1.setText(text1.getText()+"4");
                        
            }
            if(act.equals("5"))
            {
                text1.setText(text1.getText()+"5");
                        
            }
            if(act.equals("6"))
            {
                text1.setText(text1.getText()+"6");
                        
            }
            if(act.equals("7"))
            {
                text1.setText(text1.getText()+"7");
                        
            }
            if(act.equals("8"))
            {
                text1.setText(text1.getText()+"8");
                        
            }
            if(act.equals("9"))
            {
                text1.setText(text1.getText()+"9");
                        
            }
            if(act.equals("."))
            {
                int c =0;
                String str = text1.getText().trim();
                for(int i=0;i<str.length();++i)
                {
                    if(str.charAt(i)=='.')
                    c = c + 1;
                }
                if(c != 1)
                {
                    text1.setText(text1.getText()+".");
                }
            }
        }
    }
    

class exitAction implements ActionListener
{
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
}
class solveAction implements ActionListener
{
        public void actionPerformed(ActionEvent e)
        {
            String s = e.getActionCommand();
            
            
            if(s.equals("+"))
            {
                ++countp;
                if(countp == 1)
                first = Double.parseDouble(text1.getText().trim());
                else
                {
                second = Double.parseDouble(text1.getText().trim());
                third = second + first;
                text1.setText(third+"");
                }
                operand = "+";
                
            }
            if(s.equals("-"))
            {
                ++counts;
                if(counts == 1)
                first = Double.parseDouble(text1.getText().trim());
                else
                {
                second = Double.parseDouble(text1.getText().trim());
                third = second - first;
                text1.setText(third+"");
                }
                operand = "-";
            }
            if(s.equals("/"))
            {
                ++countd;
                if(countd == 1)
                first = Double.parseDouble(text1.getText().trim());
                else
                {
                second = Double.parseDouble(text1.getText().trim());
                third = second / first;
                text1.setText(third+"");
                }
                operand = "/";
            }
            if(s.equals("*"))
            {
                ++countm;
                if(countm == 1)
                first = Double.parseDouble(text1.getText().trim());
                else
                {
                second = Double.parseDouble(text1.getText().trim());
                third = second * first;
                text1.setText(third+"");
                }
                operand = "*";
            }
            
            
        }
}

class resultAction implements ActionListener
{
        public void actionPerformed(ActionEvent ee)
        {
            System.out.println("First is "+first);
            try{
                second = Double.parseDouble(text1.getText().trim());
                System.out.println("second is "+second);
                if(operand.equals("+"))
                third = first + second;
                if(operand.equals("-"))
                third = first - second;
                if(operand.equals("*"))
                third = first * second;
                if(operand.equals("/"))
                third = first / second;
                text1.setText(third+"");
            }catch(Exception e)
            {
                text1.setText("error");
            }
        }
}
class clearAction implements ActionListener
{
        public void actionPerformed(ActionEvent e)
        {
            text1.setText("0");
            first = second = third = 0.0;
            countp=0;
            counts=0;
            countm=0;
            countd=0;
        }
}
    final int WIDTH = 300,HEIGHT = 250;
    JButton button1,button2,button0,button3,button4,button5,button6,button7,button8,button9,buttonp,buttonm,buttons,buttond;
    JPanel panel,panel1,panel2,panel3;
    JButton clear,dot,equal;
    JTextField text1;
    double first=0.0,second=0.0,third=0.0;
    String operand;
    int countp=0,counts=0,countm=0,countd=0;
}