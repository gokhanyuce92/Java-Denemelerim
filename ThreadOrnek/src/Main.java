
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new Personel("Gökhan", 1));
        Thread thread2 = new Thread(new Personel("Gökçe", 180));
        
        thread1.start();
        thread2.start();
        
    }
}
