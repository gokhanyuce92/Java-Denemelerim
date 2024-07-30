import com.gokhanyuce.matematik.*;

public class Main1 {
    public static void main(String[] args) {
        
        Matematik matematik = new Matematik();
        
        int number1 = 5;
        int number2 = 2;
        
        System.out.println("sayi1 = " + number1 + " sayi2 = " + number2);
        
        matematik.topla(number1, number2);
        matematik.cikar(number1, number2);
        matematik.carp(number1, number2);
        matematik.bolme(number1, number2);
    }
}
