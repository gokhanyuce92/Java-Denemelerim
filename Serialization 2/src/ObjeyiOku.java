
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjeyiOku {
    
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {
            Ogrenci[] ogrenci_array = (Ogrenci[])in.readObject();
            ArrayList<Ogrenci> ogrenci_list = (ArrayList<Ogrenci>) in.readObject();
            
            System.out.println("Ogrenci array i okumaya başlıyor");
            for (Ogrenci ogrenci : ogrenci_array) {
                System.out.println(ogrenci);
            }
            System.out.println("");
            System.out.println("Ogrenci list i okumaya başlıyor");
            for (Ogrenci ogrenci : ogrenci_list) {
                System.out.println(ogrenci);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException hatası oluştu");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ObjeyiOku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
