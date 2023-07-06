package com.learn.java.practice.assignments_Anila.day_7;

import java.util.LinkedList;

public class Assign_2 {
    public static void main(String[] args) throws Exception {

        // Implement a CustomLinkedList class which will have insert, remove, get and size methods
        // You cannot use LinkedList Array

        CustomLinkedList list = new CustomLinkedList();

        list.add(1);
        list.add(2);
        System.out.println(list.getSize());
        list.add(5);
        list.add(8);
        list.add(9);
        System.out.println(list.getSize());
        list.setAtIndex(2,21);
        System.out.println("updated list");
        System.out.println(list.getAtIndex(2));
        System.out.println("final list");
        for(int i=0; i< list.getSize();i++) {
            System.out.println(list.getAtIndex(i));
        }
        list.removeAtIndex(0);
        System.out.println("final list");
        for(int i=0; i< list.getSize();i++) {
            System.out.println(list.getAtIndex(i));
        }

    }
}

class CustomLinkedList{
    Node head;
    Node tail;
    int count = 0;

    public CustomLinkedList(){
        head = new Node();
        tail = new Node();
    }

    public void add(int value){
        Node newNode = new Node(value);
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        count++;
    }

    public boolean addAtIndex(int index){
        return true;
    }

    public void setAtIndex(int index, int setnum) throws Exception{
       if(index > getSize()){
          throw new Exception("Index out of Bound  " + index + " for " +  getSize());
       }
        int counter = 0;
        Node curr = head;
        while(counter < index){
            curr = curr.next;
            counter++;
        }
        curr.value = setnum;


    }

    public boolean remove(int value){
        return true;
    }

    public void removeAtIndex(int index)throws NullPointerException{
        int counter = 0;
        Node currNode = head;
        Node prevNode = currNode;
//        if(counter==index)
//        {
//            currNode = currNode.next;
//            head = currNode;
//            count--;
//        }else {
            while (counter <= index) {
                prevNode = currNode;
                currNode = currNode.next;
                counter++;
            }
            prevNode.next = currNode.next;
            count--;
 //       }

    }

    public int getAtIndex(int index) throws Exception{
        if(index > getSize()){
            throw new Exception("Index out of Bound  " + index + " for " +  getSize());
        }

        int counter = 0;
        Node currNode = head;
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

    Node(){}

    public Node(int value){
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
