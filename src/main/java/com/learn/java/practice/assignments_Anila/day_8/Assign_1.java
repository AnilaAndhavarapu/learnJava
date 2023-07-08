package com.learn.java.practice.assignments_Anila.day_8;

import com.learn.java.practice.vo.interfaces.ListInterface;

import static com.learn.java.practice.utils.Utils.print;

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

    }
}

class CustomDoubleLinkedList implements ListInterface<Integer> {
    Node head;
    Node tail;
    int count;

    public Integer getAtIndex(int index){
        Node currNode = head;
        int counter = 0;
        while(counter < index){
            currNode = currNode.next;
            counter++;
        }
        return currNode.value;
    }

    @Override
    public void add(Integer value) {
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

    @Override
    public void addAtIndex(int index, Integer value) {

    }

    @Override
    public void remove(Integer value) {

    }

    @Override
    public void removeAtIndex(int index) {

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
