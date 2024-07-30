package composition;

public class Bilgisayar {
    private Monitor monitor;
    private Anakart anakart;

    public Bilgisayar(Monitor monitor, Anakart anakart) {
        this.monitor = monitor;
        this.anakart = anakart;
    }
    
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }
}
