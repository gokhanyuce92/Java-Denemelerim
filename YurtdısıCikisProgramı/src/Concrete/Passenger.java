package Concrete;

import Abstract.IAbroadRules;
import java.util.Scanner;

public class Passenger implements IAbroadRules {
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

    @Override
    public boolean isVisa() {
        return getVisaStr().equals("E");
    }

    @Override
    public boolean isPoliticalBan() {
        return getPoliticalBanStr().equals("E");
    }

    @Override
    public boolean isCompleteTuitionFee() {
        return getTuitionFeeDouble() >= 15;
    }
    
}
