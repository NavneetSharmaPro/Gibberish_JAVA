class Index extends Thread
{
  public void run()
  {
    System.out.println("Thread Invoked");
  }
  public static void main(String[] args) {
    System.out.println("Hello World");
    Index o=new Index();
    o.start();
    o.start();
  }
}
