class Solution {

    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public void nextPermutation(int[] a) {
          
        int len=a.length;
        int index=-1;
        for(int i=len-2;i>=0;--i)
        {
            if(a[i]<a[i+1])
            {
                index=i;
                break;
            }
        }
        
        if(index==-1)
        {
            
            for(int i=0;i<len/2;++i)
            {
                swap(a,i,len-i-1);
            }
            return ;
        }
        
        //spilt found
        for(int i=len-1;i>=index;--i)
        {
            if(a[i]>a[index])
            {
                swap(a,i,index);
                break;
            }
        }
        
        //now reversing
        int left=index+1;
        int right=len-1;
        while(left<right)
        {
            swap(a,left,right);
            left++;
            right--;
        }
        
    }
}