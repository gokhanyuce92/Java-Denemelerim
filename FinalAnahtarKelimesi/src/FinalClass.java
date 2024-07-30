public class FinalClass {
    
    public static final String SERVER_NAME = "MSGOKHANYUCE";
    private final String SERVER_URL = "0.0.0.1";
    private final String PSW = "111";
    private int server_count;

    public FinalClass(int server_count) {
        this.server_count = server_count;
    }
    
    public void serverBilgileriniGetir() {
        System.out.println("Server URL = " + SERVER_URL + ", Password = " + PSW + ", Server Count = " + server_count);
    }
}
