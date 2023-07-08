package com.learn.java.practice.assignments_Janhavi.day_7;

import java.util.ArrayList;
import java.util.List;

public class Assign_2 {
    public static void main(String[] args) throws Exception{

        // Implement a CustomLinkedList class which will have insert, remove, get and size methods
        // You cannot use LinkedList Array

        CustomLinkedList list = new CustomLinkedList();
        list.add(11);
        list.add(12);
        System.out.println("size="+list.getSize());
        list.add(5);
        list.add(8);
        list.add(9);
        System.out.println("size="+list.getSize());
        for(int i=0; i< list.getSize();i++) {
            System.out.print(list.getAtIndex(i)+" ");
        }
        System.out.println("");
        list.addAtIndex(2,21);
        System.out.println("final list");
        for(int i=0; i< list.getSize();i++) {
            System.out.print(list.getAtIndex(i)+" ");
        }
        System.out.println("");
        System.out.println("size="+list.getSize());

        list.remove(11);
        System.out.println("final element removed list");
        for(int i=0; i< list.getSize();i++) {
            System.out.print(list.getAtIndex(i)+" ");
        }
        System.out.println("");
        System.out.println("size="+list.getSize());


    }
}

class CustomLinkedList{
     Node head;
     int count=0;
    public CustomLinkedList(){
        head =new Node();
    }

    public void add(int value){
        Node newNode=new Node(value);
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode = currNode.next;
        }
        currNode.next=newNode;
        count++;
    }

    public void addAtIndex(int index, int value){


       Node addNode =new Node(value);
       Node currNode=head;
       for(int i=0;i<index-1;i++)
      {
           currNode=currNode.getNextNode();
      }
       addNode.setNextNode(currNode.getNextNode());
       currNode.setNextNode(addNode);
      count++;


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

    public void remove(int value) throws NullPointerException{
        Node currNode=head;
        Node preNode=null;
        if (head == null) {
            throw new NullPointerException("Empty list");
        }
        while(currNode!=null)
        {
            if(currNode.value==value)
            {
                if(preNode==null){
                head=currNode.getNextNode();
            }
            else {
                    preNode.setNextNode(currNode.getNextNode());
                }
                count--;
                break;
            }

            preNode=currNode;
            currNode=currNode.getNextNode();


        }


    }

    public void removeAtIndex(int index)throws NullPointerException{
        int counter = 0;
        Node currNode = head;
        Node prevNode = currNode;
       if(counter==index)
       {
            currNode = currNode.next;
            head = currNode;
            count--;
       }else {
        while (counter <= index) {
            prevNode = currNode;
            currNode = currNode.next;
            counter++;
        }
        prevNode.next = currNode.next;
        count--;
             }

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

    public Node getNextNode(){
        return next;
    }
    public void setNextNode(Node next) {
        this.next = next;
    }
}
