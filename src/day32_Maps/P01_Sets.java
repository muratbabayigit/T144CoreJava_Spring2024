package day32_Maps;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class P01_Sets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        long baslangicZamani= LocalTime.now().toNanoOfDay();
        Random rnd = new Random();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(rnd.nextInt());
        }
        long bitisZamani= LocalTime.now().toNanoOfDay();

        System.out.println("HashSet Süre: "+(bitisZamani-baslangicZamani));




       baslangicZamani= LocalTime.now().toNanoOfDay();

        for (int i = 0; i < 1000000; i++) {
            treeSet.add(rnd.nextInt());
        }
        bitisZamani= LocalTime.now().toNanoOfDay();

        System.out.println("TreeSet Süre: "+(bitisZamani-baslangicZamani));
    }
}
