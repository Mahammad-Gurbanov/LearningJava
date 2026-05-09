package az.edu.ada.learningJava.week10;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Double[] arr2 = {0.1, 0.2, 0.3};
        String[] arr3 = {"str1", "str2", "str3", "str4"};
        Character[] arr4 = new Character[4];

        System.out.println(getMiddleItem(arr1));
        System.out.println(getMiddleItem(arr2));
        System.out.println(getMiddleItem(arr3));
        System.out.println(getMiddleItem(arr4));
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
}
