public class Kopek extends Hayvan {
    
    public Kopek(String isim) {
        super(isim);
    }
    
    @Override
    public String konus() {
        return getIsim() + " havlıyor";
    }
}
