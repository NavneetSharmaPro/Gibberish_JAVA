import java.util.Scanner;
class login2
{
  public static void main(String[] args)
  {
    welcome2 o=new welcome2();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Name:");
    String name=sc.next();
    System.out.println("Enter your Surame:");
    String surname=sc.next();
    o.l1.setText(name);
    o.l2.setText(surname);
    o.setVisible(true);
  }
}
