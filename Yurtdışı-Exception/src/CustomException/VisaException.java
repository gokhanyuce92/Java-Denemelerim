package CustomException;

public class VisaException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Vize bulunmuyor");
    }
    
}
