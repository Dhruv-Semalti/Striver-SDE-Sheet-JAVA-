public class Happy
{
    
    static void recursion(int i,int n)
    {
        if(i==n)
        return;
        
        System.out.println(i);
        recursion(i+1,n);
    }
    
    public static void main(String args[])
    {
        
        recursion(1,5);
    }
}