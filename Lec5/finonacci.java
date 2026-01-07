package AtoZ.Lec5;

public class finonacci {

   public class finonacci {

    static int fib(int n)
    {
        if(n==1)
        return 1;
        
        if(n==0)
        return 0;
        return(fib(n-1)+fib(n-2));
    }

    public static void main(String args[])
    {
       int n=5;
       int p=fib(n);
       System.out.println(p);
    }
    
    
}
    
}
