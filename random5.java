//Threading

class a
{
  public void run()
  {
    for(int i=0;i<10;i++)
    {
      System.out.println("Student:"+i);
    }
  }
  public static void main(String[] args) {
    a o=new a();
    o.run();
    for(int j=0;j<100;j++)
    {
      System.out.println("JSTC:"+j);
    }
  }
}
