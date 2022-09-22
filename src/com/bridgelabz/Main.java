package com.bridgelabz;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        list.addStart(5);
        list.print();
        list.deleteAt(2);
        list.print();

    }
}
