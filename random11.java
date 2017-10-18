import java.util.Set;
import java.util.HashSet;
class h2
{
  public static void main(String[] args) {
    Set o=new HashSet(); //HashSet Does not allow duplicacy
    //Set=Interface
    o.add("Navneet");
    o.add("Ankit");
    o.add("Rishi");
    o.add("Mohit");
    o.add("Navneet");
    o.add("Navneet");
    o.add("Amit");
    o.add(27);
    o.add(20);
    o.add(21);
    o.add(20);
    o.add(21);
    o.add(22);
    System.out.println(o);
  }
}
