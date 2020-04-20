package ds;

public class LinearSearch {

    public static void main(String[] args) {
        int ary[] = {10,2,5,6,7,8,9,4};
        int item = 11;
        int temp=0;

        for (int i=0;i<ary.length;i++){

            if (ary[i]==item){
                System.out.println("the item is matched of :"+i+" index position");
                temp = temp+1;
            }
        }
        if (temp ==0){
            System.out.println("the item is not present in this list!");
        }

    }
}
