package az.edu.ada.learningJava.week8;

public class TestSolutions {
    public static void main(String[] args) {
        String[] exampleNames = {"John", "Fred", "Bruce", "Fred", "Robert"};
        DistinctWords words = new DistinctWords(exampleNames);
        words.removeDuplicates();
        words.sortAlphabetically();
        for (String name : words.getNames()){
            System.out.println(name);
        }

        Store myStore = new Store(20);
        int[] breadNeeded = {2, 4, 6, 3, 8};
        int totalCount = myStore.countPeopleBuyingBread(breadNeeded);
        System.out.println(totalCount);
        System.out.println(myStore.getTotalBread());

    }

}
