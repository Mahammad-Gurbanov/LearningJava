package az.edu.ada.learningJava.week10;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Double[] arr2 = {0.1, 0.2, 0.3};
        String[] arr3 = {"str1", "str2", "str3"};

        printArray(arr1, 1, 3);
        printArray(arr2, 0, 2);
        printArray(arr3, 2, 3);
    }

    public static <T> void printArray(T[] arr){
        for (T item: arr){
            System.out.println(item);
        }
    }

    public static <T> void printArray(T[] arr, int lowerIdx, int upperIdx){
        if (lowerIdx < 0 || upperIdx <= lowerIdx || upperIdx > arr.length){
            throw new IndexOutOfBoundsException();
        }
        for (int i = lowerIdx; i < upperIdx; i++){
            System.out.println(arr[i]);
        }
    }
}
