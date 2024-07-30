
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    
    public static void main(String[] args) {
   
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            
            Ogrenci ogrenci1 = new Ogrenci(1, "Gökhan Yüce", "Bilgisayar Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci(2, "Aleyna Ersoy", "İnsan Kaynakları Uzmanı");
            
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu");
        }
}
}
