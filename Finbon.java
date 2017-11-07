import java.util.Scanner;
public class Finbon{
public static void main(String [] args)
{
 int n, first =0, second =1 ,i;
 int next;
 System.out.println("enter the any no:");
 Scanner sc = new Scanner (System.in);
 n=sc.nextInt();
 if(n<0)
{
  System.out.println("enter the pasitive no pleas");
}
else
{
   for(i=0;i<n;i++)
{
     System.out.println(first);
     next = first+second;
     first = second;
     second = next;
}
}
}
}
