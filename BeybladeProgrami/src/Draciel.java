public class Draciel extends Beyblade {
    private String kutsalCanavarAdi;
    
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavarAdi) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavarAdi = kutsalCanavarAdi;
    }

    public String getKutsalCanavarAdi() {
        return kutsalCanavarAdi;
    }

    public void setKutsalCanavarAdi(String kutsalCanavarAdi) {
        this.kutsalCanavarAdi = kutsalCanavarAdi;
    }

    @Override
    public void KutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + getSaldiriGucu() + " saldırı gücünde, " + getDonusHizi() + " hızıyla saldırmaktadır");
    }

    @Override
    public void BilgileriGetir() {
        super.BilgileriGetir();
        System.out.println("Kutsal Canavar Adı = " + kutsalCanavarAdi);
    }
    
}
