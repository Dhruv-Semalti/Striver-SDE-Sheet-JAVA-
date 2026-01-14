class Solution
{
    public int[][] merge(int[][] a) 
    {
        int n=a.length;
        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<n;++i)
        {
            if(ans.isEmpty() || a[i][0]>ans.get(ans.size()-1)[1])
            {
                ans.add(a[i]); // basically yahan se seedhe add karlo
                 // bcz it is a sperate interval
            }
            else
            {
              int last[]=ans.get(ans.size()-1);
              last[1]=Math.max(last[1],a[i][1]);
            }
            
        }
        return ans.toArray(new int[ans.size()][]);

}
}