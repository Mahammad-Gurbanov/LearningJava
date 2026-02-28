package az.edu.ada.learningJava.week4;

public class Strings {
    public static void main(String[] args) {
        String example = "ABC...XYZ";
        System.out.println(reverse(example));
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

}
