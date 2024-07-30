
import java.util.Scanner;

public class Matematik {
    
    private double PI = Math.PI;
    
    //Class 1
    public class Factorial {
        public void Hesapla() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            
            int sayi = scanner.nextInt();
            scanner.nextLine();
            int fakt = 1;
            for (int i = 1; i <= sayi; i++) {
                fakt *= i;
            }
            System.out.println("Faktoriyel: " + fakt);
        }
    }
    //Class 2
    public class Asal {
        public boolean Asalmi(int number) {
            if (number < 2) {
                return false;
            }
            int i = 2;
            while(i < number) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    //Class 3
    public class Alan {
        
        public class Daire {
            
            public void daire_alan_hesapla(int yaricap) {
                System.out.println("Dairenin alanı: " + (yaricap * yaricap * PI));
            }
        }
        
    }
            
}
