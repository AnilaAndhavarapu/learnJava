package com.learn.java.practice.assignments_Anila.day_7;

import java.util.LinkedList;

public class Assign_2 {
    public static void main(String[] args) throws Exception {

        // Implement a CustomLinkedList class which will have insert, remove, get and size methods
        // You cannot use LinkedList Array

        CustomLinkedList list = new CustomLinkedList();

        list.add(1);
        print(list);

        list.add(2);
        print(list);

        list.add(5);
        print(list);

        list.add(8);
        print(list);

        list.add(9);
        print(list);

        System.out.println("Before remove size : " + list.getSize());
        list.remove();
        System.out.println("After remove size : " + list.getSize());
        print(list);

        list.removeAtIndex(0);
        print(list);

        list.setAtIndex(2,10);
        print(list);
    }

    public static void print(CustomLinkedList list) throws Exception {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.getAtIndex(i) + ", ");
        }
        System.out.println("");
    }
}

class CustomLinkedList {
    Node head;
    int count = 0;

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        count++;
    }

    public boolean addAtIndex(int index) {
        return true;
    }

    public void setAtIndex(int index, int setnum) throws Exception {
        if (index >= getSize()) {
            throw new Exception("Index out of Bound  " + index + " for " + getSize());
        }
        int counter = 0;
        Node curr = head;
        while (counter < index) {
            curr = curr.next;
            counter++;
        }
        curr.value = setnum;
    }

    public boolean remove() {
        Node currNode = head;
        Node prevNode = currNode;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        count--;
        return true;
    }

    public boolean removeAtIndex(int index) throws Exception {
        if (index >= getSize()) {
            throw new Exception("Index out of Bound  " + index + " for " + getSize());
        }
        int counter = 0;
        Node currNode = head;
        Node prevNode = currNode;

        while (counter < index) {
            prevNode = currNode;
            currNode = currNode.next;
            counter++;
        }

        if(currNode == head){
            head = head.next;
        }
        prevNode.next = currNode.next;
        count--;
        return true;
    }

    public int getAtIndex(int index) throws Exception {
        if (index >= getSize()) {
            throw new Exception("Index out of Bound  " + index + " for " + getSize());
        }

        int counter = 0;
        Node currNode = head;
        while (counter < index) {
            currNode = currNode.next;
            counter++;
        }
        return currNode.value;
    }

    public int getSize() {
        return count;
    }
}

class Node {
    int value;
    Node next;

    Node() {
    }

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
