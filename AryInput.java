import java.util.Scanner;
class AryInput{
public static void main(String [] args)throws ArrayIndexOutOfBoundsException
{
    int sum=0;
    int n;
   int len=0;
    System.out.println("enter the no:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int [] ary = new int [n];
    
 System.out.println("enter the element:");
 for (int i=0;i<n;i++)
{
     ary[i] = sc.nextInt();
     sum=sum+ary[i];
   
     
}

  System.out.println("the element sum:"+sum);

  

}
}
