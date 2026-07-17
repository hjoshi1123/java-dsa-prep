package com.LinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void add(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtIndex(int val, int idx) {
        if (idx == 0) {
            insertFirst(val);
            return;
        }
        if (idx == size) {
            add(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void deleteLast() {
        if(tail == null) {
            return;
        }
        if(head == tail) {
            head = null;
            tail = null;
        }
        Node prev = head;
        Node temp = head.next;
        while(temp != tail) {
            temp = temp.next;
            prev = prev.next;
        }
        prev.next = null;

        size--;
    }

    public Node get(int idx) {
        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public int delete(int idx) {
        if(head == tail){
            deleteFirst();
        }
        Node del = get(idx);
        Node prev = get(idx-1);
        prev.next = del.next;
        size--;
        return del.val;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
