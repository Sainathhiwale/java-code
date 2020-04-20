package ds;

import java.util.Scanner;

public class MinimumNo {

    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ary[] = new int[n];
        System.out.println("enter the array element:");
        int max = ary[0];
        for (int i=0;i<ary.length;i++){
          ary[i] = sc.nextInt();

          if (max<ary[i]){
              max = ary[i];
          }
        }
        System.out.println("Maximum element is:"+max);
    }
}
