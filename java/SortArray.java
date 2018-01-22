import java.util.Scanner;
public class SortArray{
public static void main(String [] args){
System.out.println("enter the array size:");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int ary [] = new int [n];
for(int i=0;i<ary.length;i++)
{
     ary[i]=sc.nextInt();

}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
{
    int temp=0;
    temp=ary[i];
    ary[i]=ary[j];
    ary[j]=temp;
}

}
System.out.println("Ascending order");
for(int i=0;i<n-1;i++){
System.out.println(ary[i]);
}
System.out.println(ary[n-1]);

}
}

