import java.util.Scanner;
class WithoutModDivNo{
public static void main(String []args)
{
int n;
     System.out.println("enter the any no");
   Scanner sc = new Scanner(System.in);
   n = sc.nextInt();
 
  if((n/2)*2==n)
{
 System.out.println("even::"+n);  
}else
{
   System.out.println("odd:"+n);
}

  
}

}
