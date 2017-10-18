interface a
{
  void test();
  int a=90;
}
interface b extends a
{
  void test();
  int a=99;
}
class c implements b,a
{
  public void test()
  {
    System.out.println("test()");
  }
  /*public void test2()
  {
    System.out.println("test2()");
  }*/
  public static void main(String[] args) {
    /*b o=new c();
    o.test();
    o.test2();*/
    a o=new c();
    o.test();
    b o2=new c();
    o2.test();
    System.out.println("A a:"+a.a);
    System.out.println("B a:"+b.a);
  }
}
