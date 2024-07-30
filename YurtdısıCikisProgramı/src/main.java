
import Abstract.IAbroadRules;
import Concrete.Passenger;

public class main {
    public static void main(String[] args) {
       
        Passenger passenger ;
        
        boolean isControl = false;
        while(!isControl) {
            passenger = new Passenger();
            
            if (!passenger.isVisa()) {
                System.out.println("Vize bulunmuyor. vize yaptırınız");
                continue;
            }
            if (passenger.isPoliticalBan()) {
                System.out.println("Siyasi yasagınız var. yasak kaldırılmadan islem yapamazsınız");
                continue;
            }
            if (!passenger.isCompleteTuitionFee()) {
                System.out.println("Yurtdısı çıkış harcınız yatırılmamış. daha sonra tekrar deneyiniz");
                continue;
            }
            
            isControl = true;
            System.out.println("İslemler tamamlandı. yurtdışına çıkışınıza onay verilmiştir. iyi yolculuklar :)");
        }
    }
}
