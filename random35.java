class hello
{
  final int a=test();
  int test()
  //test is not static, thus it can store values from multiple return statements(one overwriting the other)
  {
    try
    {
      int a1=10;
      int b=0;
      int c=a1/b; //1: throws ArithmeticException
      throw new Exception();//2: force calls Exception
    }
    catch(ArithmeticException e)
    {
      return 89;//case 1: test() gets 89
    }
    catch(Exception e)
    {
      return 99;//case 2: test() gets the value 99 overwriting 89 with 99
    }
    finally
    {
      return 109;//case 3: it gets executed anyway ultimately overwriting all the previous values in test()
    }
  }
  public static void main(String[] args)
  {
    hello o=new hello();
    System.out.println("a:"+o.a);
  }
}
