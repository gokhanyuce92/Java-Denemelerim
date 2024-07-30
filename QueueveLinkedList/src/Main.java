
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
        Queue(Kuyruk) Interface ini implemente eden LinkedList Class ı FIFO(First In First Out) mantığıyla çalışır.
        add(Eleman)  ---> Elemanı kuyruğa ekler. Ekleyemezse hata fırlatır.
        offer(Eleman)  ---> Elemanı kuyruğa ekler. Eklerse true döner, ekleyemezse false döner.
        remove()  ---> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata fırlatır.
        poll ---> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null referans döner.
        element() ---> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa hata fırlatır.
        peek() ---> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa null referans döner.
        */
        
        Queue<String> queue = new LinkedList<String>();
        
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
        
    }
}
