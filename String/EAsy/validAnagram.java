public class validAnagram {
    
}
class Solution {
    public boolean isAnagram(String s, String t) {
    int s_length=s.length();
     int t_length=t.length();
     if(s_length!=t_length)
     {
        return false;
     }   

     int a[]=new int[26];
     char check[]=s.toCharArray();
     for(int i=0;i<s_length;++i)
     {
        ++a[check[i]-97];
     }

     char check2[]=t.toCharArray();
     for(int i=0;i<s_length;++i)
     {
       --a[check2[i]-97];
       if(a[check2[i]-97]==-1)
       {
        return false;
       }
     }
     return true;  
}
}