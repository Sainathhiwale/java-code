class MethodOverload{

int add (int num1,int num2)
{
  return num1+num2;
}
int add (int num1, int num2,int num3)
{
    return num1+num2+num3;
}
int add (int num1, int num2,int num3,int num4){
return num1+num2+num3+num4;

}

public static void main(String [] args)
{
   MethodOverload obj = new MethodOverload();
   System.out.println("the add value is:"+obj.add(20,20));
System.out.println("the add value is:"+obj.add(20,20,30));
System.out.println("the add value is:"+obj.add(20,20,30,40));
}
}
