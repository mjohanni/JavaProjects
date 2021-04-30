import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GamePanel panel;

    public GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("PINGPONG GAME!!!!");
        this.setResizable(false);
        this.setBackground(Color.darkGray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
