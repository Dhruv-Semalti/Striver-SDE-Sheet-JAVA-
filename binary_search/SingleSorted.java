class Solution {
    public int singleNonDuplicate(int[] a) {
     
     
        int len=a.length;
        if(len==1)
        return a[0];
        if(a[0]!=a[1]) return a[0];
        if(a[len-1]!=a[len-2]) return a[len-1];

        int low=1;
        int high=len-2;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]!=a[mid-1] && a[mid]!=a[mid+1])
            {
                return a[mid];
            }
            
            if((a[mid]==a[mid+1] && mid%2==0) || ((mid%2==1) && (a[mid]==a[mid-1])))
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