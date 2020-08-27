package com.vinaylogics.playwithjava.datastructures.collection.list;

public class MyLinkedList {
    Node head; // head of the list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * To insert node to the linkedlist
     * @param data - data to insert to the node
     */
    public void insert( int data){
        // Create a new Node
        Node newNode = new Node(data);
        // If linked list is empty,
        // then make the new node as head
        if(head == null){
            head = newNode;
        }else {
            // Else Traverse to the last node
            // add insert the new node to the last node
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            // Insert the new node to the last node
            last.next = newNode;
        }

    }

    public void printList(){
        Node currNode = head;
        System.out.println("Linked List");

        // Traverse through the linked list
        while (currNode != null){
            // Print the data at current node
            System.out.print(currNode.data +"\t");

            // Go to the next node
            currNode = currNode.next;
        }
    }


}
