import java.util.Scanner;
class ReverseString{

public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter String :");
  String n=sc.nextLine();
  String rev="";
  int len=n.length();
  for(int i=len-1;i>=0;i--)
  {
   rev=rev+n.charAt(i);   
  }
                System.out.println("Reverse of Given String is :");
  System.out.println(""+rev);  
 }
}
