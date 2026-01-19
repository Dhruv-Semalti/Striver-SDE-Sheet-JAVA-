class Solution {

  public static void main(String args[])
  {
      int a[]={1,8,11,3};
  
      
      System.out.println(paint(10,1,a));
      
  }


    public static int valid(int a[],long mid)
    {
        long sum=0;
        int k=1;
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
             ++k;
           }
        }
        return k;
    }
    
    public static int paint(int A, int B, int[] a) {
        long max=a[0];
        long sum=0;
        
        for(int i=0;i<a.length;++i)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            sum=sum+a[i];
        }
        if(A>=a.length)
        {
            return(max*B)%10000003;
        }
        
        long low=max;
        long high=sum;
        long ans=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int num=valid(a,mid);
            if(num<=A)
            {
                
                  ans=mid;

               high=mid-1;
            }
            else
            {
              low=mid+1;
            }
        }
        long result = ((ans % 10000003)* (B % 10000003)) % 10000003;
        return (int) result;
    }
        
}
    