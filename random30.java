class DataC
{
  public static void main(String[] args) {
    Integer a=Integer.parseInt(args[0]); //to directly take a value without scanner class.
    int b=a;//implicit conversion. //auto unboxing
    //char c=b; //loosy conversion
    char c=(char)b;//explicit casting
    System.out.println("c:"+c);
  }
}
