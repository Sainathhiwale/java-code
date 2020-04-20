package ds;

public class BinarySearch {

    public static void main(String[] args) {

        int ary[] = {2,3,4,5,6,7,8,9,10};
        int li = 0;
        int hi = ary.length-1;
        int mi = (li+hi)/2;
        int search =8;
        while (li<=hi){
            if (ary[mi]==search){
                System.out.println("the item is matched of :"+mi+" index position");
                break;
            }else if (ary[mi]<search){
                li = mi+1;
            }else {
                hi = mi-1;
            }
            mi = (li+hi)/2;
        }
        if (li>hi){
            System.out.println("element is not found!");
        }

    }
}
