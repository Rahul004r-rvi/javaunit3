public class ThrowDemo {
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
