import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class h7 extends JFrame implements ActionListener
{
  HashMap hm=new HashMap();
  JPanel p1;
  JTextField t1,t2;
  JLabel o1,o2;
  JButton b1;

  h7()
  {
    p1=new JPanel();
    t1=new JTextField(30);
    t2=new JTextField(30);
    o1=new JLabel("Key");
    o2=new JLabel("Value");
    b1=new JButton("Insert");

    this.add(p1);
    b1.addActionListener(this);
    p1.add(o1);
    p1.add(t1);
    p1.add(o2);
    p1.add(t2);
    p1.add(b1);
    this.setSize(500,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e)
  {
    hm.put(t1.getText(),t2.getText());
    t1.setText(null);
    t2.setText(null);
  }
  public static void main(String[] args)
  {
    h7 o=new h7();
    o.setVisible(true);
    String c=null;
    Scanner sc=new Scanner(System.in);
    do
    {
      System.out.println("Search The key:");
      String a = sc.next();
      System.out.println("your search output : "+o.hm.get(a));
      System.out.println("Do you want to continue y/n");
      c=sc.next();
    } while (c.equalsIgnoreCase("y"));
  }
}
