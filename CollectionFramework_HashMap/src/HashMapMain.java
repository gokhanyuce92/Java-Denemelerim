import java.util.Map;
import java.util.HashMap;

public class HashMapMain {
    
    public static void main(String[] args) {
        
        /*
        HashMap Sınıfı
        
        1.  Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık gelen bir tane değer bulunur.
        2.  Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
        3.  Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)
        */
        
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("+1", "USA");
        hashmap.put("+91", "India");

        hashmap.get("+1"); // returns "USA"
        hashmap.get("+2"); // returns null
       
        
        /* for (String key : hashmap.keySet()) {

            System.out.println("Key: " + key);
            System.out.println("Value: " + hashmap.get(key));
          }

        for (Map.Entry<String, String> entry : hashmap.entrySet()) {

          System.out.println("Key: " + entry.getKey());
          System.out.println("Value: " + entry.getValue());
        } 
        hashmap.forEach((key, value) -> System.out.println(key + ": " + value)); 
        */
        
    }
}
