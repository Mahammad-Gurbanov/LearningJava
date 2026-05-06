package az.edu.ada.learningJava.week9;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args){
        HashMap<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("M", 4.0);
        studentGrades.put("O", 3.68);
        studentGrades.put("N", 2.89);
        studentGrades.put("E", 1.98);
        studentGrades.put("S", 3.92);

        double highestGpa = 0.0;
        String student = "";

        for (Map.Entry<String, Double> entry : studentGrades.entrySet()){
            if (entry.getValue() > highestGpa){
                highestGpa = entry.getValue();
                student = entry.getKey();
            }
        }

        System.out.println("Student: " + student);
        System.out.println("Gpa: " + highestGpa);

        double avgGpa = 0;
        int counter = 0;
        for (double gpa : studentGrades.values()){
            avgGpa += gpa;
            counter++;
        }

        avgGpa = avgGpa / counter;
        System.out.printf("Avg gpa is: %.2f\n", avgGpa);

        int belowAvgGpaCount = 0;
        for (double gpa: studentGrades.values()){
            if (gpa < avgGpa){
                belowAvgGpaCount++;
            }
        }
        System.out.println("Number of students lower than avg gpa: " + belowAvgGpaCount);
    }

}
