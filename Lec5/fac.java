package AtoZ.Lec5;

public class fac 
{
    static int facto(int i,int n)
    {
        if(n==i)
        return i;

        return( i *(facto(++i,n)));
    }

    public static void main(String args[])
    {
        int n=5;
        System.out.println(facto(1,n));
    }


}
