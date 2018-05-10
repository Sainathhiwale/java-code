// get last and first element from the given linkedlist data structure 
import java.util.LinkedList;
public class LF_LinkedList{

public static void main(String []args)
{
    LinkedList <String>lList = new LinkedList<String>();
    lList.add("8");
    lList.add("5");
    lList.add("3");
    lList.add("9");
    lList.add("1");
   System.out.println("First element of LinkedList is:"+lList.getFirst());
   System.out.println("Last element of LinkedList is:"+lList.getLast());
   
}
}

