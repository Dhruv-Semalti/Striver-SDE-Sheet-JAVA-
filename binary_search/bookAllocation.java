class Solution {

    public static int countStudents(int a[],int mid)
    {
        int student=1;
        long sum=0;
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
            ++student;
          }


        }
        return student;
    }

   public int findPages(int[] a, int m) {
   if(m>a.length) return -1;
   int max=a[0];
  
   int sum=0;
   for(int i=0;i<a.length;++i)
   {
     if(a[i]>max)
     {
        max=a[i];
     }
     sum=sum+a[i];
    
   }
   int low=max;
   int high=sum;
   while(low<=high)
   {
    int mid=low+(high-low)/2;
    int student=countStudents(a,mid);
    if(student>m)
    {
        low=mid+1;
    }
    else{
        high=mid-1;
    }
   }
    return low;
    }
}

