
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        //Orta ve kücük txt dosyalarda okuma için FileReader
        //Büyük boyutlu txt dosyalarda okuma için BufferedReader kullanırız
        
        //1- FileReader örneği
       /*
        try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {
            
            while (scanner.hasNextLine()) {
                //System.out.println("Okunan satır : " + scanner.nextLine());
                String ogrenci_bilgisi = scanner.nextLine();
                
                String[] s_array = ogrenci_bilgisi.split(",");
                if (s_array[1].equals("Bilgisayar Mühendisliği")) {
                    System.out.println("Öğrenci Bilgisi: " + ogrenci_bilgisi);
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu");
        }
        */
       
       //2- BufferedReader örneği
       /*
       try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))) {
           
           while (scanner.hasNextLine()) {               
               //System.out.println(scanner.nextLine());
               
               String ogrenci_bilgisi = scanner.nextLine();
               
               String[] s_arr = ogrenci_bilgisi.split(",");
               
               if (s_arr[1].equals("Bilgisayar Mühendisliği")) {
                   System.out.println(ogrenci_bilgisi);
               }
           }
           
       } catch (FileNotFoundException ex) { 
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu");
        }
       */
       
       //3- BufferedWriter örneği
       try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))) {
           
           writer.write("Mehmet Türkan,Astsubay\n");
           
       } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oluştu");
        }
       
    }
    
}
