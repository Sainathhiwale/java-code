package execption.unchecked_exception;

public class NumberFormatEx {
    public static void main(String []args){
        try {
            String str="abcd";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println(e);
        }

    }
}
