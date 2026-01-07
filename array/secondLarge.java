import java.util.Scanner;

public class secondLargest
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

        int p=secondLargest(a,n);
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
    
    public static int secondLargest(int a[],int n)
    {
        int large1=a[0];
        int large2=a[0];
     for(int i=1;i<n;++i)
     {
       if(a[i]>large1)
       {
           large1=a[i];
       }
       else if(a[i]>large2)
       {
           large2=a[i];
       }
     }
     return large2;
    }
    
}