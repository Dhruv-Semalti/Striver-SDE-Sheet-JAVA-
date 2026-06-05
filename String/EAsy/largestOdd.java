
public class Solution {
    public String largestOddNumber(String s) {
        String w="";
        int len=s.length();
        char c[]=s.toCharArray();
       
        for(int i=len-1;i>=0;--i)
        {
            int k=c[i]-'0';//fastest way
            if(k%2==1)
            {
             
                w=w+s.substring(0,i+1);
                return w;
            }
        }
        
 
        return w;
       

    }
} 
