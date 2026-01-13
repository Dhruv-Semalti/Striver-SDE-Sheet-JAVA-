public class mergeSorted {
    
}
class Solution {

    public static void main(String args[])
    {
        int nums1[]={0};
        int nums2[]={1};
        int m=0;
        int n=1;
        print(nums1);
        print(nums2);
        merge(nums1,m,nums2,n);
        print(nums1);
        print(nums2);
    }
    
    public static void print(int a[])
    {
        for(int i=0;i<a.length;++i)
        {
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0; // for nums1
        int j=0;// for nums2
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                ++i;
            }
            else if(nums2[j]<=nums1[i])
            {
                m=m+1;
                if(nums2[j]==nums1[i])
                {
                    ++i;
                }
                for(int k=m-1;k>=i;--k)
                {
                    if(k==0)
                    continue;
                    nums1[k]=nums1[k-1];
                }
                nums1[i]=nums2[j];
                ++j;
            }
           
        }
        while(i<m)
        {
            ++i;
        }
        while(j<n)
        {
            nums1[i++]=nums2[j++];
        }
    }
}
