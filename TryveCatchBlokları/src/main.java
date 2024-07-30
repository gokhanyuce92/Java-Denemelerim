public class main {
    
    public static void main(String[] args) {
        
        try {
            int b = 10/0;
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
            
        } 
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayin boyutunu aştınız");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Burası çalışıyor");
}
}
