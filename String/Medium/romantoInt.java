class Solution { // thiss a very celan code 
    public int romanToInt(String s) {
        int ans=0;
        char a[]=s.toCharArray();
        int len=s.length();
        for(int i=0;i<len;++i)
        {
            char p=a[i];
            int current=norm(p); // checking if fowrad a bigger num is present 
            if(i+1< len && current <norm(a[i+1]))
            {
                ans=ans-current;//pehle hi minus kardo
                                //aage bad mein abda dena
            }
            else
            {
                ans=ans+current;
            }
          
        }
        return ans;
    }

    public int norm(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
