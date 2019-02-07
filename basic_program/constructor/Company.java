package constructor;

public class Company {
    String domain ="android developer";

    public Company() {
        this.domain = domain;
    }

    public static void main(String []args){
        Company obj = new Company();
        System.out.println("the company values::"+obj.domain);
    }
}
