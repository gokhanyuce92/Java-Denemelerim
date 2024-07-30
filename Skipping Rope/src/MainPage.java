
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class MainPage extends JFrame {

    public MainPage(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        MainPage main = new MainPage("İp Atlama Oyunu");
        
        main.setFocusable(false);
        main.setResizable(false);
        main.setSize(800, 300);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Game game = new Game();
        
        game.requestFocus();
        game.addKeyListener(game);
        game.setFocusable(true);
        game.setFocusTraversalKeysEnabled(false);
        
        main.add(game);
        main.setVisible(true);
    }
}
