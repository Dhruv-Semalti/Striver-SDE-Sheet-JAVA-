
class Solution {
    public int maxProduct(int[] a) {
        int len=a.length;
        if(len==1)
        return a[0];
       int pre=0;
       int suf=0;
       int max=-999999999;
       for(int i=0;i<len;++i)
       {
        if(pre==0)
        pre=1;
        
        if(suf==0)
        suf=1;

        pre=pre*a[i];
        suf=suf*a[len-i-1];
        max=Math.max(max,Math.max(pre,suf));
       }
       return max;
    }
}