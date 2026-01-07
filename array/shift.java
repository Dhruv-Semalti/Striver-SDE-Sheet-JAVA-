package AtoZ.array;

public class shift {
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

       // rightShift(a,n);
        //print(a,n);
        leftShift(a,n);
        print(a,n);
    

    }
    
    public static void print(int a[],int n)
    {
        for(int i=0;i<n;++i)
        {
            System.out.println(a[i]);
        }
    }
    
    public static void rightShift(int a[],int n)
    {
        int p=a[n-1];
       for(int i=n-2;i>=0;--i)
       {
           a[i+1]=a[i];
       }
       a[0]=p;
    }
    
    public static void leftShift(int a[],int n)
    {
        int p=a[0];
       for(int i=1;i<n;++i)
       {
           a[i-1]=a[i];
       }
       a[n-1]=p;
    }
    
}
}
