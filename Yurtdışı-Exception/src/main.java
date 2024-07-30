
import CustomException.CompleteFeeException;
import CustomException.PoliticalBanException;
import CustomException.VisaException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {
    public static void main(String[] args) {
       
        Passenger passenger ;
        
        boolean isControl = false;
        while(!isControl) {
            passenger = new Passenger();
            
            try {
                passenger.isVisa();
            } catch (VisaException ex) {
                ex.printStackTrace();
                continue;
            }
            
            try {
                passenger.isPoliticalBan();
            } catch (PoliticalBanException ex) {
                ex.printStackTrace();
                continue;
            }
            
            try {
                passenger.isCompleteTuitionFee();
            } catch (CompleteFeeException ex) {
                ex.printStackTrace();
                continue;
            }
            
            isControl = true;
            System.out.println("İslemler tamamlandı. yurtdışına çıkışınıza onay verilmiştir. iyi yolculuklar :)");
        }
    }
}
