class h101
{
  public static void main(String[] args) {
    Runnable r1=new Runnable()
    {
      public void run()
      {
        for(int i=0;i<5;i++)
        {
          System.out.println("Molly:"+i);
        }
      }
    };
    Runnable r2=new Runnable()
    {
      public void run()
      {
        for(int i=0;i<5;i++)
        {
          System.out.println("Neha:"+i);
        }
      }
    };
    Thread th=new Thread(r1);
    th.start();
    Thread th2=new Thread(r2);
    th2.start();
  }
}
