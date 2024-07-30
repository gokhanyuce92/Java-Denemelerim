package ınheritance;

import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Yonetici yonetici = new Yonetici("Gökhan Yüce", "İstanbul", 6000);
        
        String islemSec = "1. Yönetici işlemleri\n"
                + "2. Çalışan işlemleri\n"
                + "3. Çıkış (q)";
        System.out.println(islemSec);
        System.out.println("************************* ");
        String islem;
        
        while(true) {
            System.out.print("İşlem Seçiniz: ");
            islem = scanner.nextLine();
            if (islem.equals("q")) {
                break;
            }
            else if(islem.equals("1")) {
                String yoneticiIslemleri = "1. Zam yap\n"
                        + "2. Bilgileri getir\n"
                        + "3. Üst menüye dön";
                System.out.println(yoneticiIslemleri);
                String islem_yonetici;
                
                while (true) {
                    islem_yonetici = scanner.nextLine();
                    if (islem_yonetici.equals("3")) {
                        break;
                    }
                    else if (islem_yonetici.equals("1")) {
                        yonetici.ZamYap(300);
                    }
                    else if(islem_yonetici.equals("2")) {
                        yonetici.BilgileriGetir();
                    }
                }
            }
            else if(islem.equals("2")) {
                
            }
            else {
                System.out.println("Geçersiz işlem. programdan çıkılıyor...");
                break;
            }
        }
    }
    
}
