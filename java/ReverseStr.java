
import java.util.Scanner;
class ReverseStr{

public static void main(String [] args)
{
    System.out.println("enter the String");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String reverse= "";

     for(int i= str.length()-1;i>=0;i--)
{
      reverse =reverse+str.charAt(i);
}

  System.out.println("Reversed string is:");
        System.out.println(reverse);

}
}

