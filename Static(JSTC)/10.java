class g
{
    public static void main(String[] args) {
        int i=10;
        System.out.println("main1:"+i);
        test(i);
        System.out.println("main2:"+i);
    }
    static void test(int i)
    {
        i=20;
    }
}