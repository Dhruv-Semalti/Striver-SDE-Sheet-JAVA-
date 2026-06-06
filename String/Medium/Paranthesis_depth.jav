class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int len=s.length();
        int max=0;
        char a[]=s.toCharArray();
        for(int i=0;i<len;++i)
        {
            if(a[i]=='(')
            {
                ++counter;
            }
            else if(a[i]==')')
            {
                max=Math.max(counter,max);
                --counter;
            }
        }
        return max;
    }
}