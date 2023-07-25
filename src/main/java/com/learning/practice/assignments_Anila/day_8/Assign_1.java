package com.learning.practice.assignments_Anila.day_8;

import com.learning.practice.vo.interfaces.ListInterface;

import static com.learning.practice.utils.Utils.print;

public class Assign_1 {
    public static void main(String[] args) throws Exception {
        // Implement doubly linked list
        CustomDoubleLinkedList list = new CustomDoubleLinkedList();

        list.add(1);
        print(list);

        list.add(2);
        print(list);

        list.add(3);
        print(list);

        list.addAtIndex(1, 22);
        print(list);

        list.remove(2);
        print(list);

        list.removeAtIndex(2);
        print(list);
    }
}

class CustomDoubleLinkedList implements ListInterface<Integer> {
    Node head;
    Node tail;
    int count;

    public Integer getAtIndex(int index) throws Exception {
        if(index >= getSize()){
            throw new Exception("Index is greater than size of the list");
        }
        Node currNode = head;
        int counter = 0;
        while (counter < index) {
            currNode = currNode.next;
            counter++;
        }
        return currNode.value;
    }

    @Override
    public void add(Integer value) {
        Node newNode = new Node(value);
        if (head == null) {
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

    @Override
    public void addAtIndex(int index, Integer value) throws Exception{
        if(index >= getSize()){
            throw new Exception("Index out of bound for " + index + " in " + getSize());
        }
        int counter = 0;
        Node newNode = new Node(value);
        Node currNode = head;
        while (counter < index) {
            currNode = currNode.next;
            counter++;
        }
        newNode.prev = currNode.prev;
        currNode.prev.next = newNode;
        currNode.prev = newNode;
        newNode.next = currNode;
        count++;
    }

    @Override
    public void remove(Integer value) throws Exception {
        Node currNode = head;

        while (currNode.value != value && currNode != tail) {
            currNode = currNode.next;
        }

        if (currNode == head) {
            head = currNode.next;
            count--;
        }

        if (currNode == tail) {
            if (currNode.value != value) {
                throw new Exception("Value not found in list");
            }
            tail = currNode;
            tail.next = null;
            count--;
        }

        currNode.prev.next = currNode.next;
        currNode.next = currNode.prev;
        count--;

    }

    @Override
    public void removeAtIndex(int index) throws Exception {
        if(index >= getSize()){
            throw new Exception("Index out of bound for " + index + " in " + getSize());
        }

        if (index == 0) {
            head = head.next;
            count--;
            return;
        }

        int counter = 0;
        Node currNode = head;

        while (counter < index) {
            currNode = currNode.next;
            counter++;
        }

        if (currNode == tail) {
            tail = currNode.prev;
            tail.next = null;
            count--;
            return;
        }

        currNode.next.prev = currNode.prev;
        currNode.prev.next = currNode.next;

        count--;
    }

    public int getSize() {
        return count;
    }
}

class Node {
    int value;
    Node next;
    Node prev;

    Node() {
    }

    Node(int value) {
        this.value = value;
    }
}
