class i
{
    public static void main(String[] args) {
        int i=0;
        int j=i++ + test1(i++)+test2(++i);
        System.out.println("value of i:"+i);
        /*System.out.println(i++);
        System.out.println(test1(i++));
        System.out.println((test2(++i)));*/
        System.out.println("value of j:"+j);
    }
    static int test1(int i)
    {
        System.out.println("i in test1:"+i);
        return ++i;
    }
    static int test2(int i)
    {
        System.out.println("i in test2:"+i);
        return i++;
    }
}