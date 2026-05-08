package az.edu.ada.learningJava.week9;

import java.util.*;

public class OptionalDemo {
    public static String getWord(String sentence, String prefix){
        sentence = sentence.toLowerCase();
        prefix = prefix.toLowerCase();
        String[] words = sentence.split(" ");
        for (String word: words){
            if (word.startsWith(prefix)){
                return word;
            }
        }
        return "";
    }
}
