class base
{
  public void print()
  {
    System.out.println("base");
  }
}
class derived extends base
{
  public void print()
  {
    System.out.println("derived");
  }
}

class main
{
  public static void doprint(base o)
  {
    o.print();
  }
  public static void main(String[] args)
  {
    base x =new base();
    base y=new derived();
    derived z=new derived();
    doprint(x);
    doprint(y);
    doprint(z);
  }
}
//base
//derived
//derived
