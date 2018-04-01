import java.util.Scanner;
class EvenOddAry{
public static void main(String []args)
{
   int n;
   System.out.println("enter the no:");
   Scanner sc = new Scanner(System.in);
   n =sc.nextInt();
   int [] ary= new int[n];
   System.out.println("enter the any no:");
   for(int i=0;i<n;i++)
{
     ary[i] = sc.nextInt();
     if(ary[i]%2!=0)
{
  System.out.println("given no is odd:"+ary[i]);

}
else{
System.out.println("given no is even:"+ary[i]);
}
}
}
}
