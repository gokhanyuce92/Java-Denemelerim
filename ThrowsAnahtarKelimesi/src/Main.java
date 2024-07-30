
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    /*
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int age = scanner.nextInt();
        
        try {        
            mekanGirisKontrol(age);
        } catch (IOException ex) {
            System.out.println("IOException oluştu");
        }
    }
    */
    
     public static void main(String[] args) throws IOException {
         
         //throws IOException kullanmamızın sebebi biz buprojeyi yarın birgün jar dosyası veya api haline getirdiğimizde
         //client burada hatayı handle edip kendine göre customize edebilsin diyedir...
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int age = scanner.nextInt();
        
        mekanGirisKontrol(age);
        
         System.out.println("burası çalıştı");
    }
    
    public  static void mekanGirisKontrol(int age) throws IOException {
        
        if (age < 18) {
            throw new IOException();
        }
        else {
            System.out.println("Mekana hoşgeldiniz");
        }
    }
}
