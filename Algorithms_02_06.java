import java.util.Arrays;

public class Algorithms_02_06 {
    public static void rotateArrayLeft(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int temp = arr[0];
        for (int i=0; i<arr.length -1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return;

    }

    public static void rotateArrayRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            // [ 1, 1, 2, 3, 4, 5]
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }    

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Original: ");
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        
        System.out.print("\nRotated Left: ");
        rotateArrayLeft(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        System.out.println();

        System.out.print("\nRotated Right: ");
        rotateArrayRight(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        System.out.println();
    }
}
