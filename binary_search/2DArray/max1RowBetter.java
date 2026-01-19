class Solution {
    public int rowWithMax1s(int[][] mat) {
       int row=mat.length;
       int col=mat[0].length;
       int max=-1;
       int index=-1;
       for(int i=0;i<row;++i)
       {
        int low=0;
        int high=col-1;
        int ans=-1;
        while(low<=high)
        {
          int mid=low+(high-low)/2;
          if(mat[i][mid]>=1)
          {
            ans=mid;
            high=mid-1;
          }
          else
          {
            low=mid+1;
          }
        }
        if(ans!=-1)
        
        if(max<(col-ans))
        {
            max=col-ans;
            index=i;
        }
       }
       return index;
    }
}