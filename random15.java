import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;
class hello
{

  public static void main(String[] args)
  {
    Map o=new HashMap();// accepts Null and double not allowed
    //Hashtable o=new Hashtable();//doesn't accepts null
    o.put(1,"Niraj");
    o.put(1,"Shubham");
    o.put(2,"Rishi");
    o.put(1,"Amit");
    o.put(2,"Mohit");
    o.put(3,"Akash");
    o.put(1,"Ankit");
    o.put(2,"Pratik");
    o.put(4,"Navneet");
    o.put(null,"JSTC");
    o.put(5,null);

    System.out.println("o :"+o);
  }
}
