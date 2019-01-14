import java.util.Stack;

public class StackSizeSearchExample {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("king");
        stringStack.push("queen");
        stringStack.push("part");
        System.out.println(stringStack);

        // Check if the Stack is empty
        System.out.println("Is Stack empty? : " + stringStack.isEmpty());

        // Find the size of Stack
        System.out.println("Size of Stack : " + stringStack.size());

        // Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack

        int position  = stringStack.search("part");
        if (position!=-1){
            System.out.println("Found the element \"Queen\" at position : " + position);
        }else {
            System.out.println("Element not found");

        }


        String itempeek = stringStack.peek();
        System.out.println(itempeek);
         //delete the stack item
        String itemDelete = stringStack.pop();
        System.out.println(itemDelete);



    }


}
