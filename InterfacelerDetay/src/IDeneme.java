public interface IDeneme {
    
    //private int a = 5; //private access modifier kullanılamaz
    public int a = 5; // static olarak tanımlanmamasına karsın static gibi davranır. interfacelerden object üretilmedigi icin IDeneme.a olarak cagırılabilir
    public static String deneme = "Deneme";
    public final int b = 10;
    
    //static veya final tanımlamamıza gerek yok public int a = 5 olarak tanımlanması da aynı işlevi görüyor
    
    public static void deneme() {  //interfaceler de metot calıstırmak icin static anahtar kelimesi kullanılmalıdır
        System.out.println("Deneme çalıştı");
    }
}
