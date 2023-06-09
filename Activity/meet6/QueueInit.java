import java.util.Arrays;
class QueueInit { //contains queue methods
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;
    
    public QueueInit(int s) { //constructor
        maxSize = s;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public void enqueue(int j) { //put item at rear of queue
        if (rear == maxSize - 1) {
            rear = -1;
        } //deal with wraparound
        queueArray[++rear] = j; //increment rear and insert
        nItems++; //one more item
    }

    public int dequeue() { //take item from front of queue
        int temp = queueArray[front++]; //get value and increment front
        if (front == maxSize) {
            front = 0;
        } //deal with wraparound
        nItems--; //one less item
        return temp;
    }

    public boolean isEmpty() { //true if queue is empty
        return (nItems == 0);
    }

    public boolean isFull() { //true if queue is full
        return (nItems == maxSize);
    }

    public void printQueue() {
        System.out.println(Arrays.toString(queueArray));
    }
}
