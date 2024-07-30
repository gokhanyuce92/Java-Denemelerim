package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
       Account account = new Account(0, "", "gokhan", "1234");
    }
    
    public static int FactorialRecursion (int number) {
        if (number == 1) {
            return 1;
        }
        else {
            return number * FactorialRecursion(number - 1);
        }
    }
    
    public static int SumNumberItems(int number) {
        //1234
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    
    public static boolean IsAmstrong(int number) {
        //371  3^3 + 7^3 + 1^3 = 371
        int length = String.valueOf(number).length();
        int sum_of_digit = 0;
        int temp = number;
        while(number > 0) {
            sum_of_digit += Math.pow(number % 10, length);
            number /= 10;
        }
        return temp == sum_of_digit;
    }
    
    public static boolean IsAsal(int number) {
        if(number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
