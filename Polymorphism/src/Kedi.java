public class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        //return super.konus();
        return getIsim() + " miyavlıyor";
    }
    
}
