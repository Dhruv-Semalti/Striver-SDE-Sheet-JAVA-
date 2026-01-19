class Solution {

    public static int valid(int a[],double mid)
    {
        int cnt=0;
        for(int i=1;i<a.length;++i)
        {
           double diff=a[i]-a[i-1];
           int numBetween=(int)Math.ceil(diff/mid)-1;
           
            cnt+=numBetween;
        }
        return cnt;
    }
    public double minimiseMaxDistance(int[] a, int k) {
        int max=a[1]-a[0];
        for(int i=1;i<a.length;++i)
        {
           int differ=a[i]-a[i-1];
           if(differ>max)
           {
            max=differ;
           }
        }
        double low=0;
        double high=max;
        double x=1e-6;
        while(high-low>x)
        {
            double mid=low+(high-low)/2.0;
            int val=valid(a,mid);
            if(k<val)
            {
                low=mid;
            }
            else
            {
                high=mid;
            }
        }
        return high;
        
    }
}
