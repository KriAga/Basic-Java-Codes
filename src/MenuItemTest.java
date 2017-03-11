import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class MenuItemTest {
    public static void main(String args[])
    {
        MenuItemDemo obj = new MenuItemDemo();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MenuItemDemo extends JFrame
{

    MenuItemDemo()
    {
        setTitle("MenuItem Test");
        setLocation(300,200);
        setSize(WIDTH,HEIGHT);
        Container contentPane = getContentPane();
        menu = new JMenu("File");
        menu.setMnemonic('F');
        JMenuItem open = new JMenuItem("Open");
        menu.add(open);
        
        menu.addSeparator();
        JMenuItem save = new JMenuItem("Save");
        menu.add(save);
        menu.addSeparator();
        JMenuItem saveAs = new JMenuItem("SaveAs");
        menu.add(saveAs);
        menu.addSeparator();

        JMenuItem exit = new JMenuItem("Exit");
        menu.add(exit);

        exit.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
            {
               dispose();
           }
        });



        menu1 = new JMenu("Edit");
        menu1.setMnemonic('E');
        JMenuItem cut = new JMenuItem("Cut");
        menu1.add(cut);
        menu1.addSeparator();
        JMenuItem copy = new JMenuItem("Copy");
        menu1.add(copy);
        menu1.addSeparator();
        JMenuItem paste = new JMenuItem("Paste");
        menu1.add(paste);
        menu1.addSeparator();

        menuBar = new JMenuBar();
        menuBar.add(menu);
        menuBar.add(menu1);
        setJMenuBar(menuBar);


        popup = new JPopupMenu();
        JMenuItem close = new JMenuItem("Close");
        close.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
            {
               dispose();
           }
        });

        JMenuItem hide = new JMenuItem("Hide");
        popup.add(close);
        popup.add(hide);

        

        getContentPane().addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent event)
            {                 
                popup.show(event.getComponent(), event.getX(), event.getY());
            }
        });


        setVisible(true);
    }
    final int WIDTH = 400,HEIGHT = 400;
    JPanel panel;
    JMenu menu,menu1;
    JMenuBar menuBar;
    private JPopupMenu popup;
}