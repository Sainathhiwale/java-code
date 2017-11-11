import java.util.Scanner;
public class ArrayEvenOdd{
	public static void main(String [] args){
		int n;
		System.out.println("enter the size of array:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter the array element:");
		int []ary = new int [n];
		for (int i=0; i<n;i++ ) {
			ary[i]=sc.nextInt();
			
		}
		System.out.println("odd number");
		for(int i=0;i<n;i++)
		{
			
			if (ary[i]%2!=0) {
				System.out.println(ary[i]+" ");
				
			}
		}
		System.out.println("even number");
		for (int i=0;i<n;i++ ) {
		
			if (ary[i]%2==0) {
				System.out.println(ary[i]+" ");
				
			}
		}
	}
}