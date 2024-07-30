
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi giriniz: ");
        String cumle = scanner.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < cumle.length() / 2; i++) {
            stack.push(cumle.charAt(i));
        }
        
        if (IsPalindrome(cumle, stack)) {
            System.out.println("Palindromedur");
        }
        else {
            System.out.println("Palindrome degildir");
        }
    }
    
    public static boolean IsPalindrome(String cumle, Stack<Character> stack) {
        boolean ciftmi = cumle.length() % 2==0;
        int n = ciftmi ? 1 : 0;
        
        for (int i = (cumle.length() / 2) + 1 - n; i < cumle.length(); i++) {
            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
