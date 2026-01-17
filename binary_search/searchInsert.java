class Solution {
    public int searchInsert(int[] a, int target) {
     int low=0;
      int high=a.length-1;
      int ans=a.length;
      int mid=0;
      while(low<=high)
      {
        mid=low+(high-low)/2;
       // System.out.print(low);
        //System.out.print(high);
        //System.out.println("");
        if(a[mid]>=target)
        {
            ans=mid;
            high=mid-1;
        }
        else
           low=mid+1;
      } 
      return ans; 
    }
}