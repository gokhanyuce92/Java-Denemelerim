
import java.io.Serializable;

public class Ogrenci  implements Serializable {
    private int id;
    private String isim;
    private String bolum;

    public Ogrenci(int id, String isim, String bolum) {
        this.id = id;
        this.isim = isim;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Id = " + id + "\n" +
                "İsim = " + isim + "\n" +
                "Bölüm = " + bolum; 
    }
}
