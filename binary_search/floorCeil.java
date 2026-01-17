class Solution {
    public int[] getFloorAndCeil(int[] a, int x) {
       int floor=-1;
       int ceil=-1;
       int low=0;
       int high=a.length-1;
       while(low<=high)
       {
        int mid=low+(high-low)/2;
        if(x>=a[mid])
        {
            low=mid+1;
            floor=a[mid];
            if(x==a[mid])
            {
                floor=x;
                ceil=x;
                break;
            }
        }
        else
        {
          high=mid-1;
          ceil=a[mid];
        }
       }
       int s[]=new int[2];
       s[0]=floor;
       s[1]=ceil;
       return s;
    }
}