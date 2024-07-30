public class main {
    
    public static void main(String[] args) {
        
        Sekil sekil = new Kare("Kare1", 4);
        Sekil sekil1 = new Daire("Daire1", 2);
        
        sekil.hazirla();
        sekil1.hazirla();
        
        System.out.println("Karenin alanı: " + sekil.alan_hesapla());
        System.out.println("Dairenin alanı: " + sekil1.alan_hesapla());
    }
}
