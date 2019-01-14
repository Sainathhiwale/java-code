import java.util.Stack;

public class StackDemo {

    public static void main(String [] args){
        Stack<String> stringStack = new Stack<>();
        //pushing new item(element) to the stack
        //insert new element on top into stack

        stringStack.push("jack");
        stringStack.push("queen");
        stringStack.push("king");
        stringStack.push("ace");

        System.out.println("Stack>="+stringStack);
        System.out.println();

        // Popping items from the Stack
       // remove the element on top into stack using pop operation

        String cardAtTop = stringStack.pop();
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => "+stringStack);
        System.out.println();

        // Get the item at the top of the stack without removing it
        cardAtTop = stringStack.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stringStack);
    }
}
