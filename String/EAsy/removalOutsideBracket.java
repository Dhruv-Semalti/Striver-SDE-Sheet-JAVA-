class Solution {
    public String removeOuterParentheses(String s) {
        // when we u use w=w+"" u r creating a new string every single time 
        // basically a new obj so better use string builder
      StringBuilder w=new StringBuilder();
      int counter=0;
      char chars[]=s.toCharArray();
      for(int i=0;i<s.length();++i)
      {
        char k=chars[i];
        if(counter==0 && k=='(')
        {
                ++counter;
        

        }

        else if(k=='(')
        {
            w.append('(');
            ++counter;
        }
        else if(k==')')
        {
           
            --counter;
            if(counter!=0)
            {
                w.append(')');
            }
        }

      }
      return w.toString();// dont forget to convert from stringBuilder to String;
    }
}