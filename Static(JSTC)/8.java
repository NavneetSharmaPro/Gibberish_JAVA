class e
{
    public static void main(String[] args) 
    {
        int i=10;
        test(10); //(10,20) was an error
        System.out.println("Done");        
    }
    static void test(int k)
    {
        System.out.println("from test:"+k);
    }
}