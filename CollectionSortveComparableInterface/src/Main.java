
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements  Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "| | | ID : " + id + " İsim : " + isim + " | | |";
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) { //şuan kücükten -> büyüğe sıralıyor. işaretleri ters cevirirsek büyükyten -> kücüge sıralar
            return -1;
        }
        else if(this.id > player.id) {
            return 1;
        }
        return 0;
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        
        /*List<String> list_string = new ArrayList<String>();
        
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string);
        
        for (String s : list_string) {
            System.out.println(s);
        }*/
        
        List<Player> list_players = new ArrayList<Player>();
        list_players.add(new Player("Gökhan", 1));
        list_players.add(new Player("Mehmet", 14));
        list_players.add(new Player("Onur", 22));
        list_players.add(new Player("Caner", 5));
        
        /*Player p1 = new Player("A1", 1);
        Player p2 = new Player("A2", 2);
        
        System.out.println(p1.compareTo(p2)); //-1
        System.out.println(p2.compareTo(p1)); //1
        */
        
        Collections.sort(list_players);
        
        for (Player player : list_players) {
            System.out.println(player);
        }
        
        System.out.println("=============");
        Set<Player> treeset = new TreeSet<Player>();
        
        treeset.add(new Player("Murat", 5));
        treeset.add(new Player("Emre", 1));
        treeset.add(new Player("Oğuz", 10));
        treeset.add(new Player("Yusuf", 4));
        
        for (Player player : treeset) {
            System.out.println(player);
        }
    }
}
