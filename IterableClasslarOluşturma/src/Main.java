
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        
        String[] kanallar = {"Radyo Viva", "Radyo Fenomen", "Kral Pop", "Pal Station", "Number One"};
        
        Radyo radyo = new Radyo(kanallar);
        
        /*
        for (String s : radyo) {
            System.out.println(s);
        }
        */
        Iterator<String> iterator = radyo.iterator();
        while (iterator.hasNext()) {            
            System.out.println(iterator.next());
        }
    }
}
