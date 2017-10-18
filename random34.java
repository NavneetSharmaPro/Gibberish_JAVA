import java.io.*;
class j1
{
  public static void main(String[] args) throws IOException
  //throws to bypass the appropriate expeption(IOException) in this case
  {
    try
    {
      File f=new File("C://Users/Navneet/Documents/Java/x.txt");
      f.createNewFile();
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c=a/b;
      System.out.println("c:"+c);
      //System.exit(1); // terminated everything
      throw new InterruptedException();//give a forced call to the exception
    }
    catch(NumberFormatException nfe)
    {
      System.out.println("Please enter Integer value");
    }
    catch(ArrayIndexOutOfBoundsException aiobe)
    //catch(...)
    {
      System.out.println("Please Enter Something!");
    }
    catch(ArithmeticException ae)
    {
      System.out.println("Please do not enter second value as 0");
    }
    catch(InterruptedException ie)
    {
      System.out.println("Navneet is sleeping in the class");
    }
    finally
    {
      System.out.println("I will always Execute");
    }


  }
}
