package localhost.thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Printer extends Thread {
    
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " çalışıyor");
        
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(isim + " yazıyor : " + (i + 1));
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye uğradı");
            }
        }
        System.out.println(isim + " çalışmasını bitirdi");
    }
    
}
