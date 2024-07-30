
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    
    public static void main(String[] args) {
        
        Map<Integer, String> hashMap = new HashMap<Integer, String>(); //map lerin sıralaması düzensiz olarak ekler
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(); //map leri nasıl tanımladıysak o şekilde belleğe işler
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(); //key lere göre sıralar
        
        System.out.println("1. Hash Map");
        mapAdd(hashMap);
        System.out.println("");
        System.out.println("2. Linked Hash Map");
        mapAdd(linkedHashMap);
        System.out.println("");
        System.out.println("3. Tree Map");
        mapAdd(treeMap);
    }
    
    public static void mapAdd(Map<Integer, String> map) {
        map.put(10, "C#");
        map.put(2, "Java");
        map.put(3, "C++");
        map.put(40, "Python");
        map.put(100, "Go");
        
        /* for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        } */
        /* for (Integer key : map.keySet()) {
            System.out.println("Key : " + key + " Value : " + map.get(key));
        } */
        
        Collection<String> values = map.values();
        System.out.println(values);
    }
}
