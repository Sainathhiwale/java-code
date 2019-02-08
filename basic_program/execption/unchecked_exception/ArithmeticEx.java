package execption.unchecked_exception;

public class ArithmeticEx {
    public static void main(String []args){
        int a=10;
        try {
            int sum =a/0;
            System.out.println(sum);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
        }
        }

}
