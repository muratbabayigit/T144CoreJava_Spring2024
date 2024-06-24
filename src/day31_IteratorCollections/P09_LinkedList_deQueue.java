package day31_IteratorCollections;

import java.util.Deque;
import java.util.LinkedList;

public class P09_LinkedList_deQueue {

    public static void main(String[] args) {

        //Dequeue: İki uçlu kuyruk (double end queue)

        Deque<Integer> sayilar=new LinkedList();

        sayilar.add(120);
        sayilar.add(45);
        sayilar.add(90);
        sayilar.add(60);
        System.out.println(sayilar); // [120, 45, 90, 60]

        sayilar.addFirst(712);
        sayilar.addLast(886);

        System.out.println(sayilar);

        // iki uçlukuyruk olmasından dolayı çoğu method ....first() ve .....last() şeklindedir

        System.out.println(sayilar.getFirst());
        System.out.println(sayilar.getLast());

        sayilar.offer(20); //sona elaman ekler(default)
        System.out.println(sayilar.offerFirst(45)); // Başa eleman ekler -true
        System.out.println(sayilar.offerLast(1236)); //Sona eleman ekler -true
        System.out.println(sayilar);

        System.out.println(sayilar.pop()); //pop ilk elemanı siler ve sildiği elemanı yazdırır
        System.out.println(sayilar);

        System.out.println(sayilar.element());
        System.out.println(sayilar.poll());
        System.out.println(sayilar);

        sayilar.removeFirstOccurrence(120);

        System.out.println(sayilar);


        System.out.println("**********************************");
        Deque<Integer> sayilar2=new LinkedList();

        System.out.println(sayilar2.poll());        // hata vermeden null olduğunu belirtiyor
        // System.out.println(sayilar2.pop());         aynı işlemde hata veriyor NoSuchElements


    }
}
