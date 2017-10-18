import java.util.*;
class h1
{
  public static void main(String[] args)
  {
    Object a=null;
    Map<Object,Object> o=new HashMap<>();
    o.put("0177CS151094","Navneet Sharma");
    o.put("0177CS151098","Nikhil Singh");
    o.put("0177CS151074","Kundan Chowrasia");
    o.put("0177CS151073","Kunal Tiwari");
    o.put("0177CS151006","Abhishek Pandey");
    o.put("0177CS151059","Sugandh Raj Trivedi");
    o.put("0177CS151104","Pankaj Soni");
    o.put(null,"Dead Man");

    Map<Object,Object> o1=new HashMap<>();
    o1.put("0177CS151094","Pan001");
    o1.put("0177CS151098","Pan002");
    o1.put("0177CS151074","Pan003");
    o1.put("0177CS151073","Pan004");
    o1.put("0177CS151006","Pan005");
    o1.put("0177CS151059","Pan006");
    o1.put("0177CS151104","Pan007");
    o1.put(null,"pan009");

    Map<Object,Object> m=new HashMap<>();
    m.put(1,o);
    m.put(2,o1);
    Map k=(Map)m.get(1);
    Map k2=(Map)m.get(2);
    System.out.println(k.get("0177CS151094"));
    System.out.println(k2.get("0177CS151104"));
  }
}
