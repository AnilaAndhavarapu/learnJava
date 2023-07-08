package com.learning.practice.assignments_Anila.day_7;

import com.learning.practice.vo.interfaces.ListInterface;

import static com.learning.practice.utils.Utils.print;

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
        list.remove(9);
        System.out.println("After remove size : " + list.getSize());
        print(list);

        list.removeAtIndex(0);
        print(list);

        list.setAtIndex(2,10);
        print(list);
    }
}

class CustomLinkedList implements ListInterface<Integer> {
    Node head;
    int count = 0;

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

    @Override
    public void add(Integer value) {
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

    @Override
    public void addAtIndex(int index, Integer value) {

    }

    @Override
    public void remove(Integer value) {
        Node currNode = head;
        Node prevNode = currNode;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        count--;
    }

    @Override
    public void removeAtIndex(int index) throws Exception {
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
    }

    public Integer getAtIndex(int index) throws Exception {
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
