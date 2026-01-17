class Solution {
    public int search(int[] a, int target) {
    int low=0;
    int high=a.length-1;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(a[mid]==target)
        return mid;
        if(a[low]<=a[mid]) // for left to be sorted
        {
            if(target<a[mid]&& target>=a[low])
            {
              high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        else // if left is not sorted right is sorted
        {
           if(target>a[mid] && target<=a[high])
           {
              low=mid+1;
           }
           else
           high=mid-1;
        }
    }
    return -1;
    }
}