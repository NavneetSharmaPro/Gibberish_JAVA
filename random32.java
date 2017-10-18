import java.util.Scanner;
class DataR
{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the encrypted data");
    String a=s.nextLine();
    System.out.println("Enter the key:");
    int b=s.nextInt();
    char c[]=a.toCharArray();
    for(int i=0;i<c.length;i++)
    {
      System.out.print((char)((int)c[i]-b));
    }
  }
}
