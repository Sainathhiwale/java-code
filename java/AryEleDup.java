public class AryEleDup {

public static void main (String [] args)
{
     int ary [] = {2,5,6,2,4,8,6,1,7,9,8,10};

    for(int i=0;i<ary.length-1;i++)
{
    //System.out.println("the array of:"+ary[i]);
    for(int j=i+1;j<ary.length;j++)
{
   if(ary[i]==ary[j] && (i!=j))
   {
    System.out.println("the duplicate value is::"+ary[j]);
   } 
}
    
}
}
}
