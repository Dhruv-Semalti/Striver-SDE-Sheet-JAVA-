import java.util.Scanner;

public class insertion
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

        selection(a,n);
        print(a,n);

    }
    
    public static void print(int a[],int n)
    {
        for(int i=0;i<n;++i)
        {
            System.out.println(a[i]);
        }
    }
    
    public static void insertion(int a[],int n)
    {
     for(int i=1;i<n;++i)
     {
       int key=a[i];
       int j=i-1;
       while(j>=0 && key<a[j])
       {
          a[j+1]=a[j];
          j=j-1;
       }
       a[j+1]=key;
     }
    }
    
}