package oyun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    private static Kart[][] kart = new Kart[4][4];
    private static int boyut = (kart.length * kart[0].length) / 2;
            
    public static void main(String[] args) {
        try {
            kart = kart_doldur();
            kart_goster(kart);

            Scanner scanner = new Scanner(System.in);

            while (oyunBittimi() == false) {  
                System.out.print("Birinci tahmin için x, y değerlerini boşluklu giriniz(örnek: 0 0): ");
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();

                kart[x1][y1].setTahmin(true);
                kart_goster(kart);
                System.out.print("İkinci tahmin için x, y değerlerini boşluklu giriniz(örnek: 0 0): ");
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();

                if (x1 == x2 && y1 == y2) {
                    kart[x1][y1].setTahmin(false);
                }
                else {
                    if (kart[x1][y1].getDeger() == kart[x2][y2].getDeger()) {
                        kart[x2][y2].setTahmin(true);
                    }
                    else {
                        try {
                            kart[x2][y2].setTahmin(true);
                            kart_goster(kart);
                            System.out.println("1 sn.bekletiliyor sonra kart kapatılacak");
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        kart[x1][y1].setTahmin(false);
                        kart[x2][y2].setTahmin(false);
                    }
                }

                kart_goster(kart);
            }
            if (oyunBittimi()) {
                System.out.println("Tebrikler oyunu bitirdiniz!");
            }
        } catch (Exception e) {
            System.out.println("Hata program sonlandırılıyor!");
        }
       
    }
    
    public static char[] ShuffleCharArray(char[] array) {
        //Diziyi listeye dönüştür
        List<Character> list = new ArrayList<>();
        for (char c : array) {
            list.add(c);
        }
        //Listenin elemanlarını karıştır
        Collections.shuffle(list);
        //Karıştırılmış listeyi tekrar diziyi dönüştür
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
    
    public static Kart[][] kart_doldur() {
        char[] yeniDizi = new char[boyut];
        char yeni1;
        boolean found;
        for (int i = 0; i < boyut; i++) {
            do {
                found = false;
                yeni1 = uret();
                for (int j = i - 1; j >= 0; j--) {
                    if (yeniDizi[j] == yeni1) {
                        found = true;
                    }
                }
                if (found == false) {
                    yeniDizi[i] = yeni1;
                }
            } while (found);
        }
        
        //yeniDiziyi aynı elemanlarla 2 katı çoğaltıp başka diziye kopyalamak
        char[] yeniDizi2 = yeniDizi;
        char[] mergedArray = new char[yeniDizi.length + yeniDizi2.length];
        //İlk diziyi yeni diziye kopyala
        System.arraycopy(yeniDizi, 0, mergedArray, 0, yeniDizi.length);
        //İkinci diziyi yeni diziye kopyala
        System.arraycopy(yeniDizi2, 0, mergedArray, yeniDizi.length, yeniDizi2.length);
        //Diziyi karıştır
        ShuffleCharArray(mergedArray);
        
        int count = 0;
        for (int i = 0; i < kart.length; i++) {
            for (int j = 0; j < kart[i].length; j++) {              
                kart[i][j] = new Kart(mergedArray[count]);
                count++;
            }
        }
        
        return kart;
    }
    
    public static void kart_goster(Kart[][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                if (p[i][j].isTahmin()) {
                    System.out.print("|" + p[i][j].getDeger() + "|");
                }
                else {
                    System.out.print("|" + " " + "|");
                }
            }
            System.out.println("");
        }
    }
    
    public static boolean oyunBittimi() {
        for (int i = 0; i < kart.length; i++) {
            for (int j = 0; j < kart[i].length; j++) {
                if (kart[i][j].isTahmin()== false) {
                    return false;
                }
            }            
        }
        return true;
    }
    
    public static char uret() {
        Random random = new Random();
        // Generate a random integer between 65 ('A') and 90 ('Z') inclusive
        int randomNumber = random.nextInt(boyut) + 65;
        char randomChar = (char) randomNumber;
        
        return randomChar;
    }
}
