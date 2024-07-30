
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> list = new LinkedList<Integer>();
        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
                
                /*
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Thread yazıyor : " + i);
                    
                    try {
                        Thread.sleep(1000);
                        System.out.println("Uykumun " + i + ". saniyesindeyim");
                    } catch (InterruptedException ex) {
                        System.out.println("Uykum bölündü...");
                    }
                } 
                */
                
                for (int i = 0; i < 10000000; i++) {
                  
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Kesintiye uğradı...");
                        return;
                    }
                    
                    list.add(i);
                }
                
                System.out.println("Thread kesintiye uğramadan işini bitirdi");
                
            }
        });
        
        t.start();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t.interrupt();
    }
}
