package composition;

public class Composition {

    public static void main(String[] args) {
        //Bilgisayar pc = new Bilgisayar(new Monitor("1920","1080"), new Anakart("Intel", "i5", 4, true));
        //veya
        Monitor monitor = new Monitor("1920", "1080");
        Anakart anakart = new Anakart("Intel", "i5", 8, true);
       Bilgisayar pc = new Bilgisayar(monitor, anakart);
        
        pc.getMonitor().ekraniAc();
        pc.getAnakart().formatAt();
    }
    
}
