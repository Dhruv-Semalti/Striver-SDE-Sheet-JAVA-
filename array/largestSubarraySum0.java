import java.util.*;
class Solution {
    public static void main(String args[])
    {
        int arr[]={2,10,4};
        System.out.println(maxLen(arr));
    }
    public static int maxLen(int[] arr) {
        // Your code goes here
        Map<Integer,Integer> pre=new HashMap<>();
        int len=arr.length;
        int sum=0;
        int max=0;
        for(int i=0;i<len;++i)
        {
            sum=sum+arr[i];
            if(sum==0)
            {
                max=i+1;
            }
            else
            {
            if(pre.containsKey(sum))
            {
                int k=(i-pre.get(sum));
                max=Math.max(k,max);
               
            }
            else
            {
                pre.put(sum,i);
            }
        }
        }
        return max;
    }
}
