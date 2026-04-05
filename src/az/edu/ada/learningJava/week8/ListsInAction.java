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

        System.out.println("Remove second index");
        nums.remove(2);
        System.out.println(nums);

        System.out.println("Remove 2 from list");
        nums.remove(Integer.valueOf(2));
        System.out.println(nums);

        nums.add(2);
        nums.add(3);
        if (nums.contains(2)){
            System.out.println("2 is in the list");
        } else {
            System.out.println("2 isn't contained in the list");
        }

        System.out.println("Using a doubly linked list");
        LinkedList<String> groceryItems = new LinkedList<>();
        groceryItems.offerFirst("Bread");
        groceryItems.offerLast("Tea");
        groceryItems.offerFirst("Orange");
        groceryItems.offerLast("Cheese");
        System.out.println(groceryItems.pollFirst());
        System.out.println(groceryItems.peekFirst());
        System.out.println(groceryItems.peekLast());

        nums.add(9);
        nums.add(2);
        nums.add(5);
        nums.add(7);
        System.out.println("Sorting number with collections.sort()");
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("Sorting the value using List.sort()");
        nums.add(1);
        nums.sort(null);
        System.out.println(nums);
    }
}
