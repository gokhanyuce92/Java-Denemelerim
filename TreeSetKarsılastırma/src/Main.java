
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player>{
    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "||| " + getId() + " - " + getName() + " |||";
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;
        }
        else if (this.id > player.id) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Set<Player> treeSet = new TreeSet<Player>();
        
        treeSet.add(new Player(1, "Gökhan"));
        treeSet.add(new Player(2, "Ahmet"));
        treeSet.add(new Player(3, "Mehmet"));
        treeSet.add(new Player(4, "Esma"));
        
        for (Player p : treeSet) {
            System.out.println(p);
        }
}

    
}
