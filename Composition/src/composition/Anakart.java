package composition;

public class Anakart {
    private String marka;
    private String model;
    private int cekirdekSayisi;
    private boolean aktifmi;

    public Anakart(String marka, String model, int cekirdekSayisi, boolean aktifmi) {
        this.marka = marka;
        this.model = model;
        this.cekirdekSayisi = cekirdekSayisi;
        this.aktifmi = aktifmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public void setCekirdekSayisi(int cekirdekSayisi) {
        this.cekirdekSayisi = cekirdekSayisi;
    }

    public boolean isAktifmi() {
        return aktifmi;
    }

    public void setAktifmi(boolean aktifmi) {
        this.aktifmi = aktifmi;
    }
    
    public void formatAt() {
        System.out.println("Format atma çalışacak");
    }
}
