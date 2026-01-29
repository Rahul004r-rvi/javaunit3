import java.util.Scanner;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30};

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int result = 100 / num;

            System.out.print("Enter array index: ");
            int index = sc.nextInt();
            System.out.println("Array value: " + arr[index]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (Exception e) {
            System.out.println("General exception occurred");
        }
    }
}
