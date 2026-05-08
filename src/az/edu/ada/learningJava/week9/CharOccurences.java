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

        System.out.println("Unique Letters");
        System.out.println(getUniqueChars("Actionable"));
        System.out.println(getUniqueChars("Spectacular"));
    }

    public static List<Character> getUniqueChars(String str){
        str = str.toLowerCase();
        ArrayList<Character> uniqueChars = new ArrayList<>();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++){
            if (!charCount.containsKey(str.charAt(i))){
                charCount.put(str.charAt(i), 0);
            }
            charCount.put(str.charAt(i), charCount.get(str.charAt(i)) + 1);
        }

        for (Map.Entry<Character, Integer> entry: charCount.entrySet()){
            if (entry.getValue() == 1){
                uniqueChars.add(entry.getKey());
            }
        }

        return uniqueChars;
    }
}
