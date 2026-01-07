import java.util.Scanner;

public class sortedCheck
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;++i)
        {
            System.out.println("Enter the digit");
            a[i]=sc.nextInt();
        }

        boolean p=sortedCheck(a,n);
       // print(a,n);
        System.out.println(p);

    }
    
    public static void print(int a[],int n)
    {
        for(int i=0;i<n;++i)
        {
            System.out.println(a[i]);
        }
    }
    
    public static boolean sortedCheck(int a[],int n)
    {
        int flag=0;
        for(int i=0;i<n-1;++i)
        {
          if(a[i]>a[i+1])
           {
              return false;
            }
        }
        return true;
    }
    
}