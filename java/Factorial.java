import java.util.Scanner;
public class Factorial{
public static void main(String [] args)
{
   int n,fact=1;

   System.out.println("enter the any no:");
   Scanner sc = new Scanner(System.in);
   n = sc.nextInt();
   if(n<=0){
   System.out.println(1);
}
else if(n<=1)
{
  System.out.println(1);

}
else{
       while(n>=2)
{
     fact=fact*n;
     n--;
}
System.out.println(fact);
}
       
}
}
