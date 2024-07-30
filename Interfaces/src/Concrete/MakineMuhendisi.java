package Concrete;

import Abstract.ICalisma;
import Abstract.IMuhendis;
import java.util.ArrayList;

public class MakineMuhendisi implements IMuhendis, ICalisma {
    
    @Override
    public boolean EhliyetDurumSorgula() {
        return false;
    }

    @Override
    public int ToplamIsTecrubesi() {
        return 5;
    }

    @Override
    public ArrayList<String> YetkinlikleriGetir() {
        ArrayList<String> yetkinlikler = new ArrayList<String>();
        yetkinlikler.add("C");
        yetkinlikler.add("Cnc Makinesi");
        yetkinlikler.add("Motor Revizyonu");
        
        return yetkinlikler;
    }

    @Override
    public boolean AdliSicilSorgula() {
        return true;
    }

    @Override
    public void Calis() {
        System.out.println("Makine mühendisi çalışıyor...");
    }
    
}
