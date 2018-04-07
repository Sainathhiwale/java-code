import java.util.Scanner;
class SwapWithThird_No{
public static void main(String []args)
{
   System.out.println("enter any two no:");
   Scanner sc = new Scanner(System.in);
   int a= sc.nextInt();
   int b = sc.nextInt();
   
   a=a+b; //a=2,b=4, a=a+b  result a=6
   b=a-b; //a=6 , 6-4=2, result b=2
   a=a-b; //a=6 , 6-2=4 , result a=4;
   
  System.out.println("after swap given no of A is:"+a);
System.out.println("after swap given no of B is:"+b);

}
}
