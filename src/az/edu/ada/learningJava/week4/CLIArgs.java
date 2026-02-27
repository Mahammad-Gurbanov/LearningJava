package az.edu.ada.learningJava.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class CLIArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User input: ");
        String user_inp = scanner.nextLine();
        System.out.println(user_inp);

        System.out.println("Enter integers: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            numbers.add(num);
        }
        System.out.println(numbers);
    }
}
