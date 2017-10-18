class h99 implements Runnable
{
  public void run()
  {
    for(int i=0;i<20;i++)
    {
      System.out.println("Hello:"+i);
    }
  }
}
class h100
{
  public static void main(String[] args) {
    h99 o=new h99();
    Thread th=new Thread(o);
    th.start();
  }
}
