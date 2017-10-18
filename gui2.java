import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class welcome2 extends JFrame //implements ActionListener
{
  JPanel p1;
  JLabel l1,l2;
  welcome2()
  {
    p1=new JPanel();
    l1=new JLabel("Enter your Name:");
    l2=new JLabel("Enter your surname:");
    this.add(p1);
    p1.setBackground(Color.RED);
    l1.setForeground(Color.YELLOW);
    l2.setForeground(Color.YELLOW);
    p1.add(l1);
    p1.add(l2);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
