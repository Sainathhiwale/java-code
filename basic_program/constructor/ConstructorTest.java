package constructor;

public class ConstructorTest {
    int salary;
    String name;
    String address;

    public ConstructorTest() {
        this.salary = salary;
        this.name =name;
        this.address= address;
    }

    public static void main(String []args){
        ConstructorTest obj = new ConstructorTest();
        obj.salary= 1000;
        obj.name ="sainath";
        obj.address ="at post wahegoan tel:gangapur dist:Aurangabad";
        System.out.println("the salary::"+obj.salary);
        System.out.println("the name::"+obj.name);
        System.out.println("the address::"+obj.address);


    }
}
