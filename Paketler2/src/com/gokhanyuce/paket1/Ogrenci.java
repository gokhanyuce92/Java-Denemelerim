package com.gokhanyuce.paket1;

import com.gokhanyuce.paket2.IAdayOgrenci;

public class Ogrenci implements IAdayOgrenci {

    @Override
    public void dersCalis() {
        
        System.out.println("Ders çalışılıyor");
    }
    
}
