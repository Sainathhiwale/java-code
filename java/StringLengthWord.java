

import java.util.Scanner;

public class StringLengthWord {
public static void main(String[] args) {
	System.out.println("enter the string");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int len = str.length();
	for(int i=0;i<len;i++){
		System.out.println(str.charAt(i)+" :"+i);
	}
	
		
	
}
}

