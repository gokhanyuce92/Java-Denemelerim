package com.gokhanyuce.matematik;

public class Matematik implements IMatematik {

    @Override
    public void topla(int a, int b) {
        System.out.println("Toplama = " + (a+b));
    }

    @Override
    public void cikar(int a, int b) {
        System.out.println("Cikarma = " + (a-b));
    }

    @Override
    public void carp(int a, int b) {
        System.out.println("Carpma = " + (a*b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bölme = " + (double)a/b);
    }
    
}
