import java.io.*;
import java.util.*;
class h2
{
  public static void main(String[] args) throws Exception
  {
    FileReader fr=new FileReader("E://navneet.txt");
    BufferedReader br=new BufferedReader(fr);
    String a=null;
    Set o=new HashSet();
    Set x=new TreeSet();
    List ob=new LinkedList();
    //x.add(new Integer(4)); //Throws exception
    while((a=br.readLine())!=null)
    {
      o.add(a);
      ob.add(a);
      x.add(a);
    }
    br.close();
    fr.close();
    System.out.println("Set: "+o);
    System.out.println("List: "+ob);
    System.out.println("Tree: "+x); //is taking all data as string thats why showing all of them
  }
}
