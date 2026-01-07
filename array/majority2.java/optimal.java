package majority2.java;
// time O(N) ,space here O(1)
// u see here we shall use moore algo
// but there is a problem we shoould nnot forget it 
// assumes that there is a mjority element therefore we 
// shoulf always make sure we have a majority element


public class optimal {

    public List<Integer> majorityElement(int[] nums) {
    
    int len=nums.length;
    int count1=0;
    int count2=0;
    int ele1=Integer.MIN_VALUE;
    int ele2=Integer.MIN_VALUE;
    List<Integer> a=new ArrayList<>();
    for(int i=0;i<len;++i)
    {
        if(count1==0 && ele2!=nums[i])
        {
            count1=1;
            ele1=nums[i];
        }
        else if(count2==0 && ele1!=nums[i])
        {
            count2=1;
            ele2=nums[i];
        }
        else if(ele2==nums[i])
        {
            ++count2;
        }
        else if(ele1==nums[i])
        {
            ++count1;
        }
        else
        {
            count1--;
            count2--;
        }
    }
    count1=0;
    count2=0;
    for(int i=0;i<len;++i)
    {
        if(ele1==nums[i])
        {
            ++count1;
        }
        else if(ele2==nums[i])
        {
            ++count2;
        }
    }
    
    if(count1>len/3)
    {
        a.add(ele1);
    }
    if(count2>len/3)
    {
        a.add(ele2);
    }
    return a;
    
}
}

}

// u see what we change here we made sure that the counters have one sure thing 
// whenever there is ele2 count1 if 0 shall not have it 

//Majority > N/2: At most 1 winner. (Use 1 Counter)
//Majority > N/3: At most 2 winners. (Use 2 Counters)
//Majority > N/4: At most 3 winners. (Use 3 Counters)
