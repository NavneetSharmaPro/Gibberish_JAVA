import java.util.Hashtable;
import static java.lang.System.*;
class Index extends Thread
{
  public static void main(String[] args) {
    Hashtable t=new Hashtable();
    t.put("ram","shyam");
    t.put("amit","sumit");
    t.put("reeta","sita");
    out.println(t);
  }
}
