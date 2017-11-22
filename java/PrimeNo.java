import java.util.Scanner;	
public class PrimeNo{
public static void main(String [] args)
{
      int num;
      int count=0;
      System.out.println("enter the any no:");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
     for(int i=2;i<num;i++)
{
     if(num%2==0)
{
     count++;
     break;
}
}
if(count==0)
{
    System.out.println("this is prime no");
}
else
{
     System.out.println("this is not prime no");
}
}
}
