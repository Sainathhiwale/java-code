public class MinMaxNo{
public static void main(String [] args)
{
     int num[]={5,9,2,4,6,9,3};
     int mix = num[0];
     int min = num[0];
    for(int i=1;i<num.length;i++)
{
      if(num[i]>mix)
       mix=num[i];
      else if(num[i]<min)
       min = num[i];
}
System.out.println("min no:"+min);
System.out.println("max no:"+mix);
}
}
