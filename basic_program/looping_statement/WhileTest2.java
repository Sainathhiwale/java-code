import java.util.Scanner;
public class WhileTest2{
public static void main(String [] args)
{
  System.out.println("enter the num:");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  while(n<10){
   System.out.println(n);
   n++;
  }
}
}