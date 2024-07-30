package CustomException;

public class PoliticalBanException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasak bulunuyor. Yurtdısına çıkamazsınız");
    }
    
}
