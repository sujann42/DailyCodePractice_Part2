package com.linkedlist;

public class MiddleElement {
    private Node head;

    public MiddleElement() {
        this.head = null;
    }

    public Node insert(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = new Node(data);
            temp.next = head;

            head = temp;
        }
        return head;
    }
    public void tradWayGetMiddleElemFromLinkedList() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle of the linked list is: " + slow.data);
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        MiddleElement ll = new MiddleElement();
        ll.insert(6);
        ll.insert(5);
        ll.insert(8);
        ll.insert(9);
        ll.insert(15);
        ll.insert(13);


        ll.print();
        ll.tradWayGetMiddleElemFromLinkedList();
    }
}
//13 15 9 8 5 6 Middle of the linked list is: 8
