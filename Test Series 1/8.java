abstract class a
{
  int a=30;
}
class b
{
  public static void main(String[] args) {
    a o=new a(){};
    System.out.println("a:"+o.a);
  }
}
