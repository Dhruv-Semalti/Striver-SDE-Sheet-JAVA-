import java.util.Scanner;

public class quick
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
        int p=0;
        int r=n-1;
        quickSort(a,p,r);
        print(a,n);

    }
    
    public static void print(int a[],int n)
    {
        for(int i=0;i<n;++i)
        {
            System.out.println(a[i]);
        }
    }

    public static int partition(int a[],int p,int r)
    {
        int x=a[r];
        int i=p-1;
        for(int j=p;j<=r-1;++j)
        {
            if(a[j]<=x)
            {
                i=i+1;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            int temp=a[i+1];
            a[i+1]=a[r];
            a[r]=temp;
        }
        return i+1;
    }
    
    public static void quickSort(int a[],int p,int r)
    {
       if(p>r)
        return;
       q=partition(a,p,r);
       partition(a,p,q-1);
       partition(a,q+1,r);
    }
    
}