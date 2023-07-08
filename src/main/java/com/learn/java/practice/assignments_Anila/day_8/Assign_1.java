package com.learn.java.practice.assignments_Anila.day_8;


public class Assign_1 {
    public static void main(String[] args) throws Exception {
        // Implement doubly linked list
        CustomDoubleLinkedList list=new CustomDoubleLinkedList();
        list.add(1);
        print(list);
    }
    public static void print(CustomDoubleLinkedList list) throws Exception {
        for(int i=0; i< list.getSize();i++) {
            System.out.print(list.getAtIndex(i)+" ");
        }
        System.out.print("size"+list.getSize());
    }

}

// Implement
// add, addAtIndex
// remove element, removeAtIndex
// size
// set at Index methods

class CustomDoubleLinkedList{
    // Implement
    // add, addAtIndex
    // remove element, removeAtIndex
    // size
    // set at Index methods

    Node head=null;
    Node tail=null;
    int count=0;

    public void add(int value)
    {
        Node newNode=new Node(value);

        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }else{
            tail.setNextNode(newNode);
            head.setPreviousNode(tail);
            tail=newNode;
        }
        count++;
    }
    public int getSize()
    {
        return count;
    }
    public int getAtIndex(int index) throws Exception {
        if (index > getSize()) {
            throw new Exception("Index out of Bound  " + index + " for " + getSize());
        }

        int counter = 0;
        Node currNode = head;
        while(counter < index){
            currNode = currNode.next;
            counter++;
        }
        return currNode.value;

    }


}

class Node{
    int value;
    Node next;
    Node previous;



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
    public Node getNextNode(){
        return next;
    }
    public void setNextNode(Node next) {
        this.next = next;
    }

    public Node getPreviousNode(){
        return previous;
    }
    public void setPreviousNode(Node previous) {
        this.previous = previous;
    }
}