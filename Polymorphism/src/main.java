public class main {
    
    public static void main(String[] args) {
        /*Hayvan hayvan = new Hayvan("dasda");
        Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabaş");
        
        System.out.println(hayvan.konus());
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());*/
        
        /*konustur(new Hayvan("asdfgh"));
        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Karabaş"));*/
        
        konustur(new Kopek("Karabaş"));
        konustur(new Kedi("Tekir"));
        konustur(new Hayvan("Limon"));
    }
    
    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }
    /*public static void konustur(Object object) { //Polymorphism olmasaydı böyle her class icin kontrol etmemiz gerekirdi
        //instanceof
        if (object instanceof Kedi) {
            Kedi kedi = (Kedi)object;
            System.out.println(kedi.konus());
        }
        else if(object instanceof Kopek) {
            Kopek kopek = (Kopek)object;
            System.out.println(kopek.konus());
        }
        else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan)object;
            System.out.println(hayvan.konus());
        }
    }*/
}
