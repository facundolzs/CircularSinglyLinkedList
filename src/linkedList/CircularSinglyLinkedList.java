package linkedList;

public class CircularSinglyLinkedList {

    private Node head;
    private Node tail;

    private class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Insert new node at the start of linked list
     *
     * @param data (data of new node)
     */
    public void insertAtStart(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    /**
     * Insert new node at the end of linked list
     *
     * @param data (data of new node)
     */
    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            insertAtStart(data);
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    /**
     * Delete specific node in linked list
     *
     * @param data (node data to delete)
     */
    public void deleteNode(int data) {

        Node tempNode = head;

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        do {
            Node nextTempNode = tempNode.next;
            if (nextTempNode.data == data) {
                if (tail == head) {
                    head = null;
                    tail = null;
                } else {
                    tempNode.next = nextTempNode.next;
                    if (head == nextTempNode) {
                        head = head.next;
                    }
                    if (tail == nextTempNode) {
                        tail = tempNode;
                    }
                }
                return;
            }
            tempNode = nextTempNode;
        } while (tempNode != head);

        if (tempNode.data != data) {
            System.out.println("Node " + data + " doesn't exist");
        }
    }

    /**
     * Display linked list
     */
    public void print() {

        Node tempNode = head;

        if (tempNode != null) {
            if (tempNode.next == null) {
                System.out.print(tempNode.data + " -> ");
            } else {
                do {
                    System.out.print(tempNode.data + " -> ");
                    tempNode = tempNode.next;
                } while (tempNode != head);
            }
            System.out.println("END.");
        } else {
            System.out.println("Linked list is empty");
        }
    }

}
