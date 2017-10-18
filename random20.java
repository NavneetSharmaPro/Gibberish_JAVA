abstract class k
{
  abstract void test();
  void show()
  {
    System.out.println("show invoked");
  }
}
class h
{
  public static void main(String[] args)
  {
    k o=new k()
    {
      void test()
      {
        show();
        System.out.println("Navneet");
      }
    };
    k obj=new k()
    {
      void test()
      {
        show();
        System.out.println("Priyanka");
      }
    };
    k obj2=new k()
    {
      void test()
      {
        show();
        System.out.println("Shazad");
      }
    };
    k obj3=new k()
    {
      void test()
      {
        show();
        System.out.println("nikhil");
      }
    };
    o.test();
    obj.test();
    obj2.test();
    obj3.test();
  }
}
