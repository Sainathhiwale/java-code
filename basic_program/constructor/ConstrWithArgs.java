package constructor;

import java.util.List;

public class ConstrWithArgs {
    int salary;
    String name;
    String address;

    public ConstrWithArgs(int salary, String name, String address) {
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

    public static void main(String [] args){
        ConstrWithArgs obj = new ConstrWithArgs(10000,"Sainath","Pune");
        ConstrWithArgs obj2 = new ConstrWithArgs(250000,"Sainath","Bangalore");
        System.out.println(obj.name);
        System.out.println(obj.salary);
        System.out.println(obj.address);

        System.out.println(obj2.name);
        System.out.println(obj2.salary);
        System.out.println(obj2.address);



    }
}
