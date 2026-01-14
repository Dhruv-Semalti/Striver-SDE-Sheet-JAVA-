class Solution
{
    public int[][] merge(int[][] a) 
    {
 
    if (a.length == 0) return new int[0][0];

    Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));

    List<int[]> sol = new ArrayList<>();

    int currentStart = a[0][0];
    int currentEnd = a[0][1];
    for (int i = 1; i < a.length; i++) 
    {
        int nextStart = a[i][0];
        int nextEnd = a[i][1];
        if (nextStart <= currentEnd) 
        {
            currentEnd = Math.max(currentEnd, nextEnd);
        } 
        else
        {
            sol.add(new int[]{currentStart, currentEnd});
            currentStart = nextStart;
            currentEnd = nextEnd;
        }
    }
    sol.add(new int[]{currentStart, currentEnd});
    return sol.toArray(new int[sol.size()][]);
    }
}