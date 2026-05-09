package az.edu.ada.learningJava.week10;

import java.util.*;
import java.util.function.Predicate;

public class CustomCounter{
    public static <T> int count(Collection<T> items, Predicate<T> predicate){
        int counter = 0;
        for (T item: items){
            if (predicate.test(item)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(12);
        integers.add(13);
        integers.add(11);
        integers.add(-20);

        System.out.println("Count evens");
        System.out.println(CustomCounter.count
                (
                integers,
                num -> {return num % 2 == 0;}
                )
        );
    }
}
