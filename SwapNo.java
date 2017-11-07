import java.util.Scanner;
public class SwapNo{
public static void main(String []args)
{
     int num1,num2;
     System.out.println("enter the first no");
     Scanner sc = new Scanner(System.in);
     num1 = sc.nextInt();
     System.out.println("enter the Second No:");
     num2 = sc.nextInt();
     System.out.println("Num1 is:"+num1+"  before Swap no is:"+"Num2 is:"+num2);

    //swap the two no without thrid varible

     num1 = num1+num2;
     num2 = num1-num2;
     num1 = num1-num2;
    System.out.println();
    System.out.println("Num1 is:"+num1+" After Swap no is:"+"Num2 is:"+num2);
}
}
