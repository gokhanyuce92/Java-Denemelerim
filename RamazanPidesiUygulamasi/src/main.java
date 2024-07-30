
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class main {
    
    public static void main(String[] args) {
        
        Queue<String> pideKuyrugu = new LinkedList<String>();
        Random random = new Random();
        
        pideKuyrugu.offer("İlker");
        pideKuyrugu.offer("Recep");
        pideKuyrugu.offer("Özgür");
        pideKuyrugu.offer("Gökhan");
        pideKuyrugu.offer("Fatih");
        pideKuyrugu.offer("Yasin");
        pideKuyrugu.offer("Yusuf");
        pideKuyrugu.offer("Onur");
        pideKuyrugu.offer("Baki");
        pideKuyrugu.offer("Cüneyt");
        
        int pide_sayisi = 1+ random.nextInt(10);
        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan pide sayısı : " + pide_sayisi);
        
        while (pide_sayisi > 0) {         
            System.out.println(pideKuyrugu.poll() + " pidesini aldı");
            pide_sayisi--;
        }
        System.out.println("Pide kalmadı...");
    }
}
