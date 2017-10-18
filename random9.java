class cmd
{
  public static void main(String[] args)
  {
    String a =args[0];
    Integer g=new Integer(a);
    int c=g; //auto unboxing
    System.out.println("Value of c: "+c);
    float d=c; //implicit casting
    System.out.println(d);
    d=d+0.9098f;// by defaultdouble, f=float
    System.out.println(d);
    int e=(int)d;//explicit unboxing
    System.out.println(e);
    }
}
