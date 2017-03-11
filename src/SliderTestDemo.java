import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class SliderTestDemo {
    public static void main(String args[])
    {
        try{
            SwingUtilities.invokeAndWait(new Runnable(){
                public void run(){
                new SliderTest();
                }
            });
        }catch(Exception e)
        {
            System.out.println("This class can not be loaded because of "+e);
        }
    }
}
class SliderTest extends JFrame
{
    SliderTest()
    {
        setTitle("Slider Test Demo");
        setLocation(300,200);
        setSize(WIDTH,HEIGHT);
        Container contentPane = getContentPane();
        panel = new JPanel();
        slider1 = new JSlider(JSlider.HORIZONTAL,0,255,1);
        slider1.addChangeListener(new ChangeListener() {
         public void stateChanged(ChangeEvent e) {
            R = ((JSlider)e.getSource()).getValue();
            panel.setBackground(new Color(R,G,B));
           repaint();
         }
      });
        slider2 = new JSlider(JSlider.HORIZONTAL,0,255,1);
        slider2.addChangeListener(new ChangeListener() {
         public void stateChanged(ChangeEvent e) {
            G = ((JSlider)e.getSource()).getValue();
            panel.setBackground(new Color(R,G,B));
            repaint();
         }
      });
        slider3 = new JSlider(JSlider.HORIZONTAL,0,255,1);
        slider3.addChangeListener(new ChangeListener() {
         public void stateChanged(ChangeEvent e) {
            B = ((JSlider)e.getSource()).getValue();
            panel.setBackground(new Color(R,G,B));
            repaint();
         }
      });
        panel.add(slider1);
        panel.add(slider2);
        panel.add(slider3);
        contentPane.add(panel);
        setVisible(true);
    }
    JPanel panel;
    JSlider slider1,slider2,slider3;
    final int WIDTH = 400,HEIGHT = 400;
    int R=0,G=0,B=0;
}