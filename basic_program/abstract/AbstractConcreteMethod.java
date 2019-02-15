package abstract_test;


abstract class Mator {
    public void run() { //concreate method
        System.out.println("mator can run ");
    }

    public void fuel() {
        System.out.println("mator needs the fuel for running");

    }
    public void breaks(){
        System.out.println("mator has a break ");
    }
    abstract public void stop(); //abstract method

}
class Car extends Mator{

    @Override
    public void stop() {
        System.out.println("mator can be stop by electronic city ");

    }
}

public class AbstractConcreteMethod {
    public static void main(String[] args) {
        Mator mator ;// create the reference of abstract class
        mator = new Car();  //parent class referece with --child class object
        mator.breaks();
        mator.fuel();
        mator.run();
        mator.stop();

    }
}

