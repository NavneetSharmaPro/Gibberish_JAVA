import java.util.*;
class h9
{
  public static void main(String[] args) {
    Set o=new HashSet();
    //Set<Object> o=new HashSet<>();
    o.add(1);
    o.add(2);
    o.add(3);
    o.add(4);
    o.add(5);
    o.add("Pankaj");

    Set m=new HashSet(o);
    m.add("Pankaj");
    m.add(3);
    m.add(4);
    Set r=new HashSet(m);
    r.add(20.6f);

    System.out.println(r);

  }
}
