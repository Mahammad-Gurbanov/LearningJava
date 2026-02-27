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

        int[] numbsIntArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++){
            numbsIntArray[i] = numbers.get(i);
        }
        System.out.println(calcSum(numbsIntArray));
        System.out.println("Min number: " + findMin(numbsIntArray));
        System.out.println("Max number: " + findMax(numbsIntArray));
    }

    public static int calcSum(int... nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum;
    }

    public static int findMin(int... nums){
        int min = nums[0];
        for (int num : nums){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int... nums){
        int max = nums[0];
        for (int num : nums){
            if (num > max) max = num;
        }
        return max;
    }
}
