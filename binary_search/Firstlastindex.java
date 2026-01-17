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

    public int[] searchRange(int[] nums, int target) {
        int a=lowerBound(nums,target);
        int s[]=new int[2];
        int b=upperBound(nums,target);
        if(a==nums.length || nums[a]!=target)
        {
           s[0]=-1;
           s[1]=-1;
           return s;
        }
        
        s[0]=a;
        //if(nums.length!=1)
        s[1]=b-1;
        return s;
        
    }
}