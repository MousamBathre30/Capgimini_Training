// Division.java
public class Division {
    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }
}
