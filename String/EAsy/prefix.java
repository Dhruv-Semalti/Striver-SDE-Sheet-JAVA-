
public class prefix {
    
}
class Solution { // prefix means that they should be at the start 
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        int min=strs[0].length();
        String w=strs[0]; // has min length
        for(int i=0;i<len;++i)
        {
            if(min>strs[i].length())
            {
                w=strs[i]; 
                min=strs[i].length();
            }
        }
       
        int common_min=w.length();
        int count =0;
        for(int i=0;i<len;++i)
        {
            count =0; // eveyr count is new 
            char a[]=strs[i].toCharArray();
            if (a.length == 0 || w.length() == 0) {
                return "";
            }

            //prefix means only need to check the start
            if(a[0]!=w.charAt(0))
            {
                w="";
                return w;
            }  
            int j=0;// we iterated j less than common length and stringh length 
            while(j<w.length() && j<a.length && w.charAt(j)==a[j])
            {
                ++count;
                ++j;
                
            }//if less are common udate new common
            if(count<common_min)
            {
                w=strs[i].substring(0,count);
                common_min=count;
            }
        }
        return w;


    }
}