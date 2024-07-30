public class Main {
    
    public static void main(String[] args) {
   
        try {
            /*
            String s = null;
            //String s = "Gökhan";
            
            System.out.println(s.hashCode());
            */
            int a = 12 /0;
        } 
        
        catch (NullPointerException e) {
            System.out.println("Null referans hatası");
        }
        catch(ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            
            System.out.println("Finally blogu çalışıyor");
        }
        System.out.println("Burası çalışıyor");
    }
}
