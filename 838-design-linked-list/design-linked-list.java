class MyLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {

        // Invalid index
        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        // Empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
        } 
        else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        // Empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
        } 
        else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        // Invalid index
        if (index < 0 || index > size) {
            return;
        }

        // Insert at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        // Insert at tail
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);

        Node prevNode = head;

        // Reach node just before index
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }

        newNode.next = prevNode.next;
        prevNode.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {

        // Invalid index
        if (index < 0 || index >= size) {
            return;
        }

        // Delete head
        if (index == 0) {
            head = head.next;
            size--;

            // List became empty
            if (size == 0) {
                tail = null;
            }

            return;
        }

        Node prevNode = head;

        // Reach node before the one to delete
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }

        // If deleting tail
        if (prevNode.next == tail) {
            tail = prevNode;
        }

        prevNode.next = prevNode.next.next;

        size--;
    }
}