interface p
{
  void test(); //public and abstract by default
}
abstract class abc
{
  abstract void test2(); //must be abstract
}
class xyz extends abc implements p
{
  public void test()
  {
    System.out.println("test invoked");
  }
  void test2()
  {
    System.out.println("test2 invoked");
  }
  public static void main(String[] args) {
    new xyz().test();
    System.out.println("HelloWorld");
  }
}
