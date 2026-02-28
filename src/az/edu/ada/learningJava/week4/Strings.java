package az.edu.ada.learningJava.week4;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String example = "ABC...XYZ";
        System.out.println(reverse(example));
        System.out.println(explode(example));
        System.out.println(sort(example));
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

}
