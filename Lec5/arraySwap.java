package AtoZ.Lec5;

public abstract class arraySwap {
    
     static void arraySwapping(int a[],int start,int end)
    {
        //swap
        if(start>end)
        return;

       int temp=a[start];
       a[start]=a[end];
       a[end]=temp;

       arraySwapping(a,start+1,end-1);

    }

    public static void main(String agr[])
    {
        int a[]={2,4,5,6,7,8,7,9};
        int i;
        int len=a.length;
        for(i=0;i<len;++i)
        {
           System.out.print(a[i]);
        }
        arraySwapping(a,0,len-1);
System.out.println("");
        for(i=0;i<len;++i)
        {
           System.out.print(a[i]);
        }

}
}