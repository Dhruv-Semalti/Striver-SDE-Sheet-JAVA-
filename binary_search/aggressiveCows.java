import java.util.Arrays;
class Solution {

    public static boolean valid(int a[],int mid,int k)
    {
        int counter=1;
        int last=a[0];
        for(int i=1;i<a.length;++i)
        {
           if((a[i]-last)>=mid)
           {
             ++counter;
             last=a[i];
           }
        } 
        return counter>=k;
    }
    public int aggressiveCows(int[] a, int k) {
     int low=1;
     Arrays.sort(a);
     int high=a[a.length-1]-a[0];
     int ans=-1;
     while(low<=high)
     {
        int mid=low+(high-low)/2;
        if(valid(a,mid,k))
        {
            ans=mid;
            low=mid+1;
            
        }
        else
        {
            high=mid-1;
        }
     }
     return ans;

    }
}
