/** Static Block executes 1st regardless of main method
 * Static Doesn't needs an instance to be created
 * They are compiled in sequence i.e. top to bottom approach*/

class b
{
    static
    {
        System.out.println("Static Block 1");
    }

    public static void main(String[] args) 
    {
        System.out.println("HelloWorld");        
    }

    static
    {
       System.out.println("Static Block 2"); 
    }
}