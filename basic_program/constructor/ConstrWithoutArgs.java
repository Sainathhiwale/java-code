package constructor;

public class ConstrWithoutArgs {
    int salary;
    String name;
    String address;

    public ConstrWithoutArgs() {
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

    public static void main(String [] args){
        ConstrWithoutArgs obj = new ConstrWithoutArgs();
        obj.salary=180000;
        obj.name ="Sainath";
        obj.address="Pune sinhgad college";
        System.out.println("the name values is::"+obj.name);
        System.out.println("the salary values is::"+obj.salary);
        System.out.println("the address values is::"+obj.address);

    }
}
