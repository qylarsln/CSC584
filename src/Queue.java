// Node definition
class Node {
   // package access data so class List can access it directly
   Object data;    
   Node next;

   public Node(Object data) {
       this.data = data;
       this.next = null; // Initialize next to null
   }

   // Return a reference to the Object in this node
   Object getObject() { return data; }

   // Return the next node
   Node getNext() { return next; }
}

public class Queue {
    private Node front;
    private Node rear;
    private Node newNode;

    public Queue() { }

    public boolean isEmpty() {
        return front == null;
    }

    // Method to enqueue (insert) item at the back of the queue
    public void enqueue(Object item) {
        newNode = new Node(item); // Create a new node with the provided data

        if (isEmpty()) {
            front = newNode; // If the queue is empty, set both front and rear to the new node
            rear = newNode;
        } else {
            rear.next = newNode; // Set the next of the current rear node to the new node
            rear = newNode; // Update the rear to point to the new node
        }
    }

    // Method to dequeue (delete) the first element from the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        // Move front to the next node
        front = front.next;

        // If front becomes null, set rear to null as well
        if (front == null) {
            rear = null;
        }
    }

    // Method to return the first element
    public Object getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return front.data;
    }

    // Method to return the last element
    public Object getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return rear.data;
    }

    // Method to print the queue
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.data.toString() + " ");
            current = current.next;
        }

        System.out.println("\n");
    }
}
