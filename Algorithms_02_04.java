import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Algorithms_02_04 {
    public static int[] findEvenNums(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }

        for (int num : arr2) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findEvenNum2(int[] arr1, int[] arr2) {
        IntPredicate isEvenPred = num -> num % 2 == 0;
        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .filter(isEvenPred)
                .toArray();
    }    


    public static void main(String[] args) {
        int[] arr1 = { -9, 3, 2, -8, 12, -16 };
        int[] arr2 = { 0, -3, -8, -35, 40, 20, 7 };

        Arrays.stream(findEvenNums(arr1, arr2))
                .forEach(System.out::println);

        System.out.println();

        Arrays.stream(findEvenNum2(arr1, arr2))
                .forEach(System.out::println);                
    }
}