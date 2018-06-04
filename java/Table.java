import java.util.Scanner;
public class Table{
public static void main(String [] args)
{ 
   int num;
   int i,j;
   int temp=0;

   System.out.println("enter any number:");
   Scanner sc = new Scanner(System.in);
   num = sc.nextInt();

  switch(num)
{
   case 10:

   for(i=0;i<10;i++)
{
    System.out.println(num*(i+1));
}
break;

   case 20:
   
   for( j=0;j<10;j++);
{
   System.out.println(num*(j+1));
   
}
break;

}
  
}
}
