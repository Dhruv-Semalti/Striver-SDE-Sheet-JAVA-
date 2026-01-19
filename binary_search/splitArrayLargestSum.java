class Solution {

   public static int valid(int a[],int mid)
    {
        int sum=0;
        int days=1;
        for(int i=0;i<a.length;++i)
        {
          sum=sum+a[i];
          if(sum<=mid)
          {
            continue;
          }
          else
          {
            sum=a[i];
            ++days;
          }
        }
        return days;
    }
    public int splitArray(int[] a, int k)  {
        int max=a[0];
        int sum=0;
        for(int i=0;i<a.length;++i)
        {
            sum=sum+a[i];
            if(max<a[i])
            {
                max=a[i];
            }
        }
        int low=max;
        int high=sum;
        int ans=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int check=valid(a,mid);
            if(check<=k)
            {
                high=mid-1;
                if(check==k)
                {
                    ans=mid;
                }
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}