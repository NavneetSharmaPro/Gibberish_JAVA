abstract class A
//Even if one abstract method found the class name should be proceeded with abstract keyword
{
  int a=10;
  abstract void test();
  //only declaration but no defination so function should be initiated with abstract keyword
  static abstract void show();
  //Staic and abstract does not work together
  //illegal combination of modifiers
}

class B extends A
{
  int a=20;
  void test()
  {
    int a=this.a+super.a;
    System.out.println("test-invoked");
    System.out.println("a:"+a);
  }
  void show()
  {
    System.out.println("show-invoked");
  }
  public static void main(String[] args) {
    A obj=new B();
    obj.test();
    obj.show();
  }
}
