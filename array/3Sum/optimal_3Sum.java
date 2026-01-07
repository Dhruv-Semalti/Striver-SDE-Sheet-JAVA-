// optimal 3SUM
// time O(n^2) ,space is O(1) 
// no use of hash set or hashmap as such

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> a=new ArrayList<>();
      Arrays.sort(nums);
      int len=nums.length;
        for(int i=0;i<len-2;++i)
        {
            //using the three pointer approach
            //skip duplicates
            //if number is same prev we have processed it
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            
            int j=i+1; // j is the pointer next to i
            int k=len-1;// k is the pointer at the end
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    //if found valid triplet
                    a.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++; // j shall move one step forward
                    k--;
                    
                    while(j<k && nums[j]==nums[j-1]) // to avoid the last edge case && to make sure a duplicate doesnt coma again
                    {
                        j++;
                    }
                    
                     while(j<k && nums[k]==nums[k+1])
                    {
                        k--;
                    }
                    
                }
                else if(sum<0) // now sum value is less than 0 we need 
                               //to incraese the value here make sure as array is sorted u need to go towards 0
                               //k waisen last me so the pointer on enagtive side shall moce forward to increase the avlue 
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
            
        }
        return a;
    }
}

