import javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
            JFrame f= new JFrame();
            f.setTitle("Snake Game");
            f.setBounds(10,10,905,700);
            f.setResizable(false);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setBackground(Color.DARK_GRAY);

            Game_play game_play = new Game_play();
            f.add(game_play);
       }
    }
