public class Algorithms_01_02 {

    public static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println("Is Password Complex: Hell0 "+isPasswordComplex("Hell0"));
        System.out.println("Is Password Complex: Hello "+isPasswordComplex("Hello"));
        System.out.println("Is Password Complex: hellO "+isPasswordComplex("hellO"));
        System.out.println("Is Password Complex: HeLLo "+isPasswordComplex("HeLLo"));
        System.out.println("Is Password Complex: hello "+isPasswordComplex("hello"));
        System.out.println("Is Password Complex: \" \" "+isPasswordComplex(" "));
    }
}