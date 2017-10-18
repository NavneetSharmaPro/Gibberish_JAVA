import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

class welcome extends JFrame/*In swing package*/implements ActionListener
{
  JPanel p1;
  JLabel l1,l2;
  JTextField t1,t2;
  JButton b1;
  welcome()
  {
    p1=new JPanel();
    l1=new JLabel("Enter your Name:");
    l2=new JLabel("Enter your surname:");
    t1=new JTextField(30);
    t2=new JTextField(30);
    b1=new JButton("Press to display your Name:");
    b1.addActionListener(this);
    p1.setBackground(Color.RED);
    l1.setForeground(Color.YELLOW);
    l2.setForeground(Color.YELLOW);
    this.add(p1);
    p1.add(l1);
    p1.add(t1);
    p1.add(l2);
    p1.add(t2);
    p1.add(b1);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to get the curser back to commandline.
}
  public void actionPerformed(ActionEvent E)
  {
    System.out.println(t1.getText());
    System.out.println(t2.getText());
  }
}
