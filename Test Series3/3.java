import java.util.Arrays;
class prog
{
  public static void main(String[] args) {
    int[] values=new int[10];
    Arrays.fill(values,10);
    for(int value:values)
    {
      System.out.println(value);
      System.out.println(' ');
    }
  }
}
