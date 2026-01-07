import java.util.Scanner;

public class selectionSort
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
    
    public static void selection(int a[],int n)
    {
      for(int i=0;i<n;++i)
      {
        int min=i;
        for(int j=(i+1);j<n;++j)
        {
            if(a[j]<a[min])
            {
                int temp=a[j];
                a[j]=a[min];
                a[min]=temp;
            }
        }
      }
    }
    
}