package az.edu.ada.learningJava.week8;
import java.util.*;

public class ListsInAction {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        // Different ways of printing ArrayList
        System.out.println(nums);

        System.out.println("Using a for loop");
        for (int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }

        System.out.println("Using for each loop");
        for (int num: nums){
            System.out.println(num);
        }

        System.out.println("Use an iterator");
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Use listIterator to print the list in reverse order");
        ListIterator<Integer> lit = nums.listIterator(nums.size());
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

    }
}
