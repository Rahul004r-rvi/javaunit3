public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }

        try {
            int x = Integer.parseInt("abc");
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }

        try {
            Object obj = "Java";
            Integer i = (Integer) obj;
        }
        catch (ClassCastException e) {
            System.out.println("Class Cast Exception");
        }
    }
}
