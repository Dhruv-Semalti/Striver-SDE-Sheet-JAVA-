class Solution {
    public int myAtoi(String s) {
        char a[]=s.toCharArray();
        int len=s.length();
        long ans=0;
        int sign=1;
        // for white spaces
        int i=0;
        while(i<len && a[i]==32 )
        {
            ++i;
        }
       
        //check for sign
        if(i<len && a[i]=='-')
        {
        sign=-1;
        ++i;
        }
        else if(i<len && a[i]=='+')
        {
            sign=1;
            ++i;
        }
        
        
        //skip leading zeroes
        while(i<len && a[i]=='0')
        ++i;

    
        while(i<len && a[i]>='0' && a[i]<='9' )
        {
            int digit = a[i] - '0';
            ans = ans * 10 + digit; 
          
        
        if(ans*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(ans*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        i++;
        }

        return (int)ans*sign;
    }
}