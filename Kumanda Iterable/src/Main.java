
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Kumanda kumanda = new Kumanda();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kumanda Programına Hoşgeldiniz...");
        while (true) {            
            System.out.println("-------------------------------------------");
            System.out.println("1. Kanalları Göster"
                + "\n2. Kanal Ekle"
                + "\n3. Kanal Sil"
                + "\nÇıkmak için q'ya basınız");
            System.out.println("-------------------------------------------");
            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                break;
            }
            else if(islem.equals("1")) {
                kanallariGoster(kumanda);
            }
            else if(islem.equals("2")) {
                System.out.print("Eklenecek kanal adını giriniz: ");
                String eklenecek = scanner.nextLine();
                kumanda.kanalEkle(eklenecek);
                System.out.println("-------------KANAL EKLENDİ : " + eklenecek + " ---------------");
            }
            else if(islem.equals("3")) {
                System.out.print("Silinecek kanal adını giriniz: ");
                String silinecek = scanner.nextLine();
                kumanda.kanalSil(silinecek);
                System.out.println("-------------KANAL SİLİNDİ : " + silinecek + " ---------------");
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
        
    }
    
    public  static void kanallariGoster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Şu andan hiçbir kanal bulunmuyor...");
        }
        else {
            for (String kanal : kumanda) {
                System.out.println("Kanal : " + kanal);
            }
        }
    }
}
