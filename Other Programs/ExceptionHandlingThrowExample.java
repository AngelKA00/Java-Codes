public class ExceptionHandlingThrowExample {
    static void Age(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied: Must be at least 18 years old to watch the movie");
        } else {
            System.out.println("Access granted to watch the movie");
        }
    }

    public static void main(String[] args) {
        try {
            Age(14);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
