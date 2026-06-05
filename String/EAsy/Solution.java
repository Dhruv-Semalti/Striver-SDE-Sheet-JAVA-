class Solution {
    public String reverseWords(String s) {
        StringBuilder w=new StringBuilder();
        char c[]=s.toCharArray();
        int j=s.length()-1;
        while(j>=0)
        {
            //skip spaces
            while(j>=0 && c[j]==' ')
            {
                j--;
            }
            
            // if reached first stop
            if(j<0)
            break;
           
            // for a word
            int i=j;
            while(i>=0 && c[i]!=' ')
            {
                --i;
            }
            if(w.length()>0)
            {
                w.append(" ");
            }
            w.append(s.substring(i+1,j+1));
            j=i;
        }
        return w.toString();

        }
}