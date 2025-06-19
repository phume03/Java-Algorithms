import java.util.Arrays;

public class Algorithms_02_05 {
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }

    public static void reverseInPlace(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            // Swap item at index (i) and
            // item at index (arr.length - i - 1)
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }    

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Original: ");
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        
        System.out.print("\nReversed: ");
        Arrays.stream(reverse(arr))
                .forEach(x -> System.out.print(x+" "));
        System.out.println();
        
        reverseInPlace(arr); // changes original, no return
        System.out.print("Reversed in Place: ");
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        System.out.println();
        
        reverseInPlace(arr); // original was changed it can be used again
        System.out.print("Reversed in Place (again): ");
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        System.out.println();
    }
}