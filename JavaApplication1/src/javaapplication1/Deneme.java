package javaapplication1;

public class Deneme {
    public static int factorial_Recursion (int number) {
        if (number == 1) {
            return 1;
        }
        else {
            return number * factorial_Recursion(number - 1);
        }
    }
}
