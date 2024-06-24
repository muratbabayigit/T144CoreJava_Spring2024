package day31_IteratorCollections;

import java.util.LinkedList;
import java.util.Queue;

public class P08_LinkedList_Queue {

    public static void main(String[] args) {


        /*
        QUEUE: Kuyruk

        yeni gelen eleman sona eklenir çıkarılacak olanda baştan çıkarılır

         */

        Queue <Integer> q1=new LinkedList();

        q1.add(10);
        q1.add(20);
        q1.add(26);
        q1.add(30);
        q1.add(43);
        System.out.println(q1);// [10, 20, 26, 30, 43]
        q1.remove();
        System.out.println(q1); // [20, 26, 30, 43]
        q1.remove(30); //Bildiğimiz bir objeyi sildik
        System.out.println(q1); // [20, 26, 43]


    }
}
