class h
{
    static int test()
    {
        return 10;
    }
    public static void main(String[] args) 
    {
        int i=10;
        System.out.println("1:"+i);
        i=i+test();
        System.out.println("2:"+i);
        System.out.println("3:"+test());
    }
}