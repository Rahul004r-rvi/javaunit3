public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;

            try {
                int[] arr = new int[3];
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index error");
            }

            int x = Integer.parseInt("abc");
        }
        catch (NumberFormatException e) {
            System.out.println("Outer catch: Number format error");
        }
    }
}
