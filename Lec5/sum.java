package AtoZ.Lec5;

    public class sum 
{
    static int sum(int i,int n)
    {
      if(i==n)
      return i;

      return( i+ sum(++i,n));
    }

    public static void main(String args[])
    {
        int n=5;
        int p=sum(0,n);
        System.out.println(p);
    }

}

