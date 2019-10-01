package mcaeList;

import java.util.Arrays;

public class MLinkedList {
    private Node head;
    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    //Adding elements to the list (Insert a Node at the Tail of a Linked List)
    public void addTo(int value) {
        if (head == null) {
            head = new Node(value);
            size++;
            return;
        }
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new Node(value));
        size++;
    }

    //Printing elements of the list
    //toString
    public String toString() {
        int[] arr = new int[size];
        int i = 0;
        Node node = head;
        while (node != null) {
            arr[i] = node.getValue();
            node = node.getNext();
            i++;
        }
        return Arrays.toString(arr);
    }
    //just printing
    public void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
    }

    //Insert a node at the head of a linked list
    public void insertHead(int value) {
        if (head == null) {
            head = new Node(value);
            size++;
            return;
        }
        Node head = new Node(value);
        head.setNext(this.head);
        this.head = head;
        size++;
    }
    // Reverse a linked list
    public void reverseListArr() {
        if (head == null) {
            return;
        }
        int[] arr = new int[size];
        int i = 0;
        Node node = head;
        while (node != null) {
            arr[i] = node.getValue();
            node = node.getNext();
            i++;
        }
        Node temp = head;
        for (int j = size - 1; j >= 0; j--) {
            temp.setValue(arr[j]);
            temp = temp.getNext();
        }
    }
    //Iterative approach
//https://www.geeksforgeeks.org/reverse-a-linked-list/
//https://youtu.be/jY-EUKXYT20
        public void reverseListIterat(){
            head=reverseListIter();
        }

        private Node reverseListIter() {
            if (head == null) {
                return null;
            }
            Node prev=null;
            Node current=head;
            Node fwd=null;
            while (current!=null){
                fwd= current.getNext();
                current.setNext(prev);
                prev = current;
                current = fwd;
            }
                head=prev;
                return head;
            }

//Reverse a Linked List: Recursive | Java
//https://www.youtube.com/watch?v=Ip4y7Inx7QY
    public void reverseListRecursion(){
        head=reverseListRec(this.head);
    }
    private Node reverseListRec(Node curr) {
        if (curr == null){
            return null;
        } else if(curr.getNext()==null){
            return curr;
        } else{
            Node nextNode=curr.getNext();
            curr.setNext(null);
            Node rest=reverseListRec(nextNode);
            nextNode.setNext(curr);
            return rest;
        }
    }

    }




