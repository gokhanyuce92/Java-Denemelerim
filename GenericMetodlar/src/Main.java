public class Main {
    
    public static void main(String[] args) {
        
        Sayisal sayisal1 = new Sayisal(40, 90, 70, 70, 80);
        Sayisal sayisal2 = new Sayisal(30, 60, 100, 100, 90);
        
        EsitAgirlik esitAgirlik1 = new EsitAgirlik(90, 100, 60, 60, 50);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(80, 80, 40, 60, 50);
        
        Sayisal birinciSayisal = birinciGetir(sayisal1, sayisal2);
        EsitAgirlik birinciEsitAgirlik = birinciGetir(esitAgirlik1, esitAgirlik2);
        
        System.out.println("Sayısal birinci: " + birinciGetir(sayisal1, sayisal2).puan_hesapla());
        System.out.println("Eşit ağırlık birinci: " + birinciGetir(esitAgirlik1, esitAgirlik2).puan_hesapla());
    }
    
    public static Sayisal birinci(Sayisal s1, Sayisal s2) {
        if (s1.puan_hesapla() >= s2.puan_hesapla()) {
            return s1;
        }
        return s2;
    }
    
    //generic method sample
    public static <E extends Aday> E birinciGetir(E e1, E e2) {
        if (e1.puan_hesapla() >= e2.puan_hesapla()) {
            return e1;
        }
        return e2;
    }
}
