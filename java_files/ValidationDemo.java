class InvalidNameException extends Exception {
    InvalidNameException(String msg) { super(msg); }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

public class ValidationDemo {
    public static void main(String[] args) {
        try {
            String name = "";
            int age = 17;
            int salary = -5000;

            if (name.isEmpty())
                throw new InvalidNameException("Name cannot be empty");

            if (age < 18 || age > 60)
                throw new InvalidAgeException("Invalid age");

            if (salary <= 0)
                throw new ArithmeticException("Invalid salary");

            System.out.println("All validations passed");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
