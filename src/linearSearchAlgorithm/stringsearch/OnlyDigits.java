public class OnlyDigits {
    public static void main(String[] args) {
        // Example inputs to test
        String s1 = "123456";
        String s2 = "12a34";

        System.out.println("Is '" + s1 + "' only digits? " + isOnlyDigits(s1));
        System.out.println("Is '" + s2 + "' only digits? " + isOnlyDigits(s2));
    }

    public static boolean isOnlyDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
