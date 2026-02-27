package az.edu.ada.learningJava.week4;

import java.util.Scanner;

public class CLIArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User input: ");
        String user_inp = scanner.nextLine();
        System.out.println(user_inp);
    }
}
