import java.util.HashMap;
import java.util.Map;
class Solution {
    public static void main(String args[])
    {
        int nums[]={-3,2,1};
        int k=longestSubarray(nums,6);
        System.out.println(k);
    }
    //longest sub array with sum k
    public static int longestSubarray(int[] nums, int k) 
    {
      //HashMap here shall store the sum as the key
      //values here are index;
      // the reference to map shall help u in functionality later
      Map<Long,Integer> preSumMap=new HashMap<>();
      long sum=0;
      int maxlen=0;
      for( int i=0;i<nums.length;++i)
      {
          sum=sum+nums[i];
          // checking if the summation is k 
          if(sum==k)
          {
            maxlen=Math.max(maxlen,i+1);
          }
          
          long rem=sum-k;
          
          // will use the logic if k nees to be there 
          // sum-k should be present before it 
          if(preSumMap.containsKey(rem))
          {
              // from here we have the length
              int len=i-preSumMap.get(rem);
              maxlen=Math.max(maxlen,len);
          }
          
          // only put key if it doesnt exist
          // this statement prevents the overwirde
          preSumMap.putIfAbsent(sum,i);
      }
          return maxlen;
          
          // one more thing we never update if i find the larger prefix of max length too we want the prefix to be lengthiest so current shall be max -old shall be smallest
      }
}
