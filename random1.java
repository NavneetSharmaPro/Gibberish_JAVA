import java.util.Stack;
class value1
{
    public static void main(String[] args) 
    {
        Stack o=new Stack();
        o.push("Abhinav");
        o.push(20);
        o.push("Ankit");
        o.push(19);
        o.push("prateek");
        for(int i=0;i<o.size();)
        {
            System.out.println(o.pop());
        }
    }
}