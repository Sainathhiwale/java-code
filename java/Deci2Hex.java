package stringbasic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Deci2Hex {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the decimal num:");
        int n = Integer.parseInt(br.readLine());
        int r;
        String s="";
        char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0){
        	r=n%16;
        	s=dig[r]+s;
        	n=n/16;
        }
        System.out.println("the Hexadecimal no:"+s);
	}

}
