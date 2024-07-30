
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    
    private static void dosyaOku() throws FileNotFoundException, IOException {
        
        try {
            FileInputStream in = new FileInputStream("marş.mp3");
            
            int oku;
            while ((oku = in.read()) != -1) {
                icerik.add(oku);
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
        
    }
    
    private static void kopyala(String dosyaAdı) throws FileNotFoundException, IOException {
        
        try {
            FileOutputStream out = new FileOutputStream(dosyaAdı);
            
            for (Integer deger : icerik) {
                out.write(deger);
            }
            
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
    }
    
    public static void main(String[] args) 
    {
        try {
            dosyaOku();
            
            long baslangic = System.currentTimeMillis();

            kopyala("mars2.mp3");
            kopyala("mars3.mp3");
            kopyala("mars4.mp3");

            long bitis = System.currentTimeMillis();

            System.out.println("3 dosya kopyalanması şu kadar sürdü : " + (bitis- baslangic) / 1000 + " sn.");
        } 
        catch(FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
