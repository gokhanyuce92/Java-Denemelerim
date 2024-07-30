public class main {
    
    public static void main(String[] args) {
        
        String a = "Gökhan";
        String b = new String("Gökhan"); //böylede kullanım var
        
        System.out.println("Harf Sayısı: " + a.length());
        System.out.println("0. indeks: " + a.charAt(0));
        System.out.println("2. indeks: " + a.charAt(2));
        System.out.println("Son eleman: " + a.charAt(a.length() - 1));
        System.out.println(a.startsWith("Gö")); //Gö ile mi başlıyor ise true, değilse false
        System.out.println(a.endsWith("an")); //an ile mi bitiyor ise true değilse false
        System.out.println(a.indexOf('h')); //h elemanı kaçıncı indeks oldugunu döner harf yoksa -1 döner
        System.out.println("Küçük harfe dönüştür: " + a.toLowerCase());
        System.out.println("Büyük harfe dönüştür: " + a.toUpperCase());
        
        String a1 = "1923";
        int b1 = Integer.parseInt(a1); //int e dönüştürme
        String a2 = String.valueOf(b1); //string e dönüştürme
        
        
    }
}
