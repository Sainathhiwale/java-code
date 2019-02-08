package execption.try_catch;

public class MultipleCatchBlock {
    public static void main(String []args){
        try {
            int []ary = new int[5];
            ary[6] =34;
            System.out.println(ary[6]);
        }catch (NumberFormatException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } finally{
            System.out.println("clean up the code");
        }

    }
}
