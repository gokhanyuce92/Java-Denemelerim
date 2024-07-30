
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListWorker {
    
    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    
    public void list1DegerEkle() {
        
        for (int i = 0; i < 2000; i++) {
            
            try {
                list1.add(i);
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void list2DegerEkle() {
        
        for (int i = 0; i < 2000; i++) {
            
            try {
                list2.add(i);
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void degerAta() {
        long baslangic = System.currentTimeMillis();
        list1DegerEkle();
        list2DegerEkle();
        
        long bitis = System.currentTimeMillis();
        
        System.out.println("List1 : " + list1.size() + " List2 : " + list2.size() + "   Geçen Süre : " + (bitis - baslangic));
    }
    
}
