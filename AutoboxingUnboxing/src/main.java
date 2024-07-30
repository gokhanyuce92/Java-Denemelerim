
import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {
        
        //ArrayList<int> arrayList = new ArrayList<int>(); //hata ilkel veri tipleri yerine wrapper class lar kullanılmalı
        
        /*
        Wrapper Class
        
        boolean  ---------->  Boolean
        char ----------------> Character
        byte ----------------> Byte
        short ---------------> Short
        int ------------------> Integer
        long ----------------> Long
        float ----------------> Float
        double -------------> Double
        */
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        /* autoboxing ve unboxing i otomatik java yapıyor bizim böyle yapmamıza gerel yok. asagıdaki kodda çalışır
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.valueOf(i*4)); //Autoboxing
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).intValue()); //Unboxing
        }
        */
        
        for (int i = 0; i < 10; i++) {
            arrayList.add(i*4); 
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)); 
        }
        
    }
}
