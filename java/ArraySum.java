import java.util.Scanner;
public class ArraySum{
	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("enter the array size:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter the array element:");
		int ary [] = new int [n];
		for(int i=0;i<n;i++){
			ary[i]=sc.nextInt();
			sum+=ary[i];
		}
		System.out.println("the sum of array:"+sum);
	}
}