
import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {
   
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("Metallica");
        arrayList.add("Guns' n Roses");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");
        arrayList.add("Metallica");
        
        //arrayList.remove("Guns' n Roses"); //değerle silme kullanımı
        //arrayList.remove(1); //indeksle silme kullanımı
        
        //System.out.println(arrayList.get(0)); //0.indeksin değerini döndürür
        //System.out.println(arrayList.get(5)); //ındex out of bound hatası
        //System.out.println(arrayList.size()); //array list eleman sayısını döndürür
        //System.out.println(arrayList.indexOf("Metallica")); //eşleştirdiği değerle baştan 0.indeksten başlayarak gördüğü ilk indeks değerini döndürür
        //System.out.println(arrayList.lastIndexOf("Metallica")); //eşleştirdiği değerle sondan başlayarak gördüğü ilk indeks değerini döndürür
        //System.out.println(arrayList.lastIndexOf("Dream")); //olmayan bir değer için -1 döndürür
        //arrayList.set(4, "Megadeth"); //4.indeksteki değeri verilen değerle günceller
        
        printList(arrayList);
    }
    
    public static void printList(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Element " + (i+1) + ": " + arr.get(i));
        }
    }
}
