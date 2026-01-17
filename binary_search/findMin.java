class Solution {
    public int findMin(int[] a) {
        int low=0;
        int high=a.length-1;
        int mid=low+(high-low)/2;
        int min=a[mid];
        while(low<=high)
        {
            mid=low+(high-low)/2;

           if(a[low]<=a[mid])
           {
             if(a[low]<min)
            {
              min=a[low];
            }
              low=mid+1;
           }
           else
           {
              if(a[mid]<min)
              {
                min=a[mid];
              }
              high=mid-1;
           }
        }

        return min;
    }
}