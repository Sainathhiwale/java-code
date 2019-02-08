package execption.unchecked_exception;

public class ArrayIndexBoundEx {
    public static void main(String []args){
        try {
            String [] str = new String[5];
            str[6]="exception";
            System.out.println(str[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
