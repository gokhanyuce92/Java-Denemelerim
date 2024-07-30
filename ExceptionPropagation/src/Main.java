public class Main {
    
    public static void main(String[] args) {
        birinci();
    }
    
    public static void birinci() {
        ikinci();
    }
    public static void ikinci() {
        try {
            ucuncu();
        } 
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void ucuncu() {
        int a = 12 / 0;
    }
}
