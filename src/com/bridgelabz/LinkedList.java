package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> Tail;

    public void add(T data) {
        Node<T> newNode = new Node<>();
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addStart(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void addAt(int index, T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        if (index == 0) {
            addStart(data);
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }
    public void deleteStart() {
      Node<T> node=head;
      head=head.next;
      System.out.println("deleted is: "+node.data);
    }
    public void deleteAt(int index) {
        if(index==0) {
            deleteStart();
        } else {
            Node<T> node = head;
            Node<T> node1 = null;
            for(int i=0;i< index-1;i++) {
                node=node.next;
            }
            node1=node.next;
            node.next=node1.next;
            System.out.println(node1.data);
        }
    }

    public void print(int index) {
        Node<T> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void print() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}
