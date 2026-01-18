class Solution {

    public static boolean divide(int a[],int mid,int threshold)
    {
        long total=0;
        for(int i=0;i<a.length;++i)
        {
            total += (a[i] + mid - 1) / mid;
            if(total>threshold)
            return false;
        }
        return true;
    }

    public int smallestDivisor(int[] a, int threshold) {
       
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
            if(divide(a,mid,threshold))
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
// whenevr u wanna make ur code more efficnet use
// total += (a[i] + mid - 1) / mid; than Math.ceil