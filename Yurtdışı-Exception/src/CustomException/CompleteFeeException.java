package CustomException;

public class CompleteFeeException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Harc parası yatırılmadı. Yurtdısına çıkamazsınız");
    }
    
}
