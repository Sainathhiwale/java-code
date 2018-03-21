import java.util.Scanner;
class ReverseDigit{
public static void main(String[] args) {

	 	int num,reverseno=0;
	 	System.out.println("enter the any no");
	 	Scanner sc = new Scanner(System.in);
	 	num = sc.nextInt();
	 	while(num!=0){
	 		int sum = num%10;
	 		reverseno = reverseno *10+sum;
	 		num=num/10;

	 	}
	 	System.out.println(reverseno);
		
	}
}
