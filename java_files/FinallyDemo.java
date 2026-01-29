public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Cleanup completed");
        }
    }
}
