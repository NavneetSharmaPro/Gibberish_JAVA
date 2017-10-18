import java.util.Stack;
import java.io.file;
import java.io.IOException;
class a
{
    public static void main(String args[]) throws IOException
    {
        Stack q=new Stack();
        q.add(90);
    q.add("HelloWorld");
    q.add(951315463);
    q.add(90.4f);
    q.add("JSTC");
    q.add(new a());
    q.add(new Byte("101"));
    q.add(new File("E:\\A.txt"));

    for(int i=0;i<q.size(); )
    {
        System.out.println(q.pop());
    }
    }
}
