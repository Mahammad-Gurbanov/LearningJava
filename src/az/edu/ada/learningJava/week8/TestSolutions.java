package az.edu.ada.learningJava.week8;

public class TestSolutions {
    public static void main(String[] args) {
        String[] exampleNames = {"John", "Fred", "Bruce", "Fred", "Robert"};
        DistinctWords words = new DistinctWords(exampleNames);
        words.removeDuplicates();
        for (String name : words.getNames()){
            System.out.println(name);
        }
    }

}
