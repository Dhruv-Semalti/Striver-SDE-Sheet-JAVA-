class Solution {

     public static int lowerBound(int a[],int x)
    {
        int low=0;
        int high=a.length-1;
        int ans=a.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(x<=a[mid])
            {
               high=mid-1;
                ans=mid;
            }
            else
            {
               low=mid+1;
            }
        }
        return ans;
    }

     public static int upperBound(int a[],int x)
    {
        int low=0;
        int high=a.length-1;
        int ans=a.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(x<a[mid])
            {
               high=mid-1;
                ans=mid;
            }
            else
            {
               low=mid+1;
            }
        }
        return ans;
    }

    public int countOccurrences(int[] nums, int target) {
        // Your code goes here
        int a=lowerBound(nums,target);
        
        int b=upperBound(nums,target);
        if(a==nums.length || nums[a]!=target)
        {
            
           return 0;
        }
        
        return (b-a);
    }
}
