public class main {
    
    public static void main(String[] args) {
        
        Character[] char_dizi = new Character[] { 'J', 'A', 'V', 'A' };
        Integer[] int_dizi = new Integer[] { 1, 2, 3, 4, 5 };
        String[] string_dizi = new String[] { "Gökhan", "Gökçe", "Kıymet", "Emin" };
        Ogrenci[] ogrenci_dizi = new Ogrenci[] { new Ogrenci("Gökhan"), new Ogrenci("Mehmet") };
        
        Yazdir<Character> yazdir_char = new Yazdir<Character>();
        Yazdir<Integer> yazdir_integer = new Yazdir<Integer>();
        Yazdir<String> yazdir_string = new Yazdir<String>();
        Yazdir<Ogrenci> yazdir_ogrenci = new Yazdir<Ogrenci>();
        
        /*yazdir_char.ekranaYaz(char_dizi);
        System.out.println("-------------");
        yazdir_integer.ekranaYaz(int_dizi);
        System.out.println("-------------");
        yazdir_string.ekranaYaz(string_dizi);
        System.out.println("-------------");
        yazdir_ogrenci.ekranaYaz(ogrenci_dizi);*/
        
        yazdir1(char_dizi);
        yazdir1(int_dizi);
        yazdir1(string_dizi);
        yazdir1(ogrenci_dizi );
    }
    
    public static <E> void yazdir1(E[] dizi) {
        for (E e : dizi) {
            System.out.println(e);
        }
    }
}
