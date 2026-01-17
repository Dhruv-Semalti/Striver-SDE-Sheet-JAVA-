class Solution {


    // return 1 if equal to m 
    // return 0 if less than m
    // return 2 if gretaer than m

    public static int cal(int mid,int n,int m)
    {
        long f=1;
        for(int i=n;i>0;--i)
        {
            f=f*mid;
            if(f>m)
            {
                return 2;
            }
        }

        if(f==m)
        {
          return 1
        }
        
        return 0;
    }
    // n stands for power ... M is the number 
    public int NthRoot(int N, int M) {
        int low=1;
        int high=M;
      
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int s=cal(mid,N,M);
            if(s==1)
                return mid;
            else if(s==2)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
               
            }
        }
        return -1;
    }
}
