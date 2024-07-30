
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        Queue<Player> queue = new PriorityQueue<Player>();
        
        queue.offer(new Player("Gökhan", 1));
        queue.offer(new Player("Recep", 2));
        queue.offer(new Player("İlker", 8));
        queue.offer(new Player("Özgür", 6));
        
        while (!queue.isEmpty()) {            
            System.out.println("Eleman kuyruktan çıkarılıyor... " + queue.poll());
        }
}
}

class Player implements  Comparable<Player>{
        private String isim;
        private int id;

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }

        @Override
        public int compareTo(Player player) {
            if (this.id < player.id) {
                return 1;
            }
            else if (this.id > player.id) {
                return -1;
            }
            return 0;
        }

    @Override
    public String toString() {
        return "||| id : " + id + " isim : " + isim + " |||";
    }
        
    }
