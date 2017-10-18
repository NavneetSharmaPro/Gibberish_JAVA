class b
{
  static final int a=test();
  static int test()
  {
    try
    {
      System.out.println("hello");
      throw new Exception();
    }
    catch(Exception e)
    {
      return 45;
    }
    finally
    {
      return 78;
    }
  }
  public static void main(String... v)
  {

    int a =B.a;// error
    System.out.println("a:"+a);
    System.out.println("a:"+(++a));
    System.out.println("a:"+(a++));
  }
}
