public class Main {
    public static void main(String[] args) {
        
        System.out.println("1 DEN 100 E KADAR OLAN LASA SAYILAR");
        System.out.println("***********************************");
        for (int i = 1; i <= 100; i++) {
            if (lasaSayimi(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean asalSayimi(int number) {
        int i = 2;
        if (number < 2) {
            return false;
        }
        while(i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    
    //Lasa sayi, sayinin kendisi asal ve tersten yazıldığında oluşan sayi da asal ise lasa sayidir.
    public static boolean lasaSayimi(int number) {
        if (asalSayimi(number)) {
            if (asalSayimi(sayininTersi(number))) {
                return true;
            }
        }
        return false;
    }
    public static int sayininTersi(int number) {
        int new_num = 0;
        int last_digit = 0;
        while(number > 0) {
            last_digit = number % 10;
            new_num = new_num * 10 + last_digit;
            number /= 10;
        }
        return new_num;
    }
}
