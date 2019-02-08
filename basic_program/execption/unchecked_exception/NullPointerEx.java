package execption.unchecked_exception;

public class NullPointerEx {
    public static void main(String []args){
        try {
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
