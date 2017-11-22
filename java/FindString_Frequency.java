
import java.util.Scanner;
public class FindString_Frequency{
public static void main(String [] args)
{
        int  len, j, k;
        String str;
        char c, ch;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        str=scan.nextLine();
        
        len=str.length();
        for(c='A'; c<='z'; c++)
        {
            k=0;
            for(j=0; j<len; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }
        }
   }
}
