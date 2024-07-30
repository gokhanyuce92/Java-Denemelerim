
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
        //File file = new File("dosya.txt");
        //fos = new FileOutputStream(file);
        
        try {
            fos = new FileOutputStream("dosya.txt"); //append true denirse her yazdıgımız dosya sonuna eklenir, default false durumda dosya icerigi her seferde bastan olusturulur
            
            //fos.write(65); //ASCII karsılıgı A
            //byte[] array = { 101, 75, 66, 68 };
            //fos.write(array);
            
            String s = "Gökhan Yüce";
            byte[] s_array = s.getBytes();
            fos.write(s_array);
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception olustu");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken hata oluştu");
        }
        finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu");
            }
        }
        
    }
}
