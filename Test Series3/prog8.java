class a2 implements Cloneable
{
  int v1;
  public Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }
}
public class prog8
{
  public static void main(String[] args) throws CloneNotSupportedException
  {
      a2 o=new a2();
      o.v1=100;
      a2 obj=(a2)o.clone();
      System.out.println(obj.v1);
      obj.v1=220;
      System.out.println(o.v1);
      System.out.println(obj.v1);

  }
}
