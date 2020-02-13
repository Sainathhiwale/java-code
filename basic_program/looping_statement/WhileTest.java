import java.util.Scanner;
public class WhileTest{
public static void main(String [] args)
{
  System.out.println("enter the no:");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  while(n>0){
   System.out.println(n);
   n--;
}
  
}
}