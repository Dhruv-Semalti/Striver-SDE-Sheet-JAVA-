class Solution {
    public int findPeakElement(int[] a) {
        int low=0;
        int high=a.length-1;
        if(a.length==1)
        {
            return 0;
        }
        if(a[0]>a[1]) return 0;
        if(a[high]>a[high-1]) return high;

        low=1;
        high=a.length-2;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
            {
                return mid;
            }
            else if(a[mid]>a[mid-1])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }
        return -1;
    }
}