
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    private static String harfnotuHesapla(String isim, int vize1, int vize2, int finalnotu) {
        
        String cikti = "";
        double harfNotu = (vize1 * 3 /10.0) + (vize2 * 3 /10.0) + (finalnotu * 6 / 10.0);
        
        if (harfNotu >= 95) {
            cikti = isim + " isimli öğrencinin aldığı not : AA";
        }
        else if(harfNotu >= 90) {
            cikti = isim + " isimli öğrencinin aldığı not : BA";
        }
        else if(harfNotu >= 85) {
            cikti = isim + " isimli öğrencinin aldığı not : BB";
        }
        else if(harfNotu >= 80) {
            cikti = isim + " isimli öğrencinin aldığı not : CB";
        }
        else if(harfNotu >= 75) {
            cikti = isim + " isimli öğrencinin aldığı not : CC";
        }
        else if(harfNotu >= 70) {
            cikti = isim + " isimli öğrencinin aldığı not : DC";
        }
        else if(harfNotu >= 65) {
            cikti = isim + " isimli öğrencinin aldığı not : DD";
        }
        else if(harfNotu >= 60) {
            cikti = isim + " isimli öğrencinin aldığı not : FD";
        }
        else {
            cikti = isim + " isimli öğrencinin aldığı not : FF";
        }
        
        return cikti;
    }
    
    public static void main(String[] args) {
   
        try(Scanner scanner = new Scanner(new FileReader("dosya.txt"));
                FileWriter writer = new FileWriter("harfnotları.txt")
                ) {
            
            while (scanner.hasNextLine()) {                
                String ogrenciBilgileri = scanner.nextLine();
                
                String[] ogrenciArray = ogrenciBilgileri.split(",");
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalnot= Integer.valueOf(ogrenciArray[3]);
                
                String cikti = harfnotuHesapla(ogrenciArray[0], vize1, vize2, finalnot);
                
                writer.write(cikti + "\n");
            }
            
        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu");
        }
        
}
}
