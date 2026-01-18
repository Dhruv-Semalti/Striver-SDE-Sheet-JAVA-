class Solution {

    public static boolean possible(int a[],int m,int k,int mid){
        int flowers=0;
        int boq=0;
        for(int i=0;i<a.length;++i)
        {
            if(a[i]<=mid)
            {
              ++flowers;
            
            if(flowers==k) // flowers bloomed
            {
                boq++;
                flowers=0;
            }
            }
            else
            {  // flower not bloomed
                flowers=0;
            }
            
        }

        return (boq>=m);
    }

    public int minDays(int[] a, int m, int k) {
        int max=a[0];
        int min=a[0];
        long s=(long)m*k;
        if(s>a.length)
        {
            return -1;
        }
        for(int i=0;i<a.length;++i)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else if(a[i]<min)
            {
                min=a[i];
            }
        }
        
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(a,m,k,mid))
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