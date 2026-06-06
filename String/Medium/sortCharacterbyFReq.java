class Solution {
    public String frequencySort(String s) {
       int len=s.length();
       int counter[]=new int[62];
       char a[]=s.toCharArray();
       int max=0;
       for(int i=0;i<len;++i)
       {
        if(a[i]<58) // for numbers
        {
          ++counter[a[i]+4];
        //  System.out.println();
          max=Math.max(max,counter[a[i]+4]);
        }
       else if(a[i]<96) // for capital
        {
        ++counter[a[i]-39];// for capital to start from 26
        max=Math.max(max,counter[a[i]-39]);
        }
        else
        { // for small
            ++counter[a[i]-97];// for small they shall start from 0
            max=Math.max(max,counter[a[i]-97]);
       }
       }
       
      
     
       StringBuilder w =new StringBuilder();
 
       while(max!=0)
       {
         for(int i=0;i<62;++i)
         {
            if(counter[i]==max)
            {
                int k=max;
                while(k!=0)
                {
                    if(i<26)
                    w.append((char)(i+97));
                    else if(i<52)
                    w.append((char)(i+39));
                    else
                    {
                    w.append((char)(i-4));
                    //System.out.println((int)(i+4));
                    }
                    
                    --k;
                  
                }
            }
         }
         --max;
       }
       return w.toString();
    }
}