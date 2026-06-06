class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        int s_length=s.length();
        int t_length=t.length();

        if(s_length!=t_length)
        return false;
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        StringBuilder w=new StringBuilder();
        for(int i=0;i<s_length;++i)
        {
            // we see the same element
            if(map.containsKey(a[i]))
            {
                // we check is it check the corresponding elemetn
                if(map.get(a[i])!=b[i])
                {
                    return false;
                }
            }
            else// new elemetn
            {// target element t is already ampped to someone
                if(map.containsValue(b[i]))
                {
                    return false;
                }
                map.put(a[i],b[i]);
            }
            
        }
        return true;// if there is not break in betwwen and the whole lopp is iterated  return ture then
    }
}