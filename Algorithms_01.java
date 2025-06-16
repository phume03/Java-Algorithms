public class Algorithms_01 {

    public static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s) {
        // s.chars().noneMatch(Character::isUpperCase);
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {

        System.out.println("Is Uppercase: hello "+isUppercase("hello"));
        System.out.println("Is Uppercase: HELLO "+isUppercase("HELLO"));
        System.out.println("Is Uppercase: Hello "+isUppercase("Hello"));
        System.out.println();
        System.out.println("Is Lowercase: hello "+isLowercase("hello"));
        System.out.println("Is Lowercase: HELLO "+isLowercase("HELLO"));
        System.out.println("Is Lowercase: Hello "+isLowercase("Hello"));
    }
}
