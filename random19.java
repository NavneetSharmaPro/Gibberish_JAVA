abstract class A
{
  void show()
  {
    System.out.println("Show-invoked");
  }
  abstract void test();
}
class B
{
  A test()
  {
    System.out.println("test()-invoked");
    return new A()
    {
      void test()
      {
        show();
        System.out.println("My work is too important");
      }
    };
  }
  public static void main(String[] args) {
     new B().test().test();
  }
}
