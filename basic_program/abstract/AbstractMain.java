package abstract_test;
/*
     what is abstract class in java
     - a class which is declared as abstract keyword that's known as abstract class
      no code no implementation and just declaration the method without code.we can create abstract method
      and concreatemethod that's known as abstract classes.
 *   Rules for abstract keyword:
 *       1. abstract class:
 *           * A class that is declared abstract
 *           * You cannot create object of abstract class
 *           * It may or may not contain abstract methods
 *
 *       2. abstract method:
 *           * No method body. You cannot write code in abstract method.
 *           * It is mandatory to override the abstract method in child class.
 *
 * */

public class AbstractMain {
    public static void main(String [] args){
        //Man man = new Man();  -not allowed can not create object of abstract classes
        Man manObj; //but we can create the reference of abstract class
        Man man  = new Male(); // parent class reference -->child class object
        man.eat();
        man.run();

        /*manObj = new Male();
        manObj.eat();
        manObj.run();*/
    }
}

abstract class Man{
   public void run(){
     System.out.println("human is very cleverest except animal");
   }
   abstract public void eat();
}

class Male extends Man{

    @Override
    public void eat() {
        System.out.println("man is very greedy to eat something except human");
    }

}