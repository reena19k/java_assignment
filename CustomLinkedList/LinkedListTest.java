package com.aurionpro.test;
import com.aurionpro.model.*;
public class LinkedListTest {
    public static void main(String[] args) {
                LinkedList customLinkedList = new LinkedList();
                customLinkedList.add(5);
                customLinkedList.add(10);
                customLinkedList.add(15);
                customLinkedList.add(20);
                customLinkedList.remove(10);
                customLinkedList.display();
               for(LinkedList items : customLinkedList){
                    System.out.println(items);
                }

            }
    }



