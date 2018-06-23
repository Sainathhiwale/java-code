import java.util.Scanner;
public class StrCharFeq{
public static void main(String [] args)
{
  int j,k,len;
  String str;
  char ch,c;
 System.out.println("enter the text");
 Scanner sc = new Scanner(System.in);
 str=sc.next();
 len =str.length();

  for(c='A';c<='z';c++)
  {
    k=0;
    for(j=0;j<len;j++)
    {
      ch=str.charAt(j);//convert string length into index value into char
      if(ch==c)//char and a to z alphbet same then count k++
      {
       k++;
      }
   }
   if(k>0)
{
  System.out.println("the character "+ c +" has occured " +  k + " times ");
}
}
}
}

/*
{
   
   int k,j,len;
   String str;
   char c,ch;
   System.out.println("enter the text");
   Scanner sc = new Scanner(System.in);
   str = sc.next();
   //System.out.println("u entered:"+str);

  len=str.length();

  //System.out.println(len);

 for(c='A';c<='Z';c++) // get A to Z alphabet value
{
   k=0;  //System.out.println(c); A to Z Alphbeat print

   for(j=0;j<len;j++) // inner loop for string length count
   {
     
      ch=str.charAt(j);//get string length into index value with help of chatAt() method,then string length is present into j which is      						ininliize above len=str.length() 
      if(ch==c) //char (c) A to Z & char index value is same then count the k ++. it's means double chareacter & index is same then count++
     { 
       k++;
     }
   
     
   }
    if(k>0)
    {
       System.out.println("the character" + c + "has occured"+ k +"times");
     }
}

}


*/
