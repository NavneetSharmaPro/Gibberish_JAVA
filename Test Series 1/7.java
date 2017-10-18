class f
{
  static int i=test1();
  static int test1()
  {
    System.out.println("@");
    test2();
    System.out.println("$");
    return 5;
  }
  static void test2()
  {
    System.out.println("#");
    main(null);
    System.out.println("&");
  }
  static
  {
    System.out.println(1+":"+i);
    i=20;
    main(null);
    System.out.println(2+":"+i);
  }
  public static void main(String[] args)
  {
    System.out.println(7+":"+i);
    i=30;
  }
}
/*@
#
7:0
&
$
1:5
7:20
2:30
7:30
*/
