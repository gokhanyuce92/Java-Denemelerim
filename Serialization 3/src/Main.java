
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci(1, "Gökhan Yüce", "Bilgisayar Mühendisliği");
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.dat"))) {
            
            Ogrenci.setOgrenci_sayisi(1000);
            
            out.writeObject(ogrenci);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı FileNotFound oluştu");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException hatası oluştu");
        }
    }
}
