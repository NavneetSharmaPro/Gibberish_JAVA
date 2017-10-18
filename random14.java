import java.io.*;
import java.util.*;
class h2
{
  public static void main(String[] args) throws Exception
  {
    Scanner sc=new Scanner(System.in);
    FileReader fr=new FileReader("C://Users/Navneet/Documents/Java/navneet.txt");
    BufferedReader br=new BufferedReader(fr);
    FileReader fr2=new FileReader("C://Users/Navneet/Documents/Java/sharma.txt");
    BufferedReader br2=new BufferedReader(fr2);

    Map o=new HashMap();

    String a=null,b=null;
    while(((a=br.readLine())!=null)&&(b=br2.readLine())!=null)
    {
      o.put(a,b);
    }
    br.close();
    fr.close();
    br2.close();
    fr2.close();
    System.out.println("Enter Name: ");
    String h1=sc.next();
    System.out.println(o.get(h1));
  }
}
