public class NewQueue {
    int maxSize;
    int[] queueArray;
    int front;
    int rear;
    int nItems;

    public NewQueue(int s) {
        this.maxSize = s;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(int j) {
        if (rear == maxSize -1) {
            rear = -1;
        }
        queueArray[++rear] = j;
        nItems++;
    }

    public int dequeueFront() { //dequeue dari depan
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int dequeueRear() { //dequeue dari belakang
        int temp = queueArray[rear--];
        if (rear == -1) {
            rear = maxSize -1;
        }
        nItems--;
        return temp;
    }

    public boolean isEmpty() { //true if queue is empty 
        return (nItems == 0); 
    }

    public boolean isFull() { //true jika nItems melebihi maxSize
        return (nItems > maxSize); 
    }

    public static void main(String[] args) {
        NewQueue theQueue = new NewQueue(5);
        theQueue.enqueue(1);
        theQueue.enqueue(2);
        theQueue.enqueue(3);
        theQueue.enqueue(4);
        theQueue.enqueue(5);
        // queue awal: [1, 2, 3, 4, 5]

        System.out.println("Dequeue front: "+theQueue.dequeueFront());
        System.out.println("Dequeue rear: "+theQueue.dequeueRear()); 
        System.out.println("Dequeue front: "+theQueue.dequeueFront());

        theQueue.enqueue(7);
        theQueue.enqueue(8);
        theQueue.enqueue(9);

        System.out.println("Finnal queue : ");
        if (!theQueue.isFull()) { //mengeluarkan semua data queue
            while (!theQueue.isEmpty()) {
                System.out.print(theQueue.dequeueFront() + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Queue is full");
        }
    }
}
