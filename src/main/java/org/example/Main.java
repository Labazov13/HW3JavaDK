package org.example;

import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        /*String t = "ololo";
        DataInputStream v = new DataInputStream(System.in);
        Integer k = 5;
        Task1 <String, DataInputStream, Integer> task1 = new Task1<>(t, v, k);
        task1.getTypes();*/
        Number [] num = new Number[3];
        num[0] = 1;
        num[1] = 2.0f;
        num[2] = 3L;
        Task2<Number> list = new Task2<>(num);
        list.printList();

        for(Number number : list){
            System.out.println(number);
        }

        /*Integer nuum = 5;
        list.addElement(nuum);
        list.printList();*/
    }
}