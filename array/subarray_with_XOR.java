public class subarray_with_XOR {

    public int subarraysWithXorK(int[] nums, int k) {
      int len=nums.length;
      Map<Integer,Integer> a=new HashMap<>();
      a.put(0,1);
      //XOR value ,count
      int xr=0;
      int count=0;
      for(int i=0;i<len;++i)
      {
          xr=xr^nums[i];
            // 1. CHECK Logic (Do not update map here)
            int target = xr ^ k;
            if (a.containsKey(target)) {
                // ERROR 1 FIX: Add the frequency, not just 1
                count += a.get(target);
            }
        a.put(xr, a.getOrDefault(xr, 0) + 1);
      }
      return count;
    }
}

// XOR
// remember here java does the xor work for u
// u need to simply do it as prefic sum
// peeche dekho kitni bar the total_Xor^target has come that number of subarray are possible
//properties of XOR in DSA discussion grp