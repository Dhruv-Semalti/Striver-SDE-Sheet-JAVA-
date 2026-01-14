import java.util.Arrays;
class Solution {
    
    public static void main(String args[])
    {
        int a[]={1, 2, 3, 6, 7, 5, 7};
        int s[]=new int[2];
        s=findMissingRepeatingNumbers(a);
        //print(a);
        print(s);
    }
    
    public static int[] findMissingRepeatingNumbers(int[] a) {
    long n=a.length;
    //s-sn
    //s2n-s2n
    long sum1=n*(n+1)/2;
    long sum2=n*(2*n+1)*(n+1)/6;
    
    long sum3=0;
    long sum4=0;
    for(int i=0;i<n;++i)
    {
        sum3+=a[i];
        sum4+=(long)a[i]*a[i];
    }
    
    long k=(sum4-sum2)/(sum3-sum1);//(X+Y)
           //(x^2-Y^2)/(X-Y)
    int s[]=new int[2];
    s[0]=(int)((k+(sum3-sum1))/2);//(X+Y)+(X-Y)
    s[1]=(int)(s[0]-(sum3-sum1));
        
        return s;
    }
public static void print(int a[])
{
    for(int i=0;i<a.length;++i)
    {
        System.out.print(a[i]);
    }
    System.out.println(" ");
}
}