package stringbasic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Deci2Oct {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a decimal num:");
        int n = Integer.parseInt(br.readLine());
        int r;
        String s="";
        char dig[]={'0','1','2','3','4','5','6','7'};
        while(n>0){
        	r=n%8;
        	s=dig[r]+s;
        	n=n/8;
        }
        System.out.println("the octal no:"+s);
	}

}
