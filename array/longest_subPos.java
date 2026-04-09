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
        Map<Long,Integer> prefix=new HashMap<>();
        int len=a.length;
        long sum=0;
   
        int max=0;
        for(int i=0;i<len;++i)
        {
            sum=sum+a[i];
           // a.put(sum,i);
            if(sum==k)
            max=Math.max(max,i+1);
            
            long rem=sum-k;
            if(prefix.containsKey(rem))
            {
                max=Math.max(max,(i-prefix.get(rem)));
                
            }
            else
            {
                prefix.put(sum,i);
            }
            
        }
        return max;
        
        
    }
}
