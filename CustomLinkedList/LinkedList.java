package com.aurionpro.model;

public class LinkedList {
   private Node head;

   public LinkedList(){
   }
    public void add(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            head = newNode;
        }else {
            Node currentNode = head;
            while(currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }
    public void remove(int key){

        Node currNode = head;
        Node prev = null;

        if (currNode != null && currNode.getData() == key) {
            head = currNode.getNextNode();

            System.out.println(key + " found and deleted");
        }
        while (currNode != null && currNode.getData() != key) {

            prev = currNode;
            currNode = currNode.getNextNode();
        }

        if (currNode != null) {

            prev.setNextNode(currNode.getNextNode());
            System.out.println(key + " found and deleted");
        }
        if (currNode == null) {

            System.out.println(key + " not found");
        }
    }


    public void display(){
        if(head != null){
            Node currentNode = head;
            while(currentNode.getNextNode() != null){
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }
}

