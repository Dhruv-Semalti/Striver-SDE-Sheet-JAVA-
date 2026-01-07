import java.util.*;

public class Solution
{
    public static void main(String args[])
    {
        int a[]={1,2,3,1,1,1,1,3,4};
        int k=6;
        int p=longestSub(a,k);
        System.out.println(p);
    }
    
    
    public static int longestSub(int a[],int k)
    {
        int right=0;
        int left=0;
        long sum=0;
        int max=0;
        while(right<a.length)
        {
            sum=sum+a[right];
            while( left<=right && sum>k)
            {
                sum=sum-a[left];
                ++left;
            }
            if(sum==k)
            {
                max=Math.max(max,right-left+1);
            }
           ++right;
            //System.out.println(max);
        }
        return max;
    }
}