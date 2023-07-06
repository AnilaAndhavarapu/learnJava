package com.learn.java.practice.assignments_Janhavi.day_7;

public class Assign_2 {
    public static void main(String[] args) throws Exception {

        // Implement a CustomLinkedList class which will have insert, remove, get and size methods
        // You cannot use LinkedList Array

        CustomLinkedList list = new CustomLinkedList();

    }
}

class CustomLinkedList{

    public CustomLinkedList(){
    }

    public void add(int value){
    }

    public boolean addAtIndex(int index){
        return true;
    }

    public void setAtIndex(int index, int setnum) throws Exception{
    }

    public boolean remove(int value){
        return true;
    }

    public void removeAtIndex(int index)throws NullPointerException{

    }

    public int getAtIndex(int index) throws Exception{
        return index;
    }

    public int getSize(){
        return 1;
    }
}

class Node{
    int value;
    Node next;

    Node(){}

    public Node(int value){
        this.value = value;
    }
}
