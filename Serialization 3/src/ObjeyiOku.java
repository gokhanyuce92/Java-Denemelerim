
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjeyiOku {
    
    public static void main(String[] args) {
   
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.dat"))) {
            
            Ogrenci ogrenci1 = (Ogrenci) in.readObject();
            System.out.println("Öğrenci sayısı : " + Ogrenci.getOgrenci_sayisi());
            System.out.println(ogrenci1);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı FileNotFound oluştu");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException hatası oluştu");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
