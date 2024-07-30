
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReentrantLockOrnegi {
    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    
    public void arttir() {
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }
    
    public  void thread1Fonksiyonu() {
        lock.lock();//o anahtarı kitlemiş oluyoruz baska thread giremez
        System.out.println("Thread 1 Çalışıyor");
        System.out.println("Thread 1 Uyandırılmayı bekliyor");
        try {
            condition.await();
            System.out.println("Thread 1 Uyandırıldı ve İşlemine devam ediyor");
            arttir();
        } catch (Exception e) {
        }
        finally {
            lock.unlock();//anahtarı teslim eder, baska thread lerin girmesine izin vermis oluyoruz
        }
    }
    
    public void thread2Fonksiyonu() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner = new Scanner(System.in);
        
        lock.lock();
        System.out.println("Thread 2 çalışıyor");
        try {
            arttir();
            System.out.println("Devam etmek için bir tuşa basınız");
            scanner.nextLine();
            condition.signal();
            System.out.println("Thread 1 i uyandırdım. Ben gidiyorum");
            
        } catch (Exception e) {
        }
        finally {
            lock.unlock();
        }
    }
    
    public void threadOver() {
        System.out.println("Say değişkeninin değeri : " + say);
    } 
}
