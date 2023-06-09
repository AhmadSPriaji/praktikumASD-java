public class SharingStack {
    int maxSize;
    int[] stackArray; // membuat satu array
    int topA;
    int topB;
    boolean isFull;

    public SharingStack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        topA = -1; // indeks awal stack A
        topB = maxSize; // indeks awal stack B
        isFull = false;
    }

    public void pushA(int j) { // menaruh data stack A dari depan array
        if (topA < topB-1){
            stackArray[++topA] = j;
        }
        else {
            isFull = true;
        }
    }

    public void pushB(int j) {  // menaruh data stack B dari belakang array
        if (topA < topB-1) {
            stackArray[--topB] = j;
        }
        else {
            isFull = true;
        }
    }

    public int popA() {
        int temp = stackArray[topA--];
        if (topA < topB-1) {
            isFull = false;
        }
        if (topA == -1) {
            System.out.println("Stack A is empty");
            return -1;
        }
        return temp;
    }

    public int popB() {
        int temp = stackArray[topB++];
        if (topA < topB-1) {
            isFull = false;
        }
        if (topB == maxSize) {
            System.out.println("Stack B is empty");
            return -1;
        }
        return temp;
    }

    public void printStack() {
        if (isFull) {
            System.out.println("Sharing stack is full");
        }
        System.out.println("Stack A: ");
        for (int i = 0; i <= topA; i++) { 
            System.out.print( stackArray[i] + " ");
        }
        System.out.println();
        System.out.println("Stack B: ");
        for (int i = stackArray.length-1; i >= topB; i--) { 
            System.out.print( stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SharingStack theStack = new SharingStack(10);
        theStack.pushA(7);
        theStack.pushA(31);
        theStack.pushA(19);
        theStack.pushA(3);

        theStack.pushB(4);
        theStack.pushB(10);
        theStack.pushB(42);
        theStack.pushB(30);
        theStack.pushB(66);
        theStack.pushB(120); 
        theStack.pushB(200); // stack penuh, tidak tersimpan
        theStack.pushB(72); // stack penuh, tidak tersimpan
        
        theStack.printStack();
        System.out.println();

        System.out.println("Pop A: " + theStack.popA());
        System.out.println("Pop B: " + theStack.popB());
        theStack.pushB(202); 
        theStack.pushB(34); 
        System.out.println();
        theStack.printStack();
    }
}
