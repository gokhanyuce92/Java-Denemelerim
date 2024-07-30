
import java.util.logging.Level;
import java.util.logging.Logger;

public class Personel implements Runnable {
    private String isim;
    private int id;

    public Personel(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }
    
    @Override
    public void run() {
        yazdir();
    }
    
    private void yazdir() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(this.isim + " yazmaya başladı " + i);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Personel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
