
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {
    
    public static void main(String[] args) {
        
        FileInputStream fs = null;
        try {
            fs = new FileInputStream("dosya.txt");
            //System.out.println((char)fs.read());
            
            /*fs.skip(5);
            System.out.println((char)fs.read());
            System.out.println((char)fs.read());*/
            
            int deger;
            String s = "";
            
            /*
            while ((deger = fs.read()) != -1) {
                
                s += (char) deger;
            }
            
            System.out.println("Dosya içeriği : " + s);
            */
            
            int say = 0;
            fs.skip(5);
            
            while ((deger = fs.read()) != -1) {                
                s += (char) deger;
                say++;
                
                if (say == 11) {
                    break;
                }
            }
            
            System.out.println("Dosyanın 5. yerinden itibaren 11 karakter : " + s);
            
        } catch (FileNotFoundException ex) {
            System.out.println("File bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata oluştu");
        }
        finally {
            try {
                if (fs != null) {
                    fs.close();
                }
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken hata oluştu");
            }
        }
    }
}
