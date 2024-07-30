import CustomException.CompleteFeeException;
import CustomException.PoliticalBanException;
import CustomException.VisaException;
import java.util.Scanner;

public class Passenger {
    private String visaStr;
    private String politicalBanStr;
    private double tuitionFeeDouble;
    
    public Passenger() {
        String _visa, _politicalBan;
        double _fee;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize varmı? (E/H): ");
        _visa = scanner.nextLine();
        visaStr = _visa.toUpperCase();
        System.out.print("Siyasi yasak varmı? (E/H): ");
        _politicalBan = scanner.nextLine();
        politicalBanStr = _politicalBan.toUpperCase();
        System.out.print("Harç bedelini giriniz: ");
        _fee = scanner.nextDouble();
        scanner.nextLine();
        tuitionFeeDouble = _fee;
    }

    public String getVisaStr() {
        return visaStr;
    }

    public String getPoliticalBanStr() {
        return politicalBanStr;
    }

    public double getTuitionFeeDouble() {
        return tuitionFeeDouble;
    }

    public void isVisa() throws VisaException {
        if (getVisaStr().equals("E") == false) {
            throw new VisaException();
        }
        else {
            System.out.println("Vize tamam");
        }
    }

    public void isPoliticalBan() throws PoliticalBanException {
        if (getPoliticalBanStr().equals("E")) {
            throw new PoliticalBanException();
        }
        else {
            System.out.println("Siyasi yasak bulunmuyor. Devam edebilirsiniz");
        }
    }
    
    public void isCompleteTuitionFee() throws CompleteFeeException {
        if (getTuitionFeeDouble() < 15) {
            throw new CompleteFeeException();
        }
        else {
            System.out.println("Harc bedeli yatırıldı");
        }
    }
    
}
