
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ziplama {
    private int x;
    private int y;

    public Ziplama(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Game extends JPanel implements KeyListener, ActionListener {
    Timer timer = new Timer(5, this);

    private int ziplama_sayisi = 0;
    private ArrayList<Ziplama> ziplamalar = new ArrayList<Ziplama>();
    private BufferedImage image;
    private int topX = 0;
    private int topdirX = 2;
    private int adamY = 120;
    private int adamdirY = 80;

    public Game() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("adam.png")));
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setBackground(Color.white);
        
        timer.start();
    }
    
    public boolean kontrolEt() {
        for (Ziplama ziplama : ziplamalar) {
            System.out.println("ziplama.getX() : " + ziplama.getX() + " ziplama.getY() : " + ziplama.getY() + " topX : " + topX);
            if (new Rectangle(ziplama.getX(), 120, 10, 20).intersects(new Rectangle(topX, 120, 20, 20))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.red);
        g.fillOval(topX, 236, 20, 20);

        g.drawImage(image, 320, adamY, image.getWidth() / 4, image.getHeight() / 4, this);   
        
        if (kontrolEt()) {
            timer.stop();
            String message = "Kazandınız...\n" +
                    "Zıplama Sayısı : " + ziplama_sayisi;
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
        }
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_SPACE) {
            adamY -= adamdirY;
            
            ziplamalar.add(new Ziplama(320, adamY));
            ziplama_sayisi++;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        adamY += adamdirY;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        topX += topdirX;
        
        if (topX >= 776) {
            topdirX = -topdirX;
        }
        
        if (topX <= 0) {
            topdirX = -topdirX;
        }

        if (adamY >= 120) {
            adamY = 120;
        }
        
        if (adamY <= 0) {
            adamY = 0;
        }
        
        repaint();
    }
    
}
