package execption.try_catch;

import java.util.Scanner;

public class Demo {
    public static void main(String [] args){
        int div =0;
        try {
            System.out.println("enter any no:");
            Scanner sc = new Scanner(System.in);
            int num =sc.nextInt();
            div =num/0;
            System.out.println("the division is::"+div);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("clean the code");
        }
    }
}
