package az.edu.ada.learningJava.week4;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String example = "ABC...XYZ";
        System.out.println(reverse(example));
        System.out.println(explode(example));
        System.out.println(sort(example));
        System.out.println(isAnagram(example, "YZX.A.B.C"));
        System.out.println(isAnagram(example, "YWX.A.B.C"));

        String sentence = "I am learning Java";
        System.out.println(mix(sentence));
    }

    public static String reverse(String str){
        // StringBuilder sb = new StringBuilder(str);
        // return sb.reverse().toString();
        String reversedString = "";
        for (int i = str.length() - 1; i > -1; i--){
            reversedString = reversedString + str.charAt(i);
        }
        return reversedString;
    }

    public static String explode(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            sb.append(str.substring(0, i + 1));
        }
        return sb.toString();
    }

    public static String sort(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean isAnagram(String str1, String str2){
        return sort(str1).equals(sort(str2));
    }

    public static String mix(String str){
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            char firstChar = sb.charAt(0);
            sb.setCharAt(0, sb.charAt(sb.length() - 1));
            sb.setCharAt(sb.length() - 1, firstChar);
            words[i] = new String(sb);
        }
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            if (i == words.length - 1) sentence.append(words[i]);
            else{
                sentence.append(words[i]);
                sentence.append(" ");
            }
        }
        return sentence.toString();
    }

}
