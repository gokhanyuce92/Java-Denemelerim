
import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    
    public static void main(String[] args) {
        
        //ArrayList<String> arrayList = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        
        //Eleman Ekleme
        list.add("Java");
        list.add("C#");
        list.add("Python");
        
        /*System.out.println(list.get(0));
        System.out.println(list.get(2));*/
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        for (String s : list) {
            System.out.println(s);
        }
    }
}
