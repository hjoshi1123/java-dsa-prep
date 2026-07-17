package com.LinkedList;

public class Main {
    public static void main(String[] args) {
//        CustomLinkedList list = new CustomLinkedList();
//        list.add(2);
//        list.add(4);
//        list.add(87);
//        list.add(65);
//        list.insertFirst(45);
//        list.insertFirst(8);
//        list.insertAtIndex(66, 2);
//        int deletedVal = list.deleteFirst();
//        list.deleteLast();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println();
//        System.out.println(deletedVal);


        CustomDoubleLinkedList dList = new CustomDoubleLinkedList();
        dList.insertFirst(4);
        dList.insertFirst(6);
        dList.insertFirst(15);
        dList.insertFirst(44);
        dList.insertLast(67);
        dList.display();
    }
}
