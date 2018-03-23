import java.util.Scanner;

class StringChar{

public static void main(String [] args)
{
     int len,k,j;
     String str;
     char c,ch;
     System.out.println("enter the any String:");

     Scanner sc = new Scanner (System.in);
     str = sc.next();
     len = str.length();
     
     for(c='A'; c<='z'; c++)
  {
     k=0;
     
     for(j =0; j<len;j++)
{
      ch = str.charAt(j);

    if(ch == c)
{
  k++;
}
}
 if(k>0)
{
   System.out.println("the character "+c+" has occured "+k+" times");

}
  
   
   }


}
}

