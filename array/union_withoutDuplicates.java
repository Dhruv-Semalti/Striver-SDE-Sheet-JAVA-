import java.util.*;
class Solution {
    
    public static void main(String args[])
    {
        int a[]={1, 2, 3, 4, 5};
        int b[]={1, 2, 7};
        int c[]=new int[a.length+b.length];
        c=unionArray(a,b);
       // print(c);
    }
    
    public static void print(int a[])
    {
        for(int i=0;i<a.length;++i)
        {
            System.out.print(a[i]);
        }
    }
    
    public static int[] unionArray(int[] nums1, int[] nums2)
     {
      ArrayList<Integer> a=new ArrayList<>();
      int i=0;
      int j=0;
      while(i<nums1.length && j<nums2.length)
      {
          if(nums1[i]<nums2[j])
          {
               System.out.println(nums1[i]);
              a.add(nums1[i]);
              ++i;
             
          }
          else if(nums1[i]>nums2[j])
          {
              System.out.println(nums2[j]);
              a.add(nums2[j]);
              ++j;
              
          }
          else
          {
               System.out.println(nums1[i]);
               a.add(nums1[i]);
              ++i;
              ++j;
              
          }
      }
      
      while(i<nums1.length)
      {
          System.out.println(nums1[i]);
          a.add(i++);
        
      }
      
      while(j<nums2.length)
      {
            System.out.println(nums2[j]);
          a.add(j++);
        
      }
      
      int[] result = new int[a.size()];
        for (int k = 0; k < a.size(); k++) {
            result[k] = a.get(k);
        }

      return result;
    }
}