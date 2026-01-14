
class Solution {

    public static void main(String args[])
    {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;
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
        int i=m-1; // for nums1
        int j=n-1;// for nums2
        int cont=nums1.length-1;
        while(i>=0 && j>=0)
        {
            if(nums2[j]>=nums1[i])
            {
                
                nums1[cont--]=nums2[j--];
            }
            else
            {
                
                nums1[cont--]=nums1[i--];
            }
        }

        
        while(j>=0)
        {
            nums1[cont--]=nums2[j--];
        }
        
    }
}
