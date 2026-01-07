package majority2.java;
// O(N) time
// O(N) Space 
public class better {
    
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // element, freq
        Map<Integer,Integer> map=new HashMap<>();
        int len=nums.length;
        
        for(int i=0;i<len;++i)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        
        List<Integer> a=new ArrayList<>();
        // now accessing all the values
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>len/3)
            {
                a.add(entry.getKey());
            }
        }
        return a;
    }
}
