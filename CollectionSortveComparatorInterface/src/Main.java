
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  
    public static void main(String[] args) {
        List<Player> listPlayer = new ArrayList<Player>();
        
        listPlayer.add(new Player(1, "Gökhan"));
        listPlayer.add(new Player(3, "Gökçe"));
        listPlayer.add(new Player(2, "Kıymet"));
        listPlayer.add(new Player(4, "Emin"));
        
        //Collections.sort(listPlayer);
        Collections.sort(listPlayer, new BuyuktenKucugeComparator());
        
        /*for (Player p : listPlayer) {
            System.out.println(p);
        }*/
        
        //Collections.sort(listPlayer, new KucuktenBuyugeComparator()); //veya aşagıdaki gibi kullanabiliriz de
        Collections.sort(listPlayer, new Comparator<Player>() { 
            @Override
            public int compare(Player o1, Player o2) {
                //return o1.getIsim().compareTo(o2.getIsim()); //kucukten buyuge siralar
                return -o1.getIsim().compareTo(o2.getIsim()); //buyukten kucuge siralar
            }
        });
        
        for (Player p : listPlayer) {
            System.out.println(p);
        }
}
}
class KucuktenBuyugeComparator implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.compareTo(o2);
    }
    
}

class BuyuktenKucugeComparator implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        //return -o1.compareTo(o2);
        return -o1.getIsim().compareTo(o2.getIsim());
    }
    
}

class Player implements  Comparable<Player>{
        private int id;
        private String isim;

        public Player(int id, String isim) {
            this.id = id;
            this.isim = isim;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        @Override
        public String toString() {
            return "||| " + getId() + " - " + getIsim() + " |||";
        }

    @Override
    public int compareTo(Player o) {
        if (this.id < o.id) {
            return -1;
        }
        else if (this.id > o.id) {
            return 1;
        }
        return 0;
    }
        
        
    }