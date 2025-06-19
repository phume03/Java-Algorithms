import java.util.Arrays;

public class Algorithms_02_03 {
    public static boolean binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (item == arr[mid]) {
                return true;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("3 is in the array: "+binarySearch(arr, 3));
        System.out.println("1 is in the array: "+binarySearch(arr, 1));
        System.out.println("8 is in the array: "+binarySearch(arr, 8));

        int index = Arrays.binarySearch(arr, 3);
        System.out.println("3 index in the array is: "+index);        
    }
}