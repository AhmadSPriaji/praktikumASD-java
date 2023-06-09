// Stack.java
// demonstrates stack
import java.io.IOException; //exception for I/0
import java.util.Scanner; //for input
    
public class Stack {
    public static void main(String[] args) throws IOException {
        int stackSize; //stack size
        int stackNum; //number to be inserted in stack
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many integer? ");
        stackSize = in.nextInt(); //insert stack size
        
        StackInit theStack = new StackInit(stackSize); //make new stack
        for (int i = 0; i < stackSize; i++) {
            System.out.print("Enter number: ");
            stackNum = in.nextInt(); //insert number
            theStack.push(stackNum); //push element onto stack
        }
        theStack.printStack(); //print Stack
        
        while (!theStack.isEmpty()) { //until it is empty, delete item from stack
            double value = theStack.pop();
            System.out.print(value); //display the popped item
            System.out.print(" ");
        }
        System.out.println("");
        
        //tambahan close Scanner 'in'
        in.close();
    } // end main()
} //end class Stack