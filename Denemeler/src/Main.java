
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
    
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                rasgeleSayiTopla();
            }
        };
        
        timer.scheduleAtFixedRate(task, 0, 500);
    }
    
    public static void rasgeleSayiTopla() {
        Random random = new Random();
        int sayi1 = random.nextInt(101);
        int sayi2 = random.nextInt(101);
        
        System.out.println(String.valueOf(sayi1) + " + " + String.valueOf(sayi2) + " = " + String.valueOf(sayi1 + sayi2));
    }
}
