package main;

import linkedList.CircularSinglyLinkedList;

public class Principal {

    public static void main(String[] args) {

        CircularSinglyLinkedList circularSinglyLL_list = new CircularSinglyLinkedList();

        System.out.println("<<List after adding three nodes at the beginning>>");
        circularSinglyLL_list.insertAtStart(-11);
        circularSinglyLL_list.insertAtStart(15);
        circularSinglyLL_list.insertAtStart(42);
        circularSinglyLL_list.print();

        System.out.println("\n<<List after adding three nodes at the end>>");
        circularSinglyLL_list.insertAtEnd(36);
        circularSinglyLL_list.insertAtEnd(71);
        circularSinglyLL_list.insertAtEnd(-3);
        circularSinglyLL_list.print();

        System.out.println("\n<<List after deleting the first node>>");
        circularSinglyLL_list.deleteNode(42);
        circularSinglyLL_list.print();

        System.out.println("\n<<List after deleting the last node>>");
        circularSinglyLL_list.deleteNode(-3);
        circularSinglyLL_list.print();

        System.out.println("\n<<List after deleting node 36>>");
        circularSinglyLL_list.deleteNode(36);
        circularSinglyLL_list.print();

        System.out.println("\n<<List after deleting node 99>>");
        circularSinglyLL_list.deleteNode(99);
        circularSinglyLL_list.print();

        System.out.println("\n<<List after deleting node -11>>");
        circularSinglyLL_list.deleteNode(-11);
        circularSinglyLL_list.print();

        System.out.println("\n<<List after deleting node 71>>");
        circularSinglyLL_list.deleteNode(71);
        circularSinglyLL_list.print();

        System.out.println("\n<<List after deleting node 15>>");
        circularSinglyLL_list.deleteNode(15);
        circularSinglyLL_list.print();
    }

}
