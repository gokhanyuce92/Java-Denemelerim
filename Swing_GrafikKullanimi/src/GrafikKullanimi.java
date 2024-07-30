
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GrafikKullanimi extends JPanel {

    public GrafikKullanimi() {
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.red);
        g.drawRect(100, 10, 30, 40); //x=100, y=10 koordinatta olan 30*40 boyutta içi boş dörtgen çizer
        g.fillRect(200, 100, 30, 40); //belirtilen koordinat ve boyutta içi dolu bir dörtgen çizer
        
        g.setColor(Color.blue);
        g.drawOval(200, 200, 60, 60); //200*200 koordinatta olan 60*60 lık boyutta oval çizer
        g.fillOval(300, 300, 40, 40);//belirtilen koordinat ve boyutta içi dolu bir oval çizer
        
        g.setColor(Color.yellow);
        g.drawLine(100, 100, 300, 300); //başlangıç 100*100, bitişi 300*300 olan çizgi çizer
    }
    
    
}
