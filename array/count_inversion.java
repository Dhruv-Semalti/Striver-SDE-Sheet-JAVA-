public class count_inversion {
    
}
class Solution {

    public static long merge(int a[],int left,int mid,int right)
{

    
    int left_size=mid-left+1;
    int left_arr[]=new int[left_size];
    
    int right_size=right-mid;
    int right_arr[]=new int[right_size];
    
    // entering the data into these temp arrays
    int j,i; // for left
    int k; // for right
    
    j=0;
    k=0;
    
    for(i=0;i<left_size;++i)
    {
        left_arr[i]=a[left+i];
    }
    
    for(i=0;i<right_size;++i)
    {
        right_arr[i]=a[mid+i+1];
    }
    
     // merging these two arrays
    
     int count=0;
    
    int index=left;//we knwo that the indexing sahll be from lef tonly
    while(j<left_size && k<right_size)
    {
        if(left_arr[j]>right_arr[k])
        {
            a[index]=right_arr[k];
            ++k;
            ++index;
            count=count+(left_size-j);
        }
        
        else if(left_arr[j]<=right_arr[k])
        {
            a[index]=left_arr[j];
            ++j;
            ++index;
        }
        
    }
    
    while(j<left_size)
    {
        a[index++]=left_arr[j++];
    }
    
    
    while(k<right_size)
    {
        a[index++]=right_arr[k++];
    }
    return count;
    
}


public static long mergeSort(int a[],int left,int right)
{
    long count=0;
    if(left>=right)
    {
        return count;
    }
    else
    {
        int mid=(left+right)/2;
        count+=mergeSort(a,left,mid);
        count+=mergeSort(a,(mid+1),right);
        count+=merge(a,left,mid,right);
        
    }
    return count;
}

    public long numberOfInversions(int[] nums) {
        if(nums==null || nums.length<2 ) return 0;
     return mergeSort(nums,0,nums.length-1);
    }
}