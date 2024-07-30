package Concrete;

import Abstract.IMuhendis;
import java.util.ArrayList;

public class BilgisayarMuhendisi implements IMuhendis {
    
    @Override
    public boolean EhliyetDurumSorgula() {
        return true;
    }

    @Override
    public int ToplamIsTecrubesi() {
        return 7;
    }

    @Override
    public ArrayList<String> YetkinlikleriGetir() {
        ArrayList<String> yetkinlikler = new ArrayList<String>();
        yetkinlikler.add("C#");
        yetkinlikler.add("Java");
        yetkinlikler.add("VB.Net");
        yetkinlikler.add("Web Programlama");
        yetkinlikler.add("Oracle");
        
        return yetkinlikler;
    }

    @Override
    public boolean AdliSicilSorgula() {
        return false;
    }
    
}
