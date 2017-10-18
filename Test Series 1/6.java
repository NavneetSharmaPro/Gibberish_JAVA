import static java.lang.System.*;
class index
{
  static index test()
  {
    out.println("test invoked");
    return new index();
  }
  {
    out.println("mywork");
  }
  public static void main(String[] args)
  {
    out.println("start up");
  }
  static
  {
    test();
    out.println("sunday is fun day");
    main(null);
  }
}
