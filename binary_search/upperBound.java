class Solution {
    
    public static void main(String args[])
    {
        int a[]={1,2,2,2,3};
        int x=2;
        System.out.println(lowerBound(a,x));
    }
    
    public static int lowerBound(int[] a, int x) {
       int len=a.length;
       int low=0;
       int high=len-1;
       int mid=0;
       int ans=0;
       while(low<=high)
       {
           mid=low+(high-low)/2;
           if(a[mid]>x)
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
