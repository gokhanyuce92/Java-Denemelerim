public abstract class Sekil {
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public Sekil(String isim) {
        this.isim = isim;
    }
    
    public void hazirla() {
        System.out.println(getIsim()+ " isimli geometrik obje seçildi");
    }
    abstract  double alan_hesapla();
}
