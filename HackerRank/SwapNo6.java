import java.util.Scanner;
class SwapNo{
public static void main(String []args)
{
   System.out.println("enter the any two no:");
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int tem=0;
   
  System.out.println("before swap no of A:"+a);
  System.out.println("before swap no of B:"+b);

   tem= a;
   a = b;
   b = tem;

 System.out.println("after swap given no of A:"+a);
  System.out.println("before swap given no of B:"+b);

   
}
}

