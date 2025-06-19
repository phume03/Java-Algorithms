public class Algorithms_02_01 {
    public static Integer linearSearch(int[] arr, int item) {
        for (int data: arr) if (data == item) return new Integer(data);

        return null;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 8));
    }
}
