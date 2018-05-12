import java.util.Arrays;
public class ArraySort{
public static void main(String [] args)
{
   int ary[]={ 4562,7845,1234,5864,1245,6964,1785,1565,123,789,14,45,12,63,22,10,5,0};
   String ary2[]={ "hello", "google", "facebook","microsoft","apple","amzson", "ibm","tcs","sytel"};
   // before sorting array element 
   System.out.println("original array :"+Arrays.toString(ary));
  // After sorting array element
   Arrays.sort(ary);
  System.out.println("sorting array element :"+Arrays.toString(ary));

  //before sorting array element
  System.out.println("original array String ::"+Arrays.toString(ary2));
 //After sorting array element
  Arrays.sort(ary2);
 System.out.println(" sorting array element ::"+Arrays.toString(ary2));
  
  

   
  /*
   for (int t: ary)
   System.out.println(t);
   for(String s: ary2)
  System.out.println(s);
*/
}
}

