package az.edu.ada.learningJava.week10;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] arr1 = {10, 2, 3, 9, 3, 5, 0, -3};
        Double[] arr2 = {0.1, 0.2, 0.3 , 1.2, -1.2, 0.0, -1.0};
        String[] arr3 = {"str1", "str2", "str3", "str4", "abc", "love"};

        System.out.println("Sort arr of integers");
        bubbleSort(arr1);
        printArray(arr1);

        System.out.println("Sort arr of doubles");
        bubbleSort(arr2);
        printArray(arr2);

        System.out.println("Sort arr of strings");
        bubbleSort(arr3);
        printArray(arr3);


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

    public static <T> T getMiddleItem(T[] arr){
        if (arr.length == 0) throw new IllegalArgumentException("Array can't be empty");
        if (arr.length % 2 == 0){
            return arr[arr.length / 2 - 1];
        } else {
            return arr[arr.length / 2];
        }
    }

    public static <T extends Comparable<T>> T getMaximumItem(T[] arr){
        T maximumItem = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maximumItem.compareTo(arr[i]) < 0){
                maximumItem = arr[i];
            }
        }
        return maximumItem;
    }

    public static <T> void swapItems(T[] arr, int idx1, int idx2){
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i].compareTo(arr[j]) > 0){
                    swapItems(arr, i, j);
                }
            }
        }
    }

}
