
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        
        int age = scanner.nextInt();
        
        //mekanGirisKontrol(age);
        
        try {
            mekanGirisKontrol(age);
        } 
        catch (ArithmeticException e) {
            System.out.println("18 yaşından küçükler mekana giremez...");
        }
    }
    
    public static void mekanGirisKontrol(int age) {
        
        if (age < 18) {
            throw new ArithmeticException();
        }
        else {
            System.out.println("Mekana hoşgeldiniz");
        }
    }
}
