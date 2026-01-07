package AtoZ.Lec5;

public class palindrome {
        
static void arraySwapping(char a[],int start,int end)
    {
        //swap
        if(start>end)
        return;

       char temp=a[start];
       a[start]=a[end];
       a[end]=temp;

       arraySwapping(a,start+1,end-1);
    }

    public static void main(String args[])
    {
        String s="madam";
        int i;
        int len=s.length();
        System.out.println(s);
        char a[]=s.toCharArray();
        arraySwapping(a,0,len-1);
        System.out.println(a);
        int flag=0;
        int j;
        for(i=0,j=(len-1);i<len;++i,--j)
        {
            if(a[i]!=a[j])
            {
                flag=1;
                System.out.println(a[i]);
                break;
            }
        }
        
       if(flag==0)
       System.out.print("Palindrome");
       else
       System.out.print("Not palindrome");
   }
}
