
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("cümle giriniz : ");
        String words = scanner.nextLine();
        
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        for (int i = 0; i < words.length(); i++) {
            char harf = words.charAt(i);
            
            if (treeMap.containsKey(harf)) {
                treeMap.replace(harf, treeMap.get(harf) + 1);
            }
            else {
                treeMap.put(harf, 1);
            }
        }
        
        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            System.out.println("Harf : " + entry.getKey() + " = " + entry.getValue());
        }
        
    }
}
