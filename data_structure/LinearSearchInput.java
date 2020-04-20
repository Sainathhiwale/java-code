package ds;

import java.util.Scanner;

public class LinearSearchInput {

    public static void main(String[] args) {
        System.out.println("enter the element of number:");
        Scanner sc = new Scanner(System.in);
        int search,temp=0;
        int n = sc.nextInt();
        int ary[] = new int[n];
        System.out.println("enter the element of array:");
        for (int i=0;i<ary.length;i++){
            ary[i] = sc.nextInt();
        }
        System.out.println("enter the search value:");
        search = sc.nextInt();
        for (int i=0;i<ary.length;i++){
            if (ary[i]==search){
                System.out.println("element of at: "+i+" index position");
                temp = temp+1;
            }
        }
        if (temp ==0){
            System.out.println("The Search element is not in a list!");
        }

    }
}
