package AtoZ.array;

public class Solution {
    
    
    public static void main(String args[])
    {
     int nums[]={1,2,3};
     boolean b=check(nums);
     System.out.println(b);
    }
    
    public static void print(int a[])
    {
        for(int i=0;i<a.length;++i)
        {
            System.out.println(a[i]);
        }
        System.out.println("");
    }
    
    public static boolean check(int nums[]) 
    {
        
        
        int len=nums.length;
       
        int copy[]=new int[len];

        //copying data
        for(int k=0;k<len;++k)
        {
            copy[k]=nums[k];
        }
        //sort nums
        for(int j=0;j<len;++j)
        {
            for(int p=0;p<len-j-1;++p)
            {
                if(nums[p]>nums[p+1])
                {
                    int temp=nums[p];
                    nums[p]=nums[p+1];
                    nums[p+1]=temp;
                    
                }
            }
        }
        
       // 
       int counter=0;
       int yes=0;
       while(counter!=len)
       {
           int p=nums[len-1];
           for(int i=len-1;i>0;--i) //rotating
           {
               nums[i]=nums[i-1];
           }
           
           nums[0]=p;
          // print(nums);
           int j,i;
           for( i=0,j=0;i<len;++i,++j)
           {
               if(nums[i]==copy[j]) // basically if rotation
               {
                   ++yes;
                   //System.out.print(yes);
               }
               else
               {
                   break;
               }
           }
          // System.out.println("");
           if(yes==len)
           {
               return true; //pattern matched
           }
           yes=0; //pattern not matched check for another
           ++counter;
       }
       return false;
       //checked all pattern none matched
   
    }
}

