// multiple inheritance does not support of java bez of Dinmand
/* javac Animal.java 
Animal.java:19: error: '{' expected
class Animal extends Duck,Fish{
  */                       


class Sanke{
void swim()
{
  System.out.println(" sanke use whole body");
}
}
class Duck extends Sanke{
void swim()
{
   System.out.println("Duck use it's legs");
}
}
class Fish extends Sanke{
void swim()
{
   System.out.println("fish use fins");
}
}
class Animal ex	tends Duck,Fish{
public static void main(String [] args)
{
    Animal a1 = new Animal();
   al.swim();
}
}

