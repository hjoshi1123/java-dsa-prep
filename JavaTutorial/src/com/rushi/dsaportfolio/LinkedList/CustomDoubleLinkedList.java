package com.rushi.dsaportfolio.LinkedList;

public class CustomDoubleLinkedList {
    private Node head = null;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertLast(int val) {
        Node last = head;
        if(head == null) {
            head = new Node(val, null, null);
            return;
        }
        while(last.next != null) {
            last = last.next;
        }
        last.next = new Node(val, null, last);
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
