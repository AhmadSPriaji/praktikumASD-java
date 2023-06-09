import java.util.Arrays;
class StackInit { //contains stack methods
    private final int maxSize; //size of stack array
    private int[] stackArray; //initialize array
    private int top; //top of stack
    
    public StackInit(int s) { //constructor
        maxSize = s; //set array size
        stackArray = new int[maxSize]; //create array
        top = -1; //no items yet
    }
    
    public void push(int j) { //put item on top of stack
        stackArray[++top] = j; //increment top, insert item
    }
    
    public double pop() { //take item from top of stack
        return stackArray[top--]; //access item, decrement top
    }

    public boolean isEmpty() { //true if stack is empty
        return (top == -1);
    }

    public void printStack() {
        System.out.println(Arrays.toString(stackArray));
    }

} // end class StackInit