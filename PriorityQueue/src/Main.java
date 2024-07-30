
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        Queue Interface ve PriorityQueue Sınıfı
        PriorityQueue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralamalarına göre yüksek öncelik kazanıp
        (
        Integerlarda en yüksek öncelik en küçük sayıda, en düşük öncelik en büyük sayıdadır.
        Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte, en düşük öncelik alfabetik olarak
        sözlükte en son gelen stringtedir.
        )
        kuyrukta önlere geçer.( Tıpkı hastanedeki acil servisler gibi)
        
        add veya offer() metotları  ---> Kuyruğa eleman ekler. (Önceden gördüğümüz özellikleri taşırlar)
        clear()  ---> Kuyruğu temizler.
        contains(Object o)  ---> o objesi kuyruğun içindeyse true, değilse false döner.
        peek() --->  Kuyruğun başındaki elemanı döner. Kuyruk boşsa null referans döner.
        pool()  ---> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Kuyruk boşsa null referans döner.
        size()  ---> Kuyruğun içindeki eleman sayısını döner.
        */
        
        Queue<Integer> queue = new PriorityQueue<Integer>();
        
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);
     
        System.out.println(queue.peek());
        
        while (!queue.isEmpty()) {            
            System.out.println("Eleman çıkartılıyor..." + queue.poll());
        }
    }
}
