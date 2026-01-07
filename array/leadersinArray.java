import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
      int nums[]={-3,4,5,1,-4,-5};
      leaders(nums);
    }
    
    public static List<Integer> leaders(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        int len=nums.length;
        int max=nums[len-1];
        a.add(max);
        for(int j=len-2;j>=0;--j)
        {
            if(nums[j]>max)
            {
                max=nums[j];
                a.add(nums[j]);
            }
        }
        Collections.reverse(a);
        System.out.println(a);
        return a;
    }
}