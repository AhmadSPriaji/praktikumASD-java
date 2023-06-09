import java.io.IOException;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) throws IOException {
        int queueSize; //for queue size
        int numTemp; //for inserted number
        int numChoice = 0; //for command
        
        Scanner in = new Scanner(System.in); //for input
        System.out.print("Enter queue size: ");
        queueSize = in.nextInt();
        
        QueueInit theQueue = new QueueInit(queueSize); //set queue
        while (numChoice != 3) {
            System.out.println("\n 1: Enqueue \t 2 : Dequeue \t 3 : End");
            System.out.print("Enter command: ");
            numChoice = in.nextInt();
            if (numChoice == 1) {
                if (theQueue.isFull()) {
                    System.out.println("Queue is full");
                } else {
                    System.out.print("Enter number: ");
                    numTemp = in.nextInt();
                    theQueue.enqueue(numTemp);
                }
            } 
            else if (numChoice == 2) {
                if (theQueue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    numTemp = theQueue.dequeue();
                    System.out.println("Dequeue number: " + numTemp);
                }
            } 
            else if (numChoice != 3) {
                System.out.println("Wrong command");
            }
        } //end main()
        //tambahan close Scanner 'in'
        in.close();
    } //end class Queue
}