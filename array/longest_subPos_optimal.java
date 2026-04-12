// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1, 1};
        long k = 3;
        System.out.println("Longest subarray length is: " + Solution(a, k));
    }
    
    public static int Solution(int a[],long k)
    {
      int left=0;
      int right=0;
      int len=a.length;
      long sum=0;
      int max=0;
      while(right<len)
      {
        
        while(sum>k && left<=right)
        {
            sum=sum-a[left];
            ++left;
        }
        if(sum==k)
        {
            max=Math.max(max,right-left+1);
        }
        right++;
        if(right<len)
        {
            sum=sum+a[right];
        
        }
       
      }
      return max;
        
    }
}
