package com.learn.java.practice.assignments_Anila.day_8;

public class Assign_1 {
    public static void main(String[] args) {
        // Implement doubly linked list
        CustomDoubleLinkedList list = new CustomDoubleLinkedList();

        list.add(1);
        print(list);

        list.add(2);
        print(list);

        list.add(3);
        print(list);

    }

    public static void print(CustomDoubleLinkedList list){
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.getAtIndex(i) + ", ");
        }
        System.out.println("Size : " + list.getSize());
    }
}

// Implement
// add, addAtIndex
// remove element, removeAtIndex
// size
// set at Index methods

class CustomDoubleLinkedList{
    Node head;
    Node tail;
    int count;

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = head;
            count++;
            return;
        }
        Node currNode = tail;
        tail = newNode;
        currNode.next = newNode;
        newNode.prev = currNode;
        count++;
    }
    public int getAtIndex(int index){
        Node currNode = head;
        int counter = 0;
        while(counter < index){
           currNode = currNode.next;
           counter++;
        }
        return currNode.value;
    }

    public int getSize(){
        return count;
    }
}

class Node{
    int value;
    Node next;
    Node prev;

    Node(){}
    Node(int value){
        this.value = value;
    }
}
