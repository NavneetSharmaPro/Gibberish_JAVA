//import java.util.Set;
//import java.util.HashSet;
/*import java.util.List;
import java.util.LinkedList;*/
import java.util.Map;
import java.util.HashMap;
class k7
{
  public static void main(String[] args) {
    //Set obj=new HashSet();
    //List obj=new LinkedList();
    /*obj.add(new Long("879799795445484"));
    obj.add(new Long("879797979544516"));
    obj.add(new Long("879797979544526"));
    obj.add(new Long("879797979544536"));
    obj.add(new Long("879797979544546"));
    obj.add(new Long("872797979544576"));
    obj.add("Sugandh");
    obj.add("prince");
    obj.add("prince");
    obj.add("raja eating nails");
    obj.add("nikhil");
    obj.add("Abhinav");
    obj.add("prince");
    obj.add("Abhishek");
    obj.add("navneet");*/
    Map obj=new HashMap();
    obj.put(new Integer(8900),new Object[]{"rahul","chourasia",21,"male","3-10-1995"});
    obj.put(new Integer(8901),new Object[]{"nikhil","chotu",18,"male","3-10-1997"});
    obj.put(new Integer(8902),new Object[]{"Sugandh","raj",21,"female","3-10-1995"});
    Object o[]=(Object[]) obj.get(8901);
    System.out.println("name:"+o[0]);
    System.out.println("surname:"+o[1]);
    System.out.println("age:"+o[2]);
    System.out.println("gender:"+o[3]);
    System.out.println("dob:"+o[4]);
  }
}
