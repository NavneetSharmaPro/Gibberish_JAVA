import java.io.*;
import java.util.*;

class hello
{
  public static void main(String[] args) {
    try
    {
      Stack s=new Stack();
      FileReader fr = new FileReader("C://Users/Navneet/Documents/Java/Navneet.txt");
      BufferedReader br = new BufferedReader(fr);
      String k=null;
      while((k=br.readLine())!=null)
      {
        s.push(k);
      }
      for(int i=0;i<s.size();)
      {
        System.out.println(s.pop());
      }
    }
    catch(Exception e) {}
  }
}
