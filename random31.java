import java.util.*;
class DataC
{
  public static void main(String[] args) {
    String h="India is a rich country";
    char c[]=h.toCharArray();
    int a =(int)(Math.random()*100);
    System.out.println("key:"+a);
    for(int i=0;i<c.length;i++)
    {
      System.out.print((char)((int)c[i]+a));
    }
  }
}
