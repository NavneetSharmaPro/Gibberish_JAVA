//import java.util.synchronized;
class Account
{
  synchronized void debit()
  {
    for(int i=0;i<100;i++)
    {
      System.out.println(Thread.currentThread()+" : "+i);
    }
  }
}

class Atm extends Thread
{
  Account ac;
  Atm(Account ac)
  {
    this.ac=ac;
  }
  public void run()
  {
    ac.debit();
  }
}
class Atm2 extends Thread
{
  Account ac;
  Atm2(Account ac)
  {
    this.ac=ac;
  }
  //@override
  public void run()
  {
    ac.debit();
  }
}
public class Customer//Public class so the name of the file should be same as public class name containing main();
{
  public static void main(String[] args) {
    Account ac= new Account();
    Atm atm1=new Atm(ac);
    Atm2 atm2=new Atm2(ac);
    atm1.start();
    atm2.start();
  }
}
