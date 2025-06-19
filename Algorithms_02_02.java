import java.util.Arrays;
import java.util.OptionalInt;

public class Algorithms_02_02 {
    public static Integer linearSearch(int[] arr, int item) {
        for (int current : arr) if (current == item) return item;

        return null;
    }

    public static OptionalInt linearSearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }  

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Array: {1, 2, 3, 4, 5, 6}"); // inefficient print, duplication of array code, if array changes, this will also have to change and can be missed
        System.out.println("Find 1 in array: "+linearSearch(arr, 1));
        System.out.println("Find 8 in array: "+linearSearch(arr, 8));
        System.out.println();
        linearSearch2(arr, 1).ifPresent(x -> System.out.println("Find 1 in array: "+x));
        linearSearch2(arr, 8).ifPresent(x -> System.out.println("Find 8 in array: "+x));      
        
    }
}