
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
   
            Queue<Hasta> queue = new PriorityQueue<Hasta>();
            
            queue.offer(new Hasta("Özgür", "Yanık"));
            queue.offer(new Hasta("Recep", "Apandisit"));
            queue.offer(new Hasta("İlker", "Baş Ağrısı"));
            queue.offer(new Hasta("Baki", "Apandisit"));
            
            int i = 1;
            while (!queue.isEmpty()) {
                System.out.println("*****************************");
                System.out.println(i + ".sırada");
                System.out.println(queue.poll());
                System.out.println("*****************************");
                i++;
             }
            
}
}
