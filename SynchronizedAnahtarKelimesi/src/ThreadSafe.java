
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadSafe {
    private int count = 0;
    
    public synchronized  void arttir() { //synchronized anahtar kelimesi ile bir thread buraya girdiginde isini bitirmeden baska thread i buraya sokmaz. anahtar diger adıya lock diye gecer
        count++;
    }
    /*
    public void arttir() { //yukarıdaki metodun diger bir kullanımı
        synchronized(ThreadSafe.class) {
            count++;    
        }
    }
*/
    
    public void threadleriCalistir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    arttir();
                }
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    arttir();
                }
            }
        });
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException hatası oluştu");
        }
        
        System.out.println("Count değişkeninin değeri : " + count);
    }
    
    public static void main(String[] args) {
        ThreadSafe threadsafe = new ThreadSafe();
        
        threadsafe.threadleriCalistir();
    }
}
