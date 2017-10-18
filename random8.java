public class random8 extends Thread
{
  public void run()
  {
    for(int i=0;i<1000;i++)
    {
      System.out.println("Hello:"+i);
    }
  }
  public static void main(String[] args) throws Exception
  {
    random8 o=new random8();
    o.start();
    Thread.sleep(50);
    o.suspend();
    for(int i=0;i<100;i++)
    {
      System.out.println("JSTC:"+i);
    }
    o.resume();
  }
}
