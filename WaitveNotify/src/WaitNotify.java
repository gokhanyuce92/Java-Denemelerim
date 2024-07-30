
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitNotify {
    private Object lock = new Object();
    
    public void thread1Fonksiyonu() {
        
        synchronized(lock) {
            System.out.println("Thread 1 Çalışıyor");
            System.out.println("Thread 1 Thread2'nin kendisini uyandırmasını bekliyor");
            
            try {
                lock.wait();//anahtarı teslim etmek istediğimizi söylüyor ve wait ten aşağıdaki kısı mları çalıştırmayacak. Başka bir thread bu thread i uyandırmazsa sonsuza kadar wait durumunda bekler
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Thread 1 Uyandı. Devam ediyor");
        }
        
    }
    
    public void thread2Fonksiyonu() {
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(lock) {
            System.out.println("Thread 2 Çalışıyor");
            System.out.println("Devam etmek için bir tuşa basın...");
            scanner.nextLine();
            
            lock.notify(); //diğer thread e anahtarı tekrar teslim eder. Fakat burada wait ten farklı olarak kendisinden sonraki kod blokları çalışıp öyle thread1 e döner.
            System.out.println("Uyandırdım abi. Ben gidiyorum ama 2 sn bekle");
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
