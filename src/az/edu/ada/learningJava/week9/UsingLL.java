package az.edu.ada.learningJava.week9;

import java.util.*;

public class UsingLL {
    public static void main(String[] args) {
        int[] randomNums1 = {1, 5, 2, 5, 1, 2, 4, 2, 5, 5, 7};
        int[] randomNums2 = {1, 5, 2, 5, 1, 2, 4, 2, 5, 5, 7};

        // Sort the numbers and add them to linked list
        long start = System.nanoTime();
        Arrays.sort(randomNums1);
        LinkedList<Integer> ll1 = new LinkedList<>();
        for (int num: randomNums1){
            ll1.add(num);
        }
        System.out.println(ll1);
        System.out.println("Time it took: " + (System.nanoTime() - start));

        // add numbers to linked list and then sort them
        start = System.nanoTime();
        LinkedList<Integer> ll2 = new LinkedList<>();
        for (int num: randomNums2){
            ll2.add(num);
        }
        ll2.sort(null);
        System.out.println(ll2);
        System.out.println("Time it took: " + (System.nanoTime() - start));

    }
}
