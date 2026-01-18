class Solution {

    public static int time(int a[],int s,int h)
    {
        long total=0;
        for(int i=0;i<a.length;++i)
        {
            total+=Math.ceil(a[i]/(s*1.0));

        }
        return (int)total;
    }

    public int minEatingSpeed(int[] a, int h) {
        int max=a[0];
        for(int i=0;i<a.length;++i)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }

        int low=1;
        int high=max;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(time(a,mid)<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}

// for better speed use someting else than Math.ceil
// have an early exit let the function just greater or less leave the vlaue
