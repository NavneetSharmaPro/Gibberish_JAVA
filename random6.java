//Threading
class Hello9 extends Hello implements Runnable
{
    public void run()
        {
            System.out.println("Run() Invoked");
            System.out.println(Thread.currentThread());
        }
    public static void main(String[] args) 
    {
        Thread t=new Thread(new Hello9());
        t.start();
    }
}