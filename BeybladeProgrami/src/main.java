
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        System.out.println("Çıkış için q tuşuna basınız");
        
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Lütfen beyblade türünü giriniz(Dragon, Draciel): ");
            String secim = scanner.nextLine();
            if (secim.equals("q")) {
                System.out.println("Güle güle :)");
                break;
            }
            else {
                Beyblade beyblade = SetBeyblade(secim);
                if (beyblade == null) {
                    System.out.println("Tür seçimi yanlış. Dogru giriniz!");
                }
                else {
                    beyblade.BilgileriGetir();
                    beyblade.KutsalCanavariOrtayaCikar();
                }
            }
        }
    }
    
    public static Beyblade SetBeyblade(String beybladeTuru) {
        if (beybladeTuru.equals("Dragon")) {
            return new Dragon("Max", 400, 600, "Kaplan Pençesi");
        }
        else if(beybladeTuru.equals("Draciel")) {
            return new Draciel("Kai", 600, 800, "Hayalet Ejderha");
        }
        return null;
    }
}
