
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
   
        /*
        try(FileWriter writer1 = new FileWriter("dosya.txt");
                FileWriter writer2 = new FileWriter("dosya2.txt")
                ) {
            writer1.write("Deneme1\n");
            writer2.write("Deneme2\n");
            
        } catch (IOException ex) {
            System.out.println("IOException handle");
        }
        */
        
        try(FileWriter writer1 = new FileWriter("diller.txt")) {
            Scanner scanner = new Scanner(System.in);
            String s;
            
            while (true) {                
                System.out.print("Bir dil giriniz : ");
                s = scanner.nextLine();
                
                if (s.equals("-1")) {
                    System.out.println("Programdan çıkılıyor. Dosyayı kontrol ediniz");
                    break;
                }
                writer1.write(s + "\n");
            }
            
        } catch (IOException ex) {
            System.out.println("IOException handle");
        }
    }
}
