// C class extends A and B extends A class, it is one-to-one relation. This type of relation is known as "multilevel inheritance"

class A{
 
public void eat()
{
   System.out.println("eating");

}
}

class B extends A{

public void walk()
{
  System.out.println("walking");

}
}
class C extends B{
public void run()
{
   System.out.println("running");
}
public static void main(String [] args)
{
   A a1 = new A();  // create a A class object (super class object)
   a1.eat();         //  A object a1 is calling its own eat() method

  B b1 = new B();    // create a B class object 
  b1.walk();      // B  object b1 is calling its own walk() method
  b1.eat();      // B object b1 calling its super class A method eat(), permitted by inheritance

 C c1 = new C();  // create a C class object
 c1.run();       // C  object1 c1 is calling its own run() method
 c1.walk();      // now C object1 c1 is calling B class walk() method. 
 c1.eat();        // C also can call Animal's eat() due to inheritance HIS IS THE POWER OF INHERITANCE
 
  
}
}


 
