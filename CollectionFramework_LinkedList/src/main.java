
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        zamanHesapla("LinkedList", linkedList);
        zamanHesapla("ArrayList", arrayList);
    }
    
    public static void zamanHesapla(String veriTipi, List<Integer> list) {
        
        long start;
        long stop;
        start = System.currentTimeMillis();
        
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
            //list.add(0, i);
        }
        stop = System.currentTimeMillis();
        
        System.out.println(veriTipi + " ekleme süresi " + (stop - start) + " ms");
    }
}
