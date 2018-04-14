
class A
{
  public void nature()
  {
    System.out.println("Generally, Aves fly");
  }
}
class B extends A
{ 
  public void eat()
  {
    System.out.println("Eats to live");
  }
}
public class  MultiLevelInher extends B
{
  public void food()
  {
    System.out.println("Parrot eats seeds and fruits");
  }
  public static void main(String args[])
  {
 MultiLevelInher p1 = new MultiLevelInher();
    p1.food();                       // calling its own
    p1.eat();                        // calling super class Bird method
    p1.nature();                     // calling super class Aves method
  }
}
