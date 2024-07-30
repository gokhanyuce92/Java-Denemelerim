public class main {
    
    public static void main(String[] args) {
        /*
        1. Static olmayan inner classlar
        2. Static inner classlar
        3. Local(yerel) inner classlar
        4. Anonymous(anonim) inner classlar
        */
        
        //static olmayan inner class kullanımı
         Matematik.Factorial factorial = new Matematik().new Factorial();
         Matematik.Asal asal = new Matematik().new Asal();
         Matematik.Alan.Daire alan = new Matematik().new Alan().new Daire();
         
         factorial.Hesapla();
         System.out.println(asal.Asalmi(5));
         alan.daire_alan_hesapla(4);
    }
}
