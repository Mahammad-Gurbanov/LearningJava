package az.edu.ada.learningJava.week9;


import java.util.*;

public class CharOccurences {
    public static void main(String[] args) {
        NavigableMap<Character, Integer> charCount = new TreeMap<>();
        NavigableMap<Character, ArrayList<Integer>> charIndices = new TreeMap<>();
        String userString;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        userString = sc.nextLine();

        // find char count
        for (int i = 0; i < userString.length(); i++){
            if (!charCount.containsKey(userString.charAt(i))){
                charCount.put(userString.charAt(i), 1);
            } else {
                charCount.put(
                        userString.charAt(i),
                        charCount.get(userString.charAt(i)) + 1
                );
            }
        }

        // store char indices
        for (int i = 0; i < userString.length(); i++){
            if (!charIndices.containsKey(userString.charAt(i))){
                charIndices.put(userString.charAt(i), new ArrayList<>());
            }
            charIndices.get(userString.charAt(i)).add(i);
        }

        // print the chars in alphabetical order
        System.out.println("Print the chars in alphabetical order");
        for (char chr: charCount.keySet()){
            System.out.println("Char: " + chr);
            System.out.println("Count: " + charCount.get(chr));
            System.out.println("Indices" + charIndices.get(chr));
            System.out.println();
        }

        // print char in reverse alphabetical order
        System.out.println("Print data in reverse order");
        for (char chr : charCount.descendingMap().keySet()){
            System.out.println("Character: " + chr);
            System.out.println("Count: " + charCount.get(chr));
            System.out.println("Indices: " + charIndices.get(chr));
            System.out.println();
        }

    }
}
