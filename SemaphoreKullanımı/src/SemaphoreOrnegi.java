
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SemaphoreOrnegi {
    private Semaphore sem = new Semaphore(3);
    
    public void threadFonksiyonu(int id) { 
        try {
            sem.acquire(); //şuanki değerimiz 3 thread girebilir şeklinde. acquire() 3 döner ve her thread girdikten sonra 1 azalır ta ki 0 olunca burada kod locklanır
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Thread başlıyor. ID : " + id);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread çıkıyor. ID : " + id);
        
        sem.release(); //semaphore değerini 1 arttır. 0 dı 1 oldu. lock ı kaldırır
    }
}
