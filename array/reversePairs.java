
class Solution {
    
    public static void main(String args[])
    {
        int a[]={1,3,2,3,1};
        System.out.println(reversePairs(a));
        print(a);
    }
    
    public static int merge(int a[],int mid,int low,int high)
    {
        int left_size=mid-low+1;
        int right_size=high-mid;
        int left_arr[]=new int[left_size];
        int right_arr[]=new int[right_size];
        
        //filling them with data
        for(int i=0;i<left_size;++i)
        {
            left_arr[i]=a[low+i];
        }
        
        for(int i=0;i<right_size;++i)
        {
            right_arr[i]=a[mid+1+i];
        }
    
        int j=mid+1;
         int count=0;
        for(int i=low;i<=mid;++i)
        {
            while(j<=high && (a[i]>2*a[j]))
            {
                j++;
            }
            count+=j-(mid+1);
        }
        
        int index=low;
        int i=0; //left
        j=0; //right
       
        while(i<left_size && j<right_size)
        {
            
        
            if(left_arr[i]>=right_arr[j])
            {
                a[index++]=right_arr[j++];
            }
            else
            {
                a[index++]=left_arr[i++];
            }
            
            
        }
        
        while(i<left_size)
        {
            a[index++]=left_arr[i++];
        }
        
        while(j<right_size)
        {
            a[index++]=right_arr[j++];
        }
        return count;
        
    }
    
    
    public static int mergeSort(int a[],int low,int high)
    {
        int count=0;
        if(low>=high)
        {
            return count;
        }
        int mid=(low+high)/2;
        count+=mergeSort(a,low,mid);
        count+=mergeSort(a,mid+1,high);
        count+=merge(a,mid,low,high);
        return count;
    }
    
  
    public static void print(int a[])
    {
        for(int i=0;i<a.length;++i)
        {
            System.out.print(a[i]);
        }
    }
    
    public static int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    
}