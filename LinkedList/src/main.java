
import java.util.LinkedList;
import java.util.ListIterator;

public class main {
    
    public static void main(String[] args) {
        
        //Linked list, array listlere göre performans olarak daha hızlıdır
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();
        
        sirali_ekle(gidilecek_yerler, "Postane");
        sirali_ekle(gidilecek_yerler, "Market");
        sirali_ekle(gidilecek_yerler, "Ev");
        
        listeyi_bastir(gidilecek_yerler);
        
        /*gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");
        
        listeyi_bastir(gidilecek_yerler);
        System.out.println("----------------------------");
        gidilecek_yerler.add(3,"Alışveriş merkezi");
        
        listeyi_bastir(gidilecek_yerler);
        */
    }
    
    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {
        //for döngüsü ile kullanım
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        
        //foreach kullanım
        /*for (String str : list) {
            System.out.println(str);
        }*/
        
        //iteratorlu kullanım
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni) {
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while (iterator.hasNext()) {            
            int karsilastir = iterator.next().compareTo(yeni);
            
            if (karsilastir == 0) {
                //iki değer eşit
                System.out.println("Listenizde bu eleman zaten var");
                return;
            }
            else if(karsilastir < 0) {
                //yeni değer iterator.next ten daha büyük
                
            }
            else if(karsilastir > 0) {
                //yeni değer iterator.next ten daha küçük
                iterator.previous();
                iterator.add(yeni);
                
                return;
            }
        }
        gidilecek_yerler.add(yeni);
    }
    
}
